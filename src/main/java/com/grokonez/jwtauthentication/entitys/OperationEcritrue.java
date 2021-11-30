package com.grokonez.jwtauthentication.entitys;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table( name="operations" )
public class OperationEcritrue {


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private float amount;
	private String numPiece;
	
	
	
	
	
	public String getNumPiece() {
		return numPiece;
	}


	public void setNumPiece(String numPiece) {
		this.numPiece = numPiece;
	}

	private LocalDateTime createdAt = LocalDateTime.now();
	
	private int type; // 0 debit 1 credit
	 
	private String  date;
	
	private String  entitled;
	
	private String  journal;
	
	private String  libilee;
	
	
	@ManyToOne()
	@JsonIgnore
    @JoinColumn(name = "ecritures_id", nullable = false)
	private Ecriture ecriture;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public float getAmount() {
		return amount;
	}


	public void setAmount(float amount) {
		this.amount = amount;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	public int getType() {
		return type;
	}


	public void setType(int type) {
		this.type = type;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getEntitled() {
		return entitled;
	}


	public void setEntitled(String entitled) {
		this.entitled = entitled;
	}


	public String getJournal() {
		return journal;
	}


	public void setJournal(String journal) {
		this.journal = journal;
	}


	public String getLibilee() {
		return libilee;
	}


	public void setLibilee(String libilee) {
		this.libilee = libilee;
	}


	public Ecriture getEcriture() {
		return ecriture;
	}


	public void setEcriture(Ecriture ecriture) {
		this.ecriture = ecriture;
	}
	
	public OperationEcritrue(){
		
	}
}
