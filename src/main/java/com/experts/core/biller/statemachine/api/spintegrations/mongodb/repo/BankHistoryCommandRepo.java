package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.BankHistoryCommand;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BankHistoryCommandRepo extends MongoRepository <BankHistoryCommand,Long> {
}
