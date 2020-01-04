package com.fstg.ConservationProject.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Concerverie;
import com.fstg.ConservationProject.service.ConserverieService;

import antlr.collections.List;

@RestController
@RequestMapping("conservation/conserverie")
public class ConserverieRest {
@Autowired
private ConserverieService conserverieService;
@PostMapping("/")
public void save(@RequestBody Concerverie conserverie) {
	conserverieService.save(conserverie);
}
@GetMapping("/")
public List findAll() {
	return conserverieService.findAll();
}
}
