package com.experts.core.biller.statemachine.api.security.encrypt;

import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.*;
import java.security.*;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Enumeration;

@Component
public class GenerateAndVerifySignature {
    private static final Logger LOGGER = LoggerFactory.getLogger(GenerateAndVerifySignature.class.getName());
    private static final String jksPath = "C:/jks/biller_core_keystore.jks", jksPassword = "opc@2018";
    public static String generateSignature(String requestBody)
            throws Exception {
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        PrivateKey privateKeyMFEP = getPrivateKey("certificate.pfx");// MFEP.pfx
        byte[] requestBodyByte = requestBody.trim().getBytes("UTF-16LE");
        byte[] digitalSignature = signData(requestBodyByte, privateKeyMFEP);
        // digitalSignatureBase64 = digitalSignatureBase64.replaceAll("\\s+", "");
        return new String(Base64.encodeBase64(digitalSignature)).trim();
    }

    private static byte[] signData(byte[] data, PrivateKey key) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");// SHA1withDSA  // SHA256withRSA
        signer.initSign(key);
        signer.update(data);
        return (signer.sign());
    }

    private static boolean verifySig(byte[] data, PublicKey key, byte[] sig) throws Exception {
        Signature signer = Signature.getInstance("SHA256withRSA");
        signer.initVerify(key);
        signer.update(data);
        return (signer.verify(sig));

    }

    private static PrivateKey getPrivateKey(String certificatePath) throws IOException, KeyStoreException, NoSuchAlgorithmException, CertificateException, UnrecoverableKeyException {
        KeyStore keyStore = KeyStore.getInstance("JKS");
        boolean isAliasWithPrivateKey = false;
        keyStore.load(new FileInputStream(jksPath), jksPassword.toCharArray());
        Enumeration<String> es = keyStore.aliases();
        // Information for certificate to be generated
        String password = "opc@2018"; // .PFX Password
        String alias = "alias-name"; // .PFX Alias
        String aliasO = "";
        while (es.hasMoreElements()) {
            alias = (String) es.nextElement();
            // if alias refers to a private key break at that point
            // as we want to use that certificate
            if (isAliasWithPrivateKey = keyStore.isKeyEntry(alias)) {
                break;
            }
        }
        PrivateKey key = null;
        key = (PrivateKey) keyStore.getKey(alias, password.toCharArray());
        return key;
    }

    public static boolean verifyRequestSignature(String requestBody, String requestSignature) {
        Boolean result = false;
        try {
            byte[] requestBodyByte = requestBody.trim().getBytes("UTF-16LE");//
            PublicKey publicKey = getPublicKey("biller.cer");
            result = verify(requestSignature, requestBodyByte, publicKey);
        } catch (Exception e) {
            LOGGER.error("unable to verify signature [{}], [{}]", requestBody, requestSignature);
        }
        return result;
    }

    private static PublicKey getPublicKey(String certificatePath) throws FileNotFoundException, CertificateException, IOException {
        PublicKey pk = null;
        FileInputStream fin = null;
        try {
            fin = new FileInputStream("D:/certs/"+certificatePath);
            CertificateFactory f = CertificateFactory.getInstance("X.509");
            X509Certificate certificate = (X509Certificate) f.generateCertificate(fin);
            pk = certificate.getPublicKey();
        } finally {
            if (fin != null) {
                fin.close();
            }
        }
        return pk;
    }

    private static boolean verify(String requestSignature, byte[] RequestBodyByte, PublicKey publicKey) throws FileNotFoundException, CertificateException, IOException, Exception {
        boolean verified;
        byte[] dencode64Signature = Base64.decodeBase64(requestSignature.trim());
        byte[] dencode64Signature2;
        verified = verifySig(RequestBodyByte, publicKey, dencode64Signature); // Verify Madfooatcom Public Key
        return verified;
    }
}