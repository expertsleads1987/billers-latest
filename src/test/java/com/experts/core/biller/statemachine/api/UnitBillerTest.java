package com.experts.core.biller.statemachine.api;

import com.experts.core.biller.statemachine.api.contextreg.BillerContextResolver;
import generated.biller.experts.api.wsdl.pull.BillPullResponseDTO;
import generated.biller.experts.api.wsdl.pull.BillPullServiceRequest;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ssl.NoopHostnameVerifier;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.test.server.MockWebServiceClient;
import org.springframework.ws.transport.http.HttpComponentsMessageSender;
import org.springframework.ws.transport.http.HttpComponentsMessageSender.RemoveSoapHeadersInterceptor;
import org.springframework.ws.transport.http.HttpsUrlConnectionMessageSender;
import org.springframework.xml.transform.StringSource;

import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManagerFactory;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import javax.xml.ws.Service;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.URL;
import java.security.KeyStore;

import static org.springframework.ws.test.server.RequestCreators.withPayload;
import static org.springframework.ws.test.server.ResponseMatchers.payload;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = VersioningApplication.class)
@WebAppConfiguration
@ImportResource("classpath:application.properties")
public class UnitBillerTest  {


    @Value("http://192.168.10.91:3070/ws/BillPullRequest/billpull")
    private String defaultUri;

    @Value("${client.ssl.trust-store}")
    private Resource trustStore;

    @Value("${client.ssl.trust-store-password}")
    private String trustStorePassword;

    @Value("${client.ssl.key-store}")
    private Resource keyStore;

    @Value("${client.ssl.key-store-password}")
    private String keyStorePassword;

    @Value("${client.ssl.key-password}")
    private String keyPassword;

    private MockWebServiceClient mockClient;

    @Autowired
    private ApplicationContext applicationContext;

    @Before
    public void createClient() {
        mockClient = MockWebServiceClient.createClient(applicationContext);
    }

    @Autowired
    private WebServiceTemplate webServiceTemplate;


    @Bean
    public HttpsUrlConnectionMessageSender httpsUrlConnectionMessageSender() throws Exception {

        KeyStore ks = KeyStore.getInstance("JKS");
        ks.load(keyStore.getInputStream(), keyStorePassword.toCharArray());


        try {
            keyStore.getInputStream().close();
        } catch (IOException e) {
        }
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(ks, keyStorePassword.toCharArray());

        KeyStore ts = KeyStore.getInstance("JKS");
        ts.load(trustStore.getInputStream(), trustStorePassword.toCharArray());

        try {
            trustStore.getInputStream().close();
        } catch(IOException e) {
        }
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(ts);

        HttpsUrlConnectionMessageSender messageSender = new HttpsUrlConnectionMessageSender();
        messageSender.setKeyManagers(keyManagerFactory.getKeyManagers());
        messageSender.setTrustManagers(trustManagerFactory.getTrustManagers());

        // otherwise: java.security.cert.CertificateException: No name matching localhost found
        messageSender.setHostnameVerifier((hostname, sslSession) -> {
            if (hostname.equals("localhost")) {
                return true;
            }
            return false;
        });



        return messageSender;
    }

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("generated.biller.experts.api.wsdl.pull");
        marshaller.setPackagesToScan("generated.biller.experts.api.wsdl.pull");
        marshaller.setClassesToBeBound(new Class[]{

                generated.biller.experts.api.wsdl.pull.BillPullResponseDTO.class,
                generated.biller.experts.api.wsdl.pull.BillPullServiceResponse.class,
                generated.biller.experts.api.wsdl.pull.BillPullServiceRequest.class,

        });
        return marshaller;
    }

    @Bean
    public SOAPConnector soapConnector(Jaxb2Marshaller marshaller) {
        SOAPConnector client = new SOAPConnector();
        client.setDefaultUri("http://192.168.10.91:3070/ws/BillPullRequest/billpull");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

    @Bean
    public WebServiceTemplate webServiceTemplate(Jaxb2Marshaller jaxb2Marshaller) throws Exception {
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(jaxb2Marshaller);
        webServiceTemplate.setUnmarshaller(jaxb2Marshaller);
        webServiceTemplate.setDefaultUri("http://192.168.10.91:3070/ws/BillPullRequest/billpull");
        webServiceTemplate.setMessageSender(httpsUrlConnectionMessageSender());
        return webServiceTemplate;
    }

    @Bean
    public HttpComponentsMessageSender httpComponentsMessageSender() throws Exception {
        HttpComponentsMessageSender httpComponentsMessageSender = new HttpComponentsMessageSender();
        httpComponentsMessageSender.setHttpClient(httpClient());

        return httpComponentsMessageSender;
    }

    public HttpClient httpClient() throws Exception {
        DefaultHttpClient defaultClient = new DefaultHttpClient(new ThreadSafeClientConnManager());
        defaultClient.removeRequestInterceptorByClass(org.apache.http.protocol.RequestContent.class);

        defaultClient.addRequestInterceptor(new RemoveSoapHeadersInterceptor(), 0);
        return defaultClient;
    }

    public SSLConnectionSocketFactory sslConnectionSocketFactory() throws Exception {
        
        return new SSLConnectionSocketFactory(sslContext(), NoopHostnameVerifier.INSTANCE);
    }

    public SSLContext sslContext() throws Exception {
        return SSLContextBuilder.create()
                .loadKeyMaterial(keyStore.getFile(), keyStorePassword.toCharArray(),
                        keyPassword.toCharArray())
                .loadTrustMaterial(trustStore.getFile(), trustStorePassword.toCharArray()).build();
    }


    @Bean
    @Primary
    public BillerContextResolver contextResolver(){
        return new BillerContextResolver();
    }

    @Test
    public void simpleSendAndReceive() throws Exception {
        BillPullServiceRequest request =  new BillPullServiceRequest();

        request.setAcctInfo("Tests");
        request.setAddress("Ramallah");
        request.setBillingNo("1254987");
        request.setBillNo("21548");
        request.setId("120");
        request.setEmail("yousef.ataya@experts.ps");
        request.setBillNo("1236985GH");
        request.setIdType("Num");
        request.setName("ATAYA");
        request.setJoebppsno("123456789");
        request.setNation("PALESTINE");
        request.setPayerInfo("RAMALLAH");
        request.setPhone("0592066680");




        /*URL url = new URL("http://192.168.10.91:3070/ws/BillPullRequest/billpull");

        //1st argument service URI, refer to wsdl document above
        //2nd argument is service name, refer to wsdl document above
        QName qname = new QName("http://experts.ps/billpull", "BillPullServiceRequest");

        Service service = Service.create(url, qname);

        Object obj = service.getPort(BillPullServiceRequest.class);*/



        HttpPost post = new HttpPost("http://192.168.10.91:3070/ws/BillPullRequest/billpull");
        post.setProtocolVersion(new ProtocolVersion("HTTP", 1, 0));

        // trying to remove default headers but it doesn't work
        post.removeHeaders("User-Agent");
        post.removeHeaders("Accept-Encoding");
        post.removeHeaders("content-lengtg");
        post.removeHeaders("Connection");

        HttpEntity entity = new StringEntity(jaxbObjectToXMLPull(request));

        post.setEntity(entity);


        HttpResponse response = httpClient().execute(post);
    }

    private static String jaxbObjectToXMLPull(BillPullServiceRequest customer) throws Exception {
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(BillPullServiceRequest.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(customer, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }


    private static String jaxbObjectToXMLResult(BillPullResponseDTO customer) throws Exception {
        String xmlString = "";
        try {
            JAXBContext context = JAXBContext.newInstance(BillPullResponseDTO.class);
            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE); // To format XML

            StringWriter sw = new StringWriter();
            m.marshal(customer, sw);
            xmlString = sw.toString();

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return xmlString;
    }
}