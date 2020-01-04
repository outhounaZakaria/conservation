package com.fstg.ConservationProject.service;

import java.util.Date;
import java.util.List;

import com.fstg.ConservationProject.bean.Dossier;


public interface DossierService {

	public void save( Dossier  dossier);
	public List<Dossier> findAll();
	public  Dossier findByReference(String reference); 
	public List<Dossier> dossiersDeCommission(String refCommission);
	public List<Dossier> dossiersDeMembreDeCommisison(String refCommission,long refMembreCommission);
	public List<Dossier> dossiersParDate(Date date1, Date date2);
	public List<Dossier> dossiersParTraitement(boolean traitement);
	public List<Dossier> dossiersParAvis(String avix); 
}