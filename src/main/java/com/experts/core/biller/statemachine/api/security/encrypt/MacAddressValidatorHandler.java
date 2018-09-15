package com.experts.core.biller.statemachine.api.security.encrypt;

import org.dom4j.dom.DOMDocument;
/*import org.jcp.xml.dsig.internal.dom.DOMUtils;*/
import org.springframework.stereotype.Component;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.cert.X509Certificate;
import java.security.spec.RSAPublicKeySpec;
import java.util.*;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.crypto.dsig.*;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.soap.Node;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPMessage;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.ws.handler.LogicalMessageContext;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.soap.SOAPFaultException;

@Component("macAddressValidatorHandler")
public class MacAddressValidatorHandler {


    private static final String jksPath = "C:/jks/biller_core_keystore.jks", jksPassword = "opc@2018";
    private volatile String message;
    private PrivateKey privateKey;
    private volatile XMLSignature signature;
    private volatile DOMSignContext dsc = null;
    private volatile org.w3c.dom.Element header = null;
    private Cipher cipher;
    private PrivateKey myPrivateKey;
    private String xmlString;
    public final String sigin(String smc) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        boolean isAliasWithPrivateKey = false;
        System.out.println(smc);
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputStream stream = new ByteArrayInputStream(smc.getBytes(StandardCharsets.UTF_8));

            org.w3c.dom.Document document = db.parse(stream);

            CertificateDetails certificateDetails = SOAPSecurityHandler.getCertificateDetails(jksPath, jksPassword);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            DOMSource sourceDom = new DOMSource(document);

            org.w3c.dom.Node root = null;

            /*InputStream in = this.getClass().getClassLoader().getResourceAsStream(KEYSTORE_FILE);*/
            /*XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");*/

/*
            Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null), Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)), null, null);
*/

            /*SignedInfo si = fac.newSignedInfo
                    (fac.newCanonicalizationMethod
                                    (CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
                                            (C14NMethodParameterSpec) null),
                            fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                            Collections.singletonList(ref));*/
            KeyStore keyStore = KeyStore.getInstance("JKS");
            keyStore.load(new FileInputStream(jksPath), jksPassword.toCharArray());
            Enumeration<String> es = keyStore.aliases();
            String alias = "";
            while (es.hasMoreElements()) {
                alias = (String) es.nextElement();
                // if alias refers to a private key break at that point
                // as we want to use that certificate
                if (isAliasWithPrivateKey = keyStore.isKeyEntry(alias)) {
                    break;
                }
            }

                X509Certificate cert = (X509Certificate) certificateDetails.getX509Certificate();

                KeyPair pair = new KeyPair(cert.getPublicKey() , myPrivateKey);

                Key key = keyStore.getKey(alias, "opc@2018".toCharArray());


                /*Cipher cipher = Cipher.getInstance("RSA");
                cipher.init(Cipher.ENCRYPT_MODE, (PrivateKey)key);*/


            DOMSignContext dsc = new DOMSignContext ((PrivateKey)key, document.getDocumentElement());
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");

            Reference ref = fac.newReference ("", fac.newDigestMethod(DigestMethod.SHA1, null),
                    Collections.singletonList
                            (fac.newTransform(Transform.ENVELOPED,
                                    (TransformParameterSpec) null)), null, null);

            SignedInfo si = fac.newSignedInfo
                    (fac.newCanonicalizationMethod
                                    (CanonicalizationMethod.INCLUSIVE_WITH_COMMENTS,
                                            (C14NMethodParameterSpec) null),
                            fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null),
                            Collections.singletonList(ref));

            KeyInfoFactory kif = fac.getKeyInfoFactory();
            KeyValue kv = kif.newKeyValue(cert.getPublicKey());
            KeyInfo ki = kif.newKeyInfo(Collections.singletonList(kv));

            XMLSignature signature = fac.newXMLSignature(si, ki);

            signature.sign(dsc);

            TransformerFactory transfac = TransformerFactory.newInstance();
            Transformer trans = transfac.newTransformer();
            trans.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");
            trans.setOutputProperty(OutputKeys.VERSION, "1.0");
            trans.setOutputProperty(OutputKeys.INDENT, "yes");

            //CREAR STRING DEL ARBOL XML
            StringWriter sw = new StringWriter();
            StreamResult result = new StreamResult(sw);
            DOMSource source = new DOMSource(document);
            trans.transform(source, result);
             xmlString = sw.toString();
            System.out.println(xmlString);


        } catch (Exception e) {
            e.printStackTrace();
        }



        /*return cipher.doFinal(smc.getBytes());*/
         return xmlString;
    }


}