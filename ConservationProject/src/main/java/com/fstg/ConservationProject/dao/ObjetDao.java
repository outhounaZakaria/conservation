 package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Objet;


@Repository
public interface ObjetDao extends JpaRepository<Objet, Long> {
  Objet findByMatricule(String matricule);

}
