package com.fstg.ConservationProject.rest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fstg.ConservationProject.bean.User;
import com.fstg.ConservationProject.service.UserService;

@RestController
@RequestMapping("conservation/user")
public class UserRest {
@Autowired
private UserService userService;
@PostMapping("/")
public void save(@RequestBody User user) {
	userService.save(user);
}
@GetMapping("/")
public List<User> findAll() {
	return userService.findAll();
}
@GetMapping("/num/{num}")
public User findByNum(@PathVariable String num) {
	return userService.findByNum(num);
}
}
