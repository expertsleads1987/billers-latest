package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.Users;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsersRepo extends MongoRepository<Users,Long> {
}
