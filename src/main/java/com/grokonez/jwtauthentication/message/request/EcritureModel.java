package com.grokonez.jwtauthentication.message.request;

public class EcritureModel {

	private String name;
	private long compteComptable;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCompteComptable() {
		return compteComptable;
	}
	public void setCompteComptable(long compteComptable) {
		this.compteComptable = compteComptable;
	}
	
	public EcritureModel() {}
	
}
