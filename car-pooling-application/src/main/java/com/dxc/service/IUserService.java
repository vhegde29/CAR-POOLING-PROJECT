package com.dxc.service;

import java.util.List;

import com.dxc.model.User;

public interface IUserService {
	List<User> findAll();
	User findById(Integer uid);
	User findByFname(String fname);
	void saveOrUpdateUser(User user);
	void deleteUser(Integer uid);
}
