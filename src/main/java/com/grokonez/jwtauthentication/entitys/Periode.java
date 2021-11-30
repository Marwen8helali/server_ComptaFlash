package com.grokonez.jwtauthentication.entitys;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name="periodes")
public class Periode {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private boolean actif;
	

    private String type;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public boolean isActif() {
		return actif;
	}


	public void setActif(boolean actif) {
		this.actif = actif;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public Periode() {
		super();
	}
    
    
}
