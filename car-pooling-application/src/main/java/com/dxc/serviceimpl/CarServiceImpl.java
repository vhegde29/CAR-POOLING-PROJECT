package com.dxc.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.Car;
import com.dxc.repository.CarRepository;
import com.dxc.repository.UserRepository;
import com.dxc.service.CarService;

@Service
public class CarServiceImpl implements CarService {


	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}
	@Override
	public Car findByCarId(Integer carId) {
		// TODO Auto-generated method stub
		return carRepository.findByCarId(carId);
	}
	@Override
	public void save(Car car) {
		carRepository.save(car);
		
	}

	@Override
	public void update(Car car) {
		carRepository.saveAndFlush(car);
		
	}

	@Override
	public void deleteUser(Integer carId) {
		carRepository.deleteById(carId);
		
	}

}
