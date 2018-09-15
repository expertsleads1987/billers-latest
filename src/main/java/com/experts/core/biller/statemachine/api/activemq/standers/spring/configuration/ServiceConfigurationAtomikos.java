package com.experts.core.biller.statemachine.api.activemq.standers.spring.configuration;

/*import me.derekmahar.example.spring.messenger.PersonMessenger;
import me.derekmahar.example.spring.service.PersonService;*/
import com.experts.core.biller.statemachine.api.activemq.standers.spring.messenger.PersonMessenger;
import com.experts.core.biller.statemachine.api.activemq.standers.spring.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MessagingConfiguration.class})
public class ServiceConfigurationAtomikos {
	@Bean
	public PersonService personService(PersonMessenger personMessenger) {
		return new PersonService(personMessenger);
	}
}
