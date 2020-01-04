 package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Projet;

@Repository
public interface ProjetDao extends JpaRepository<Projet, Long> {
 Projet findByReferenceProjet(String referenceProjet);
}
