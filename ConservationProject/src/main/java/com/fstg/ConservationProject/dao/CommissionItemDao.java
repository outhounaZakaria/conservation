package com.fstg.ConservationProject.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.CommissionItem;
@Repository
public interface CommissionItemDao  extends JpaRepository<CommissionItem , Long> {
	@Query("SELECT c FROM CommissionItem c WHERE c.commission.numCommission=:num ")
	List<CommissionItem> itemsDuneCommission(@Param("num") String num);
}
