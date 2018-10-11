package com.table7.card;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.table7.model.customer;

public interface CustomerRepository extends MongoRepository<customer, String> {
	
	

}
