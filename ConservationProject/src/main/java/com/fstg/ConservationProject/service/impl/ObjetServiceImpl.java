package com.fstg.ConservationProject.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Objet;
import com.fstg.ConservationProject.dao.ObjetDao;
import com.fstg.ConservationProject.service.ObjetService;
@Service
public class ObjetServiceImpl implements ObjetService {
	@Autowired
	private ObjetDao objetDao;
	@Override
	public void save(Objet objet) {
		objetDao.save(objet);
	}
	@Override
	public List<Objet> findAll() {
		return  objetDao.findAll();
	}
	@Override
	public Objet findByMatricule(String matricule) {	
		return  objetDao.findByMatricule(matricule);
	}
}
