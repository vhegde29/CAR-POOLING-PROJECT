package com.dxc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.dxc.model.User;

public interface UserRepository extends MongoRepository<User, Integer> {
	User findByFname(String fname);

}
