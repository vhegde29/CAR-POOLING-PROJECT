package com.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxc.model.Car;


public interface CarService {
	List<Car> findAll();
	Car findByCarId(Integer carId);
	void save(Car car);
	void update(Car car);
	void deleteUser(Integer carId);
  
			
}
