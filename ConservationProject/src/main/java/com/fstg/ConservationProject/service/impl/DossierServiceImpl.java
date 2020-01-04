package com.fstg.ConservationProject.service.impl;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Dossier;
import com.fstg.ConservationProject.dao.DossierDao;
import com.fstg.ConservationProject.service.DossierService;

@Service
public abstract class DossierServiceImpl implements DossierService {
    @Autowired
	public DossierDao dossierDao;    
	@Override
	public void save(Dossier dossier) {
		dossierDao.save(dossier);
	}
	@Override
	public Dossier findByReference(String reference) {
	   return dossierDao.findByReference(reference);
	}	
	@Override
	public List<Dossier> findAll() {	
		return  dossierDao.findAll() ;
	}
	@Override
	public List<Dossier> dossiersDeMembreDeCommisison(String numCommission, long numMembreCommission) {
		return dossierDao.dossiersDeMembreDeCommisison(numCommission, numMembreCommission);
	}
	@Override
	public List<Dossier> dossiersDeCommission(String refCommission) {
		return dossierDao.dossiersDeCommission(refCommission);
	}
	@Override
	public List<Dossier> dossiersParDate(Date date1, Date date2) {
		return dossierDao.dossiersParDate(date1, date2);
	}
	@Override
	public List<Dossier> dossiersParTraitement(boolean traitement) {
		return dossierDao.dossiersParTraitement(traitement);
	}
	@Override
	public List<Dossier> dossiersParAvis(String avis) {
		return dossierDao.dossiersParAvis(avis);
	}
	
}
