package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.MembreCommission;

public interface MembreCommissionService {

	public void save(MembreCommission membreCommission);
	public List<MembreCommission> findAll();
	public MembreCommission findByNum(String num);
}
