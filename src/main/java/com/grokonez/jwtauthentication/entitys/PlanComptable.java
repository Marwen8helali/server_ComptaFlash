package com.grokonez.jwtauthentication.entitys;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table(name = "plan_comptables")

public class PlanComptable implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String keyCompte;
	private String description;
	
	private LocalDateTime date = LocalDateTime.now();
	
	@ManyToOne
	@JoinColumn( name="Companys_id" )
	@JsonIgnore
	private Company company;
	
	@OneToMany(mappedBy = "plan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<CompteComptable> compteComptables;
	
	
	

	public List<CompteComptable> getComptes() {
		return compteComptables;
	}

	public void setComptes(List<CompteComptable> compteComptables) {
		this.compteComptables = compteComptables;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getKeyCompte() {
		return keyCompte;
	}

	public void setKeyCompte(String keyCompte) {
		this.keyCompte = keyCompte;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
	

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public PlanComptable() {
		super();
	}
	
	
	
	
}
