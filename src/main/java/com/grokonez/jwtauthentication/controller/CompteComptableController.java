package com.grokonez.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.entitys.CompteComptable;
import com.grokonez.jwtauthentication.entitys.Exercice;
import com.grokonez.jwtauthentication.entitys.PlanComptable;
import com.grokonez.jwtauthentication.message.request.CompteComptableModel;
import com.grokonez.jwtauthentication.message.request.PlanComptableModel;
import com.grokonez.jwtauthentication.repository.CompanyRepository;
import com.grokonez.jwtauthentication.repository.CompteComptableRepository;
import com.grokonez.jwtauthentication.repository.PlanComptableRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/compte-comptable")
public class CompteComptableController {
	
	@Autowired
	private CompteComptableRepository compteComptableRepository;
	
	@Autowired
	private PlanComptableRepository planComptableRepository;
	

	@PostMapping("/add")
	CompteComptable addCompte(@RequestBody CompteComptableModel tmp) {
		CompteComptable p = new CompteComptable();
		System.out.println("look this"+tmp.getPlanID());
		p.setDesignation(tmp.getDesignation());
		p.setApurement(tmp.getApurement());
		p.setPlan(this.planComptableRepository.findById(tmp.getPlanID()).get());
	
		return this.compteComptableRepository.save(p);
		
		
	}
	
	@GetMapping("/details/{id}")
	CompteComptable findOneById(@PathVariable long id) {
		return this.compteComptableRepository.findById(id).get();
	}
	
	@GetMapping("/list")
	List<CompteComptable> getList() {
		return this.compteComptableRepository.findAll();
	}
}
