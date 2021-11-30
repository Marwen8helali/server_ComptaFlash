package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.grokonez.jwtauthentication.entitys.Periode;

public interface PeriodeRepository extends JpaRepository<Periode,Long> {

}
