package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Observation;
import com.fstg.ConservationProject.service.ObservationService;

@RestController
@RequestMapping("conservation/observation")
public class ObservarionRest {
@Autowired
private ObservationService observationService;
@GetMapping("/reference/{ref}")
public Observation findByRefObservation( @PathVariable String ref) {
	return observationService.findByRefObservation(ref);
}
@PostMapping("/")
public void save(@RequestBody Observation observation) {
	observationService.save(observation);
}
@GetMapping("/")
public List<Observation> findAll() {
	return observationService.findAll();
}
@GetMapping("/refObservation/{ref}")
public List<Observation> observationDunDossier(String ref) {
	return observationService.observationDunDossier(ref);
}
}
