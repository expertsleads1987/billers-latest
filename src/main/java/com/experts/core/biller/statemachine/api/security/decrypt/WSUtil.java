package com.experts.core.biller.statemachine.api.security.decrypt;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringReader;
import java.security.KeyStore;
import java.security.Provider;
import java.security.PublicKey;
import java.security.cert.X509Certificate;

import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMValidateContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;


public class WSUtil {
   private static final String KEYSTORE_FILE = "biller_core_keystore.jks";
   private static final String KEYSTORE_INSTANCE = "JKS";
   private static final String KEYSTORE_PWD = "opc@2018";
   private static final String KEYSTORE_ALIAS = "mykey";

    private static final String keystoreFile = "biller_core_keystore.jks";
    private static final String keyStorePassword = "opc@2018";
    private static final String alias = "mykey";

    public static boolean  verify(String req) throws Exception {


        Document p = createXMLDocument(req);
        InputStream inStream = new FileInputStream(keystoreFile);

        KeyStore ks = KeyStore.getInstance(KEYSTORE_PWD);
        ks.load(inStream,keyStorePassword.toCharArray());

        String alias = ks.aliases().nextElement();
        X509Certificate certificate = (X509Certificate) ks.getCertificate(alias);

     return   validateSignature(p.getElementsByTagName("ds:Signature").item(0),p.getElementsByTagName("soapenv:Body").item(0),certificate.getPublicKey());//True if the message is valid
    }

    public static Document createXMLDocument(String xmlString) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        DocumentBuilder builder;
        Document document = null;
        try {
            builder = factory.newDocumentBuilder();
            document = builder.parse(new InputSource(
                    new StringReader(xmlString)));
        } catch (Exception e) {
            throw e;
        }
        return document;
    }

    private static boolean validateSignature(Node signatureNode, Node bodyTag, PublicKey publicKey) {
        boolean signatureIsValid = false;
        try {

            String providerName = System.getProperty("jsr105Provider", "org.jcp.xml.dsig.internal.dom.XMLDSigRI");
            XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM", (Provider) Class.forName(providerName).newInstance());

            DOMValidateContext valContext = new DOMValidateContext(new X509KeySelector(publicKey), signatureNode);
            valContext.setIdAttributeNS((Element) bodyTag, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");

            XMLSignature signature = fac.unmarshalXMLSignature(valContext);
            signatureIsValid = signature.validate(valContext);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return signatureIsValid;
    }
}