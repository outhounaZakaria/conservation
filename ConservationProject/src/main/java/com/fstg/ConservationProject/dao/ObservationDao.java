package com.fstg.ConservationProject.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Observation;

@Repository
public interface ObservationDao extends JpaRepository< Observation, Long> {
 Observation findByRefObservation(String refObservation);
 @Query("SELECT o FROM Observation o WHERE o.dossier.reference = :refDossier")
 List<Observation> observationDunDossier(@Param("refDossier")String ref);
}
