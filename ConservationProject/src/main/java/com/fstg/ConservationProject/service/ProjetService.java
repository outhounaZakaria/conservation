package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.Projet;
public interface ProjetService {

	public void save(Projet projet);
	public List<Projet> findAll();
	public Projet findByRefenreceProjet( String reference);
}
