package com.grokonez.jwtauthentication.message.request;



public class CompanyModel {
	

	private String socialRaison;

	private String activity;

	private String address;

	private String country;

	private String tel;

	private String email;
	
	private long exerciceID;
	
	public String getSocialReason() {
		return socialRaison;
	}

	public void setSocialReason(String socialReason) {
		this.socialRaison = socialReason;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getExerciceID() {
		return exerciceID;
	}

	public void setExerciceID(long exerciceID) {
		this.exerciceID = exerciceID;
	}

	public CompanyModel() {
		super();
	}
	
}
