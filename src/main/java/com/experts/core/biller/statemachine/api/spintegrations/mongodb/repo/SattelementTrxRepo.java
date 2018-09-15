package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.SattelementTrx;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SattelementTrxRepo extends MongoRepository<SattelementTrx,Long> {
}
