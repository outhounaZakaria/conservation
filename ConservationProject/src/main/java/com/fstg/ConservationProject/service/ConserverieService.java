package com.fstg.ConservationProject.service;

import com.fstg.ConservationProject.bean.Concerverie;
import antlr.collections.List;
public interface ConserverieService {

	public void save(Concerverie conserverie);
	public List findAll();
}
