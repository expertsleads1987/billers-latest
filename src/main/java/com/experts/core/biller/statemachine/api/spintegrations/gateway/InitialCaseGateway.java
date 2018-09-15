package com.experts.core.biller.statemachine.api.spintegrations.gateway;

import org.springframework.integration.annotation.Gateway;
import org.springframework.integration.annotation.GatewayHeader;
import org.springframework.integration.annotation.MessagingGateway;

@MessagingGateway(name = "myGateway", defaultRequestChannel = "inputC",
        defaultHeaders = @GatewayHeader(name = "calledMethod",
                expression="#gatewayMethod.name"))
public interface InitialCaseGateway {

    @Gateway(requestChannel = "inputA", replyTimeout = 2, requestTimeout = 200)
    String echo(String payload);

    @Gateway(requestChannel = "inputB", headers = @GatewayHeader(name = "foo", value="bar"))
    String echoUpperCase(String payload);

    String echoViaDefault(String payload);

}
