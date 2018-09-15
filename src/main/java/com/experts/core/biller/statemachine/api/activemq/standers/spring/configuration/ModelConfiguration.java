package com.experts.core.biller.statemachine.api.activemq.standers.spring.configuration;

/*import me.derekmahar.example.spring.model.PersonFactory;*/
import com.experts.core.biller.statemachine.api.activemq.standers.spring.model.PersonFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelConfiguration {
	@Bean
	public PersonFactory personFactory() {
		return new PersonFactory();
	}
}
