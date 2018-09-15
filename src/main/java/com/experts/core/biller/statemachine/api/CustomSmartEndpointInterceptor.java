package com.experts.core.biller.statemachine.api;

import com.experts.core.biller.statemachine.api.service.impl.PaymentBillPullController;
import org.springframework.ws.context.MessageContext;
import org.springframework.ws.server.SmartEndpointInterceptor;
import org.springframework.ws.server.endpoint.MethodEndpoint;
import org.springframework.ws.soap.security.wss4j2.Wss4jSecurityInterceptor;

/*import javax.xml.ws.handler.MessageContext;*/

public class CustomSmartEndpointInterceptor extends Wss4jSecurityInterceptor implements SmartEndpointInterceptor {

    //CustomEndpoint is your @Endpoint class

    public boolean shouldIntercept(MessageContext messageContext, Object endpoint) {
        if (endpoint instanceof MethodEndpoint) {
            MethodEndpoint methodEndpoint = (MethodEndpoint)endpoint;
            return methodEndpoint.getMethod().getDeclaringClass() == PaymentBillPullController.class;
        }
        return false;
    }
}
