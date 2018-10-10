package com.table7.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.table7.card.PaymentRepository;

@RestController
public class paymentResource {

	@Autowired
	private PaymentRepository repository;

}
