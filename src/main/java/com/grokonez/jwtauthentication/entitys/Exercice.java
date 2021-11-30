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





@Entity
@Table( name="exercices" )
public class Exercice {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idExercice;
	
	@Column(name = "year")
	private String year;
	
	@ManyToOne()
    @JoinColumn(name = "periodes_id", nullable = false)
    
    private Periode periode;

	
	@OneToMany(mappedBy = "exercice", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Company> company;
	
	


	public long getIdExercice() {
		return idExercice;
	}




	public void setIdExercice(long idExercice) {
		this.idExercice = idExercice;
	}




	public String getYear() {
		return year;
	}




	public void setYear(String year) {
		this.year = year;
	}




	public Periode getPeriode() {
		return periode;
	}




	public void setPeriode(Periode periode) {
		this.periode = periode;
	}




	public List<Company> getCompany() {
		return company;
	}




	public void setCompany(List<Company> company) {
		this.company = company;
	}




	public Exercice() {
		super(); // Object
	}
	
	
}
