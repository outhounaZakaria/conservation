package com.fstg.ConservationProject.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.TauxTaxe;
import com.fstg.ConservationProject.dao.TauxTaxeDao;
import com.fstg.ConservationProject.service.TauxTaxeService;
@Service
public class TauxTaxeServiceImpl implements  TauxTaxeService {

	@Autowired
	private TauxTaxeDao tauxTaxeDao;
	@Override
	public List<TauxTaxe> findAll() {
		return  tauxTaxeDao.findAll();
	}
    @Override
	public void save(TauxTaxe tauxTaxe) {
		tauxTaxeDao.save(tauxTaxe);
	}
    @Override
    public TauxTaxe taxesDunDossier(Date date) {
		return tauxTaxeDao.taxesDunDossier(date);
	}	
}
