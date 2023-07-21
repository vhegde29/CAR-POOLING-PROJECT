package com.dxc.service;

import java.util.List;

import com.dxc.model.Car;


public interface ICarService {
	List<Car> findAll();
	Car findByCarId(Integer carId);
	void save(Car car);
	void update(Car car);
	void deleteUser(Integer carId);
}
