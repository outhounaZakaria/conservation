package com.fstg.ConservationProject.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fstg.ConservationProject.bean.Client;
import com.fstg.ConservationProject.dao.ClientDao;
import com.fstg.ConservationProject.service.ClientService;
@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
	 public  ClientDao clientDao ;
	@Override
	public void save(Client commande) {
		clientDao.save(commande);
	}
	@Override
	public List<Client> findAll() {
				return  clientDao.findAll();
	}
	@Override
	public Client findByCodeNational(String cni) {
		return clientDao.findByCodenational(cni);
	}
}
