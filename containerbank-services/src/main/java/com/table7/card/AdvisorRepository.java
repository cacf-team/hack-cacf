package com.table7.card;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.table7.model.advisor;

public interface AdvisorRepository extends MongoRepository<advisor, String> {

}
