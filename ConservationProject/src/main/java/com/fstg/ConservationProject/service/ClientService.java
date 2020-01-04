package com.fstg.ConservationProject.service;
import java.util.List;

import com.fstg.ConservationProject.bean.Client;
public interface ClientService {

	public void save(Client client);
	public List<Client> findAll();
	public Client findByCodeNational(String CNI);
}
