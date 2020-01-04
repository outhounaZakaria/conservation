package com.fstg.ConservationProject.service.impl;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Commission;
import com.fstg.ConservationProject.dao.CommissionDao;
import com.fstg.ConservationProject.service.CommissionService;
@Service
public  class CommissionServiceImpl implements CommissionService {
	@Autowired
	 public CommissionDao commissionDao;
	@Override
	public Commission findByNum(String num) {
		return commissionDao.findByNumCommission(num);
	}
	@Override
	public void save(Commission commission) {
		commissionDao.save(commission);
	}
	@Override
	public List<Commission> findAll() {	
		return commissionDao.findAll();
	}
	public List<Commission> commissionsDunePeriode(Date dateCommission1, Date dateCommission2) {
		if(dateCommission1.compareTo(dateCommission2)>0)
		return commissionDao.commissionsDunePeriode(dateCommission1, dateCommission2);
		else {
			if(dateCommission1.compareTo(dateCommission2)==0) {
				return commissionsDuneDate(dateCommission1);
			}
			else return null;
		}
	}
	public List<Commission> commissionsDuneDate(Date dateCommission1) {
		return commissionDao.commissionsDuneDate(dateCommission1);
	}
}
