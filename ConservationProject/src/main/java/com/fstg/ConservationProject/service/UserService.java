package com.fstg.ConservationProject.service;

import java.util.List;

import com.fstg.ConservationProject.bean.User;

public interface UserService {

	public void save(User user);
	public List<User> findAll();
	public User findByNum(String num);
}
