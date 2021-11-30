package com.grokonez.jwtauthentication.entitys;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table
public class Cpt {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "Entitled")
	private String Entitled;
	
	@Column(name = "Code")
	private long Code;
	
	


	/*@OneToMany(mappedBy = "cpt", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CompteComptable> compteComptables;*/

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEntitled() {
		return Entitled;
	}


	public void setEntitled(String entitled) {
		Entitled = entitled;
	}


	public long getCode() {
		return Code;
	}


	public void setCode(long code) {
		Code = code;
	}








	public Cpt() {
		super();
	}

}
