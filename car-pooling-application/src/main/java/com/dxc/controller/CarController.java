package com.dxc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Car;
import com.dxc.repository.CarRepository;
import com.dxc.service.impl.CarService;


@RestController
@RequestMapping("/car")
public class CarController {
	@Autowired
	private CarService carService;
	@Autowired
	private CarRepository carRepository;
	
	@GetMapping("/allcars")
	public List<Car> getAllCars(){
		return carService.findAll();
		
	}
	
	@PostMapping("/addcar")
	public ResponseEntity<?> saveCar(@RequestBody Car car){
		carService.save(car);
		return new ResponseEntity("car Added successfully", HttpStatus.OK);
	}
//	@PutMapping("/updatecar/{carId}")
//	public ResponseEntity<?> updateCar(@PathVariable (value = "carId")@RequestBody Car car){
//		carService.save(car);
//		return new ResponseEntity("car updated successfully", HttpStatus.OK);
//	}
	
	@PutMapping("/updatecar/{carId}")
	public ResponseEntity<?> updateCar(@PathVariable(value = "carId") Integer carId,
			   @RequestBody Car car) {
			Car carb= carService.findByCarId(carId);
			
			carb.setCarName(car.getCarName());
			carb.setCarNo(car.getCarNo());
			carb.setCarColour(car.getCarColour());
			 
			 carService.update(car);
			 return new ResponseEntity("car updated successfully", HttpStatus.OK);
			}
	
}
