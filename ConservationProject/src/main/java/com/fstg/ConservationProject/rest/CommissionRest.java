package com.fstg.ConservationProject.rest;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fstg.ConservationProject.bean.Commission;
import com.fstg.ConservationProject.service.CommissionService;

@RestController
@RequestMapping("conservation/commission")
public class CommissionRest {
@Autowired
public CommissionService commissionService ;
@GetMapping("/num/{num}")
public Commission findByNum(@PathVariable String num) {
	return commissionService.findByNum(num);
}
@PostMapping("/")
public void save(@RequestBody Commission commission) {
	commissionService.save(commission);
}
@GetMapping("/")
public List<Commission> findAll() {
	return commissionService.findAll();
}
@PostMapping("/date1/{dc1}/date2/{dc2}")
public List<Commission> commissionsDunePeriode(Date dc1, Date dc2) {
	return commissionService.commissionsDunePeriode(dc1, dc2);
}
}
