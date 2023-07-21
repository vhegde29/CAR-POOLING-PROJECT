package com.dxc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.User;
import com.dxc.repository.UserRepository;
import com.dxc.service.UserService;



@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> findAll() {
		return userRepository.findAll();
	}

	@Override
	public User findById(Integer uId) {
		return userRepository.findById(uId).orElse(null);
	}

	@Override
	public User findByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void deleteUser(Integer uId) {

		userRepository.deleteById(uId);

	}
	@Override
	public User findByEmailAndPassword(String email, String password) {
		return userRepository.findByEmailAndPassword(email, password);
	}

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void saveOrUpdateUser(User user) {
	     userRepository.save(user);
		
	}

	@Override
	public User findByEmailIdAndPassword(String email,String password) {
		return userRepository.findByEmailAndPassword(email,password);
	}

}
