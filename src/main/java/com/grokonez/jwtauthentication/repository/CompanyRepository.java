package com.grokonez.jwtauthentication.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.entitys.Company;



public interface CompanyRepository extends JpaRepository<Company,Long> {
	List findByExercice_idExercice(Long idExercice);
}
