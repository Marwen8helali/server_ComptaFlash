package com.grokonez.jwtauthentication.entitys;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "compte_comptables")

public class CompteComptable {
	

	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String designation;
	
	private String apurement;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn( name="CompteComptables_id" )
	@JsonIgnore
	private PlanComptable plan;
	
 
	
	@OneToMany( mappedBy="compteComptable" )
	private List<Ecriture> ecritures;
	
	
	

	public List<Ecriture> getEcritures() {
		return ecritures;
	}

	public void setEcritures(List<Ecriture> ecritures) {
		this.ecritures = ecritures;
	}

	public String getApurement() {
		return apurement;
	}

	public void setApurement(String apurement) {
		this.apurement = apurement;
	}





	public PlanComptable getPlan() {
		return plan;
	}

	public void setPlan(PlanComptable plan) {
		this.plan = plan;
	}

	public CompteComptable() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}


	

	
	
}
