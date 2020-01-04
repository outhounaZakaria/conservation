package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.MembreCommission;
import com.fstg.ConservationProject.service.MembreCommissionService;

@RestController
@RequestMapping("conservation/membreCommission")
public class MembreCommossionRest {
@Autowired
private MembreCommissionService membreCommissionService ;
@PostMapping("/")
public void save(@RequestBody MembreCommission membreCommission) {
	membreCommissionService.save(membreCommission);
}
@GetMapping("/")
public List<MembreCommission> findAll() {
	return membreCommissionService.findAll();
}
@GetMapping("/num/{num}")
public MembreCommission findByNum(@PathVariable String num) {
	return membreCommissionService.findByNum(num);
}
}
