package com.grokonez.jwtauthentication.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.grokonez.jwtauthentication.entitys.Ecriture;
import com.grokonez.jwtauthentication.entitys.OperationEcritrue;
import com.grokonez.jwtauthentication.message.request.OperationModel;
import com.grokonez.jwtauthentication.repository.EcritureRepo;
import com.grokonez.jwtauthentication.repository.OperationEcritrueRepo;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/operations")
public class OperationController {

	@Autowired
	OperationEcritrueRepo operationEcritrueRepo;
	
	
	@Autowired
	EcritureRepo ecritureRepo;
	
	
	
	
	@PostMapping("/add")
	public OperationEcritrue add( @RequestBody OperationModel tmp ) {
		OperationEcritrue o = new OperationEcritrue();
		
		o.setAmount(tmp.getAmount());
		o.setEcriture(this.ecritureRepo.findById(tmp.getEcriture()).get());
		o.setDate(tmp.getDate());
		o.setEntitled(tmp.getEntitled());
		o.setJournal(tmp.getJournal());
		o.setLibilee(tmp.getLibilee());
		o.setNumPiece(tmp.getNumPiece());
		o.setType(tmp.getType());

		return this.operationEcritrueRepo.save(o);
	}
}
