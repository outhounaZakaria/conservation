package com.fstg.ConservationProject.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.Commission;
@Repository
public interface CommissionDao extends JpaRepository<Commission ,Long> {
 
	Commission findByNumCommission(String num);
	@Query("SELECT c FROM  Commission c  WHERE c.dateCommission BETWEEN :dateCommission1 AND :dateCommission2")
	List<Commission> commissionsDunePeriode(@Param("dateCommission1") Date dateCommission1,@Param("dateCommission2") Date dateCommission2);
	
	@Query("SELECT c FROM  Commission c  WHERE c.dateCommission = :dateCommission1")
	List<Commission> commissionsDuneDate(@Param("dateCommission1") Date dateCommission1);




}
