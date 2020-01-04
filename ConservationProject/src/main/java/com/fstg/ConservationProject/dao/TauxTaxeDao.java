package com.fstg.ConservationProject.dao;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.TauxTaxe;
@Repository
public interface TauxTaxeDao extends JpaRepository< TauxTaxe, Long> {
   
	TauxTaxe findByDateDepartApplication( Date dateDepartApplication);
	TauxTaxe findByDateFintApplication( Date dateFinApplication);
	@Query("SELECT t FROM  TauxTaxe t WHERE t.dateDepartApplication< :date AND t.dateFintApplication> :date ")
	TauxTaxe taxesDunDossier(@Param("date") Date date);
}
  











//public TauxTaxe taxesDunDossier(Date date);
//private Date dateDepartApplication;
//private Date dateFintApplication;
