package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.Auths;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuthsRepo extends MongoRepository<Auths, Long> {
}
