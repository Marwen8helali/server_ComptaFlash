package com.grokonez.jwtauthentication.controller;

import java.io.Console;
import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grokonez.jwtauthentication.entitys.Company;
import com.grokonez.jwtauthentication.entitys.Exercice;
import com.grokonez.jwtauthentication.message.request.CompanyModel;
import com.grokonez.jwtauthentication.message.request.ExerciceModel;
import com.grokonez.jwtauthentication.repository.CompanyRepository;
import com.grokonez.jwtauthentication.repository.ExerciceRepository;


import javassist.NotFoundException;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/company")
public class CompanyController {

	@Autowired
	CompanyRepository companyRpository;
	
	@Autowired
	ExerciceRepository exerciceRpository;
	/*
    @PostMapping("/exercices/add")
    public Optional<Company> addCompany(@PathVariable Long idExercice,
                            @RequestBody Company company){
        return exerciceRpository.findById(idExercice).map(exercice -> {
        	company.setExercice(exercice);
        	 return companyRpository.save(company);
        });
    }   
    
    @PostMapping("/add")
    public Company createTypePartner(@RequestBody Company company) {
        return companyRpository.save(company);
    }*/
	
	@PostMapping("/add")
	Company addNew(@RequestBody CompanyModel tmp) {
		Company c = new Company();
		
		c.setSocialReason(tmp.getSocialReason());
		c.setActivity(tmp.getActivity());
		c.setAddress(tmp.getAddress());
		c.setCountry(tmp.getCountry());
		c.setTel(tmp.getTel());
		c.setEmail(tmp.getEmail());
		
		
		c.setExercice( this.exerciceRpository.findById(tmp.getExerciceID()).get() );

		return this.companyRpository.save(c);
	}
 
	
	@GetMapping("/list")
	List<Company> getList() {
		return this.companyRpository.findAll();
	}
	
	@GetMapping("/details/{id}")
	Company findOneById(@PathVariable long id) {
		System.out.println("lokkthis"+this.companyRpository.findById(id).get());
		return this.companyRpository.findById(id).get();
	}
}
