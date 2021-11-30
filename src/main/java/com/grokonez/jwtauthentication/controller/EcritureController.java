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

import com.grokonez.jwtauthentication.entitys.Cpt;
import com.grokonez.jwtauthentication.entitys.Ecriture;
import com.grokonez.jwtauthentication.entitys.Notifications;
import com.grokonez.jwtauthentication.entitys.OperationEcritrue;
import com.grokonez.jwtauthentication.message.request.EcritureModel;
import com.grokonez.jwtauthentication.repository.CompteComptableRepository;
import com.grokonez.jwtauthentication.repository.EcritureRepo;
import com.grokonez.jwtauthentication.repository.NotificationsRepository;
import com.grokonez.jwtauthentication.repository.UserRepository;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/ecriture")
public class EcritureController {

	@Autowired
	EcritureRepo ecritureRepo;
	
	@Autowired
	CompteComptableRepository compteComptableRepository;
	
	@Autowired
	UserRepository ur;
	
	@Autowired
	NotificationsRepository nr;
	
	
	
	@PostMapping("/add")
	public Ecriture addNewOne(@RequestBody() EcritureModel tmp) {
		Ecriture e = new Ecriture();
		
		e.setName(tmp.getName());
		e.setCompteComptable(this.compteComptableRepository.findById(tmp.getCompteComptable()).get());
		
		
		Notifications n = new Notifications();
		
		n.setTitle("custom notification");
		n.setMessage("new ecriture hi !!");
		n.setUser(this.ur.findById((long)2).get());
		
		this.nr.save(n);
		
		return this.ecritureRepo.save(e);
		
		
	}
	
	
	@GetMapping("/list")
	List<Ecriture> getList() {
		return this.ecritureRepo.findAll();
	}
	
	
	@GetMapping("/operation/list/{id}")
	List<OperationEcritrue> getOperationListByID(@PathVariable long id) {
		return this.ecritureRepo.findById(id).get().getOperations();
	}
	
	
	
}
