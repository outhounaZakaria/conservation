 package com.fstg.ConservationProject.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.fstg.ConservationProject.bean.Client;
@Repository
public interface ClientDao extends JpaRepository<Client,Long> {

	  Client findByCodenational(String cni);

}
