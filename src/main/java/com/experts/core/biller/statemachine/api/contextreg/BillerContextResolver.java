package com.experts.core.biller.statemachine.api.contextreg;

import generated.biller.experts.api.wsdl.pull.BillPullResponseDTO;
import generated.biller.experts.api.wsdl.pull.BillPullServiceRequest;
import generated.biller.experts.api.wsdl.pull.BillPullServiceResponse;


import java.io.*;
import java.util.*;
import javax.ws.rs.Produces;
import javax.ws.rs.ext.*;
import javax.xml.bind.*;


import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

@Provider
@Produces({ org.springframework.http.MediaType.APPLICATION_JSON_VALUE, org.springframework.http.MediaType.APPLICATION_XML_VALUE })
public class BillerContextResolver implements ContextResolver<JAXBContext> {
    private JAXBContext ctx;

    public BillerContextResolver() {
        try {
            this.ctx = JAXBContext.newInstance(

                    BillPullResponseDTO.class,
                    BillPullServiceRequest.class , BillPullServiceResponse.class

            );
        } catch (JAXBException ex) {
            throw new RuntimeException(ex);
        }
    }

    public JAXBContext getContext(Class<?> type) {
        return (type.equals(BillPullResponseDTO.class) ? ctx : null);
    }
}
