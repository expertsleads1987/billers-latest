package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.SattelementBankHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SattelementBankHistoryRepo extends MongoRepository<SattelementBankHistory,Long> {
}
