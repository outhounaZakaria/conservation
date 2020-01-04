package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Projet;
import com.fstg.ConservationProject.service.ProjetService;

@RestController
@RequestMapping("conservation/projet")
public class ProjetRest {
@Autowired
public ProjetService projetService;
@PostMapping("/")
public void save(@RequestBody Projet projet) {
	projetService.save(projet);
}
@GetMapping("/")
public List<Projet> findAll() {
	return projetService.findAll();
}
@GetMapping("/reference/{ref}")
public Projet findByRefenreceProjet(@PathVariable String ref) {
	return projetService.findByRefenreceProjet(ref);
}
}
