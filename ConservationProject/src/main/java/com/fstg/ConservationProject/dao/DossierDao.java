package com.fstg.ConservationProject.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Dossier;


@Repository
public interface DossierDao extends JpaRepository<Dossier, Long> {

	Dossier findByReference(String reference);  
	@Query("SELECT c.dossiers FROM  CommissionItem c  WHERE c.commission.numCommission = :numCommission AND c.membreCommission.num = :numMembreCommission")
	List<Dossier> dossiersDeMembreDeCommisison(@Param("numCommission") String numCommission,@Param("numMembreCommission") long numMembreCommission);
	
	@Query("SELECT c.dossiers FROM Commission c WHERE c.numCommission=:num ")	
	List<Dossier> dossiersDeCommission(@Param("num") String refCommission);
	
	@Query("SELECT d FROM Dossier d WHERE d.dateArrive BETWEEN :date1 AND :date2 ")	
	List<Dossier> dossiersParDate(@Param("date1") Date date1 , @Param("date2") Date date2);   
	
	@Query("SELECT d FROM Dossier d WHERE d.traitement= :tr ")	
	List<Dossier> dossiersParTraitement(@Param("tr") boolean traitement);
	
	@Query("SELECT d FROM Dossier d WHERE d.avis= :av ")	
	List<Dossier> dossiersParAvis(@Param("av") String avis);
	
}




















