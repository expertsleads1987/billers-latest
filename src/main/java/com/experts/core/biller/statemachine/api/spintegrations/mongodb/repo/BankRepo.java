package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.Bank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankRepo extends MongoRepository<Bank,Long> {
}
