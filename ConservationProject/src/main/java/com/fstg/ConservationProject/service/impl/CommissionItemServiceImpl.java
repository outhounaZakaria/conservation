package com.fstg.ConservationProject.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fstg.ConservationProject.bean.CommissionItem;
import com.fstg.ConservationProject.dao.CommissionItemDao;
import com.fstg.ConservationProject.service.CommissionItemService;
@Service
public class CommissionItemServiceImpl implements CommissionItemService {
	@Autowired 
	public CommissionItemDao commissionItemDao;
	@Override
	public void save(CommissionItem commissionItem) {
		commissionItemDao.save(commissionItem);
	}
	@Override
	public List<CommissionItem> findAll() {
		return  commissionItemDao.findAll();
	}
	public List<CommissionItem> itemsDuneCommission(String num) {
		return commissionItemDao.itemsDuneCommission(num);
	}
}

















