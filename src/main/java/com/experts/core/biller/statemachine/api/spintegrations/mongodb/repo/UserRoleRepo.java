package com.experts.core.biller.statemachine.api.spintegrations.mongodb.repo;

import com.experts.core.biller.statemachine.api.spintegrations.mongodb.domain.UserRoles;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRoleRepo extends MongoRepository<UserRoles,Long> {
}
