package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fstg.ConservationProject.bean.MembreCommission;
@Repository
public interface MembreCommissionDao  extends JpaRepository<MembreCommission, Long> {

	MembreCommission findByNum(String num);
}

