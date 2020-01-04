package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.Objet;

public interface ObjetService {

	public void save( Objet  objet);
	public List<Objet> findAll();
	public Objet findByMatricule(String matricule);
	
}
