package com.grokonez.jwtauthentication.message.request;

public class CompteComptableModel {

	

	private String designation;
	private String apurement;
	private long planID;
	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	public String getApurement() {
		return apurement;
	}
	public void setApurement(String apurement) {
		this.apurement = apurement;
	}
	public long getPlanID() {
		return planID;
	}
	public void setPlanID(long planID) {
		this.planID = planID;
	}
	
	
	
	public CompteComptableModel() {
		super();
	}

	
	
}
