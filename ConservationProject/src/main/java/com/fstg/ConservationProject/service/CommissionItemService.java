package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.CommissionItem;

public interface CommissionItemService {

	public void save( CommissionItem  commissionItem);
	public List<CommissionItem> findAll();
	public List<CommissionItem> itemsDuneCommission(String num);
}
