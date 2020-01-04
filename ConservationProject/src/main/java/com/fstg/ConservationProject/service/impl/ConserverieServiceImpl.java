package com.fstg.ConservationProject.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fstg.ConservationProject.bean.Concerverie;
import com.fstg.ConservationProject.dao.ConserverieDao;
import com.fstg.ConservationProject.service.ConserverieService;
import antlr.collections.List;

@Service
public class ConserverieServiceImpl implements ConserverieService{ 
	@Autowired
	private ConserverieDao concerverieDao ;
	@Override
	public void save(Concerverie conserverie) {
		concerverieDao.save(conserverie);		
	}
	@Override
	public List findAll() {
		return (List) concerverieDao.findAll();
	}
}
