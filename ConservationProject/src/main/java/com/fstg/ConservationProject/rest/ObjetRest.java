package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Objet;
import com.fstg.ConservationProject.service.ObjetService;

@RestController
@RequestMapping("conservation/objet")
public class ObjetRest {
 @Autowired
 public ObjetService objetService ;
@PostMapping
@GetMapping("/")
public void save(@RequestBody Objet objet) {
	objetService.save(objet);
}
@GetMapping("/")
public List<Objet> findAll() {
	return objetService.findAll();
}
@GetMapping("/matricule/{matricule}")
public Objet findByMatricule(@PathVariable String matricule) {
	return objetService.findByMatricule(matricule);
}
}
