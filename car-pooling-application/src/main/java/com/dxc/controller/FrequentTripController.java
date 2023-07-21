package com.dxc.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.FrequentTrip;
import com.dxc.repository.FrequentTripRepository;
import com.dxc.service.FrequentTripService;
import com.dxc.serviceimpl.FrequentTripServiceImpl;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/ftrip")
public class FrequentTripController {
	@Autowired
	private FrequentTripService frequentTripService; 
	@Autowired
	private FrequentTripServiceImpl frequentTripServiceImpl;
	
	private FrequentTripRepository frequentTripRepository;
	
	@GetMapping("/alltrips")
	public List<FrequentTrip> getAllFtrips(){
		return frequentTripService.findAll();

	}
	@GetMapping(value="/ftripId/{ftripId}")
	public FrequentTrip getByFtripId(@PathVariable Integer ftripId ) {
		return frequentTripService.findByFtripId(ftripId);
	}

	@PostMapping("/details")
	public ResponseEntity<?> saveTrip(@RequestBody FrequentTrip frequentTrip){
		frequentTripService.saveOrUpdateUser(frequentTrip);
		return new ResponseEntity("trip Registered successfully", HttpStatus.OK);
	}

	@DeleteMapping(value="/{ftripId}")
	public ResponseEntity<?> deleteTrip(@PathVariable Integer ftripId) {
		frequentTripService.deleteFtripbyid(ftripId);
		return new ResponseEntity("trip deleted successfully", HttpStatus.OK);
	}

	@GetMapping(value="/get/all/{origin}/{destination}")
    public List<FrequentTrip> getPostingsBySearch(@PathVariable String origin,@PathVariable String destination){
        return frequentTripServiceImpl.findByOriginAndDestination(origin, destination);
    }


}
























