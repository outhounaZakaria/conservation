package com.fstg.ConservationProject.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Projet;
import com.fstg.ConservationProject.dao.ProjetDao;
import com.fstg.ConservationProject.service.ProjetService;
@Service
public class ProjetServiceImpl implements ProjetService {

	@Autowired
	private ProjetDao projetDao;
	@Override
	public void save(Projet projet) {
		projetDao.save(projet);
	}
	@Override
	public List<Projet> findAll() {
		return projetDao.findAll();
	}
	@Override
	public Projet findByRefenreceProjet(String reference) {
		return projetDao.findByReferenceProjet(reference);
	}
}
