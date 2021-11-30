package com.grokonez.jwtauthentication.entitys;

import java.io.Serializable;
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
@Table(name = "Companys")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) 
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "SocialReason")
	private String socialReason;
	
	@Column(name = "activity")
	private String activity;
	
	@Column(name = "address")
	private String address;

	@Column(name = "country")
	private String country;
	
	@Column(name = "Tel")
	private String tel;
	
	@Column(name = "Email")
	private String email;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "exercices_id_exercice", nullable = false)
    @JsonIgnore
    private Exercice exercice;
	
	@OneToMany(mappedBy = "company", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<PlanComptable> plans;



	
	public List<PlanComptable> getPlans() {
		return plans;
	}




	public void setPlans(List<PlanComptable> plans) {
		this.plans = plans;
	}




	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}




	public String getSocialReason() {
		return socialReason;
	}




	public void setSocialReason(String socialReason) {
		this.socialReason = socialReason;
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




	public Exercice getExercice() {
		return exercice;
	}




	public void setExercice(Exercice exercice) {
		this.exercice = exercice;
	}




	public static long getSerialversionuid() {
		return serialVersionUID;
	}




	public Company() {
		super();
	}


	
	
}

