package com.fstg.ConservationProject.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.TauxTaxe;
import com.fstg.ConservationProject.service.TauxTaxeService;

@RestController
@RequestMapping("conservation/tauxTaxe")
public class TauxTaxeRest {
@Autowired
public TauxTaxeService tauxTaxeService;

@PostMapping("/")
public void save(@RequestBody TauxTaxe tauxTaxe) {
	tauxTaxeService.save(tauxTaxe);
}
@GetMapping("/")
public List<TauxTaxe> findAll() {
	return tauxTaxeService.findAll();
}
@GetMapping("/texes/{date}")
public TauxTaxe taxesDunDossier(Date date) {
	return tauxTaxeService.taxesDunDossier(date);
}
}
