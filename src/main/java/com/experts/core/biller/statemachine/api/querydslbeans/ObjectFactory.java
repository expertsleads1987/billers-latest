package com.experts.core.biller.statemachine.api.querydslbeans;


import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;


public class ObjectFactory {

    private final static QName _BillingAddress_QNAME = new QName("http://www.example.org/customer", "billing-address");
    private final static QName _ShippingAddress_QNAME = new QName("http://www.example.org/shipping", "shipping-address");


    public ObjectFactory(){}



    public ManVouncherMaster manVouncherMaster() {
        return new ManVouncherMaster();
    }

    public ManVouncherBeanDTO manVouncherBeanDTO() {
        return new ManVouncherBeanDTO();
    }


    public JAXBElement<ManVouncherBeanDTO> createBillingAddress(ManVouncherBeanDTO value) {
        return new JAXBElement<ManVouncherBeanDTO>(_BillingAddress_QNAME, ManVouncherBeanDTO.class, null, value);
    }


    public JAXBElement<ManVouncherMaster> createShippingAddress(ManVouncherMaster value) {
        return new JAXBElement<ManVouncherMaster>(_ShippingAddress_QNAME, ManVouncherMaster.class, null, value);
    }
}
