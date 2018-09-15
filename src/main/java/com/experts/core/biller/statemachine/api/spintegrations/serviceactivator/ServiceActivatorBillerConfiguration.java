/*
 * Copyright 2017 Ivan Krizsan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.experts.core.biller.statemachine.api.spintegrations.serviceactivator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.integration.annotation.IntegrationComponentScan;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.config.EnableIntegration;
import org.springframework.integration.config.EnableIntegrationManagement;
import org.springframework.messaging.MessageChannel;

@Configuration
@IntegrationComponentScan
@EnableIntegrationManagement
@EnableIntegration
public class ServiceActivatorBillerConfiguration {
    /* Constant(s): */
    /* Common constants. */
    public static final String PAYLOAD_SUCCESSFUL = "saPayloadSuccessful";
    public static final String PAYLOAD_ERROR = "saPayloadError";
    /* Constants associated with service activator one; request-response with output channel. */
    public static final String SERVICEACTIVATOR_ONE_INPUT_CHANNEL =
        "serviceActivatorOneInputChannel";
    public static final String SERVICEACTIVATOR_ONE_OUTPUT_CHANNEL =
        "serviceActivatorOneOutputChannel";
    public static final String SERVICEACTIVATOR_ONE_RESPONSE = "serviceactivator 1 response";
    /* Constants associated with service activator two; request-response without output channel. */
    public static final String SERVICEACTIVATOR_TWO_INPUT_CHANNEL =
        "serviceActivatorTwoInputChannel";
    public static final String SERVICEACTIVATOR_TWO_RESPONSE = "serviceactivator 2 response";


    @Bean(name = SERVICEACTIVATOR_ONE_OUTPUT_CHANNEL)
    public QueueChannel serviceActivatorOneOutputChannel() {
        return new QueueChannel();
    }


    @Bean(name = SERVICEACTIVATOR_ONE_INPUT_CHANNEL)
    public MessageChannel serviceActivatorOneInputChannel() {
        return new DirectChannel();
    }


    @Bean(name = SERVICEACTIVATOR_TWO_INPUT_CHANNEL)
    public MessageChannel serviceActivatorTwoInputChannel() {
        return new DirectChannel();
    }


    @Bean
    public QueueChannel errorChannel() {
        return new QueueChannel();
    }


    @Bean
    public RequestResponseServiceActivators requestResponseServiceActivators() {
        return new RequestResponseServiceActivators();
    }
}
