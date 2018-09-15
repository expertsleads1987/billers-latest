package com.experts.core.biller.statemachine.api.activemq.standers.spring.repository;

/*import me.derekmahar.example.spring.model.Person;*/
import com.experts.core.biller.statemachine.api.activemq.standers.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PersonRepository extends JpaRepository<Person, UUID> {
}
