package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
@Service
public interface UserService {
	List<User> findAll();
	User findById(Integer uId);
	User findByEmail(String email);
	void deleteUser(Integer uId);
	User findByEmailAndPassword(String email,String password);
	public User saveUser(User user);
	void saveOrUpdateUser(User user);
	User findByEmailIdAndPassword(String email,String password);


	}


