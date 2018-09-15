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

package com.experts.core.biller.statemachine.api.spintegrations.messagechannels.configuration;

import com.experts.core.biller.statemachine.api.spintegrations.gateway.shared.SpringIntegrationBillerConstants;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.integration.channel.QueueChannel;
/*import se.ivankrizsan.springintegration.shared.SpringIntegrationBillerConstants;*/

/**
 * Beans used in the {@code PublishSubscribeChannelTests} tests.
 *
 * @author Ivan Krizsan
 */
@Configuration
public class PublishSubscribeChannelConfiguration
    implements SpringIntegrationBillerConstants {


    @Bean("specialErrorChannel")
    @Order(-2)
    public QueueChannel specialErrorChannel() {
        final QueueChannel theErrorMessageChannel = new QueueChannel();
        theErrorMessageChannel.setComponentName(ERROR_CHANNEL_NAME);
        return theErrorMessageChannel;
    }
}
