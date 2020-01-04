package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Client;
import com.fstg.ConservationProject.service.ClientService;


@RestController
@RequestMapping("conservation/client")
public class ClientRest {
	
@Autowired
private ClientService clientService;

@PostMapping("/")
public void save( @RequestBody Client commande) {
	clientService.save(commande);
}
@GetMapping("/")
public List<Client> findAll() {
	return  clientService.findAll();
}
@GetMapping("/codeNaional/{CNI}")
public Client findByCodeNational(@PathVariable String cni) {
	
	return clientService.findByCodeNational(cni);
}

}
