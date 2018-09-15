package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.SattelementBank;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SattelementBankRepo extends MongoRepository<SattelementBank,Long> {
}
