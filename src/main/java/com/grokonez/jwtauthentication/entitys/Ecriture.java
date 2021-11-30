package com.grokonez.jwtauthentication.entitys;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "ecritures")
public class Ecriture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String name;
	
	@ManyToOne()
	@JsonIgnore
	@JoinColumn( name="compte_comptables_id", nullable = true )
	private CompteComptable compteComptable;
	

	@OneToMany( mappedBy="ecriture" )
	private List<OperationEcritrue> operations;
	
	
	public List<OperationEcritrue> getOperations() {
		return operations;
	}

	public void setOperations(List<OperationEcritrue> operations) {
		this.operations = operations;
	}

	public CompteComptable getCompteComptable() {
		return compteComptable;
	}

	public void setCompteComptable(CompteComptable compteComptable) {
		this.compteComptable = compteComptable;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public Ecriture() {}
}
