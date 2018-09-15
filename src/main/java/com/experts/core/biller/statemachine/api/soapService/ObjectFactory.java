package com.experts.core.biller.statemachine.api.soapService;

import com.experts.core.biller.statemachine.api.querydslbeans.ManVouncherMaster;

import javax.xml.bind.annotation.XmlRegistry;



@XmlRegistry
public class ObjectFactory {


    public ObjectFactory() {
    }

    public InquiryDetailsRequest createInquiryDetailsRequest() {
        return new InquiryDetailsRequest();
    }


    public InquiryDetailsResponse createInquiryDetailsResponse() {
        return new InquiryDetailsResponse();
    }



}
