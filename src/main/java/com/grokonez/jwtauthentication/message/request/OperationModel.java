package com.grokonez.jwtauthentication.message.request;

import java.time.LocalDateTime;

public class OperationModel {

	private float amount;
	private String numPiece;

	private int type;
	 
	private String  date;
	
	private String  entitled;
	
	private String  journal;
	
	private String  libilee;
	
	private long  ecriture;
	
	

	public long getEcriture() {
		return ecriture;
	}

	public void setEcriture(long ecriture) {
		this.ecriture = ecriture;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getNumPiece() {
		return numPiece;
	}

	public void setNumPiece(String numPiece) {
		this.numPiece = numPiece;
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
	
	
	
}
