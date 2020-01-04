package com.fstg.ConservationProject.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.MembreCommission;
import com.fstg.ConservationProject.dao.MembreCommissionDao;
import com.fstg.ConservationProject.service.MembreCommissionService;
@Service
public class MembreCommissionServiceImpl implements MembreCommissionService {
	@Autowired
	public MembreCommissionDao membreCommissionDao;
	@Override
	public void save(MembreCommission membreCommission) {
		membreCommissionDao.save(membreCommission);
	}
	@Override
	public List<MembreCommission> findAll() {
		return  membreCommissionDao.findAll();
	}
	@Override
	public MembreCommission findByNum(String num) {
		return membreCommissionDao.findByNum(num);
	}
}
