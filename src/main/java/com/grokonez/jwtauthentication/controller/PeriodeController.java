package com.grokonez.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.entitys.Periode;
import com.grokonez.jwtauthentication.repository.PeriodeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/periode")
public class PeriodeController {

	@Autowired
	PeriodeRepository periodeRpository;
	
	
	@PostMapping("/add")
	Periode addNewOne(@RequestBody Periode tmp) {
		return this.periodeRpository.save(tmp);
	}
	
	@GetMapping("/list")
	List<Periode> getList() {
		return this.periodeRpository.findAll();
	}
}
