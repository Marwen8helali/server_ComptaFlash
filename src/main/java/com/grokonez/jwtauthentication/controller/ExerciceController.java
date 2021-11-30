package com.grokonez.jwtauthentication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.entitys.Exercice;
import com.grokonez.jwtauthentication.entitys.Periode;
import com.grokonez.jwtauthentication.message.request.ExerciceModel;
import com.grokonez.jwtauthentication.repository.ExerciceRepository;
import com.grokonez.jwtauthentication.repository.PeriodeRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/exercice")
public class ExerciceController {

	@Autowired
	PeriodeRepository periodeRpository;
	
	@Autowired
	ExerciceRepository exerciceRepository;
	
	
	@PostMapping("/add")
	Exercice addNew(@RequestBody ExerciceModel tmp) {
		Exercice e = new Exercice();
		
		e.setYear(tmp.getYear());
		e.setPeriode( this.periodeRpository.findById(tmp.getPeriodeID()).get() );

		return this.exerciceRepository.save(e);
	}
	
	
	@GetMapping("/list")
	List<Exercice> getList() {
		return this.exerciceRepository.findAll();
	}
}
