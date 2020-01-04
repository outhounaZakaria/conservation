package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.Observation;

public interface ObservationService {
	public  Observation findByRefObservation(String refObservation);
	public void save(Observation observation);
    public List<Observation> findAll();
    public List<Observation> observationDunDossier(String refDossier);
}
