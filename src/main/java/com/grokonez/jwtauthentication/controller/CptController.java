package com.grokonez.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.grokonez.jwtauthentication.entitys.Cpt;
import com.grokonez.jwtauthentication.repository.CptRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/cpt")
public class CptController {
	
	@Autowired
	CptRepository cptRpository;
	
	@GetMapping("/list")
	List<Cpt> getList() {
		return this.cptRpository.findAll();
	}
	
}
