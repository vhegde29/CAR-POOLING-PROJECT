package com.dxc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.repository.UserRepository;
import com.dxc.service.IUserService;


@Service
public class UserService implements IUserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public User findById(Integer uid) {
		// TODO Auto-generated method stub
		return userRepository.findById(uid).orElse(null);
	}

	@Override
	public User findByFname(String fname) {
		// TODO Auto-generated method stub
		return userRepository.findByFname(fname);
	}

	@Override
	public void saveOrUpdateUser(User user) {
		// TODO Auto-generated method stub
		userRepository.save(user);
		
	}

	@Override
	public void deleteUser(Integer uid) {
		// TODO Auto-generated method stub
		userRepository.deleteById(uid);
		
	}
	
	
	
	

}
