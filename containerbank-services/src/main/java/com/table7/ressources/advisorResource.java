package com.table7.ressources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.table7.card.AdvisorRepository;

@RestController
public class advisorResource {

	@Autowired
	private AdvisorRepository repository;

}
