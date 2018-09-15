package com.experts.core.biller.statemachine.api.activemq.standers.spring.model;

import java.util.UUID;

public class PersonFactory {

	public Person createPerson(UUID id, String firstName, String lastName) {
		return new Person(firstName, id, lastName);
	}

}
