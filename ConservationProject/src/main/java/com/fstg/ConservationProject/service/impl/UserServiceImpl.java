package com.fstg.ConservationProject.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fstg.ConservationProject.bean.User;
import com.fstg.ConservationProject.dao.UserDao;
import com.fstg.ConservationProject.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	 private UserDao userDao;	
	@Override
	public void save(User user) {
		userDao.save(user);
	}
	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}
	@Override
	public User findByNum(String num) {		
		return userDao.findByNum(num);
	}
}
