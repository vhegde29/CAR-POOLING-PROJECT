package com.dxc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dxc.model.Car;


public  interface CarRepository extends JpaRepository<Car, Integer>{
	Car findByCarId(Integer carId);
	Car findByCarName(String carName);
	Car findByCarNo(String carNo);
	Car findByCarColour(String carColour);

}


