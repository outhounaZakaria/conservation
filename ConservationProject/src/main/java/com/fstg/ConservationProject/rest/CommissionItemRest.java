package com.fstg.ConservationProject.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.CommissionItem;
import com.fstg.ConservationProject.service.CommissionItemService;

@RestController
@RequestMapping("conservation/commissionItem")
public class CommissionItemRest {
	
@Autowired
private CommissionItemService commissionItemService;

@PostMapping("/")
public void save(@RequestBody CommissionItem commissionItem) {
	commissionItemService.save(commissionItem);
}
@GetMapping("/")
public List<CommissionItem> findAll() {
	return commissionItemService.findAll();
}
@GetMapping("/numCommission/{num}")
public List<CommissionItem> itemsDuneCommission( @PathVariable String num) {
	return commissionItemService.itemsDuneCommission(num);
}
}
