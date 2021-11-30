package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.entitys.Ecriture;

public interface EcritureRepo extends JpaRepository<Ecriture,Long> {

}
