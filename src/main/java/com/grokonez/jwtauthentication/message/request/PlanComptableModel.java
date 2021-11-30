package com.grokonez.jwtauthentication.message.request;


public class PlanComptableModel {
	
	private String keyCompte;
	private String description;
	private long company;
	
	
	
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
	public long getCompany() {
		return company;
	}
	public void setCompany(long company) {
		this.company = company;
	}
	
	
	public PlanComptableModel() {
		super();
	}
	
	

}
