package com.grokonez.jwtauthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.entitys.Company;
import com.grokonez.jwtauthentication.entitys.PlanComptable;
import com.grokonez.jwtauthentication.message.request.PlanComptableModel;
import com.grokonez.jwtauthentication.repository.CompanyRepository;
import com.grokonez.jwtauthentication.repository.PlanComptableRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/plan-comptable")

public class PlanComptableController {

	@Autowired
	private PlanComptableRepository planComptableRepository;
	
	@Autowired
	private CompanyRepository companyRepository;
	
	
	@PostMapping("/add")
	PlanComptable add(@RequestBody PlanComptableModel tmp) {
		PlanComptable p = new PlanComptable();
		
		p.setDescription(tmp.getDescription());
		p.setKeyCompte(tmp.getKeyCompte());
		p.setCompany(this.companyRepository.findById(tmp.getCompany()).get());
		
		return this.planComptableRepository.save(p);
		
	}
	@GetMapping("/details/{id}")
	PlanComptable findOneById(@PathVariable long id) {
		return this.planComptableRepository.findById(id).get();
	}
}
