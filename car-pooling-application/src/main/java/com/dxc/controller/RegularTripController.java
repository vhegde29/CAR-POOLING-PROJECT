package com.dxc.controller;

	import java.util.ArrayList;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

	import com.dxc.model.RegularTrip;
	import com.dxc.repository.RegularTripRepository;
	import com.dxc.service.RegularTripService;
import com.dxc.serviceimpl.RegularTripServiceImpl;
@CrossOrigin(origins="http://localhost:4200")
	@RestController
	@RequestMapping("/rtrip")
	public class RegularTripController {
		@Autowired
		private RegularTripServiceImpl regularTripServiceImpl;
		@Autowired
		private RegularTripService regularTripService;
		
		private RegularTripRepository regularTripRepository;
		
		
		@GetMapping("/alltrips")
		public List<RegularTrip> getAllFtrips(){
			return regularTripServiceImpl.findAll();

		}
		@GetMapping(value="/rtripId/{rtripId}")
		public RegularTrip getByRtripId(@PathVariable Integer rtripId ) {
			return regularTripServiceImpl.findByRtripId(rtripId);
		}

		@PostMapping("/rdetails")
		public ResponseEntity<?> saveOrUpdateUser(@RequestBody RegularTrip regularTrip){
			regularTripServiceImpl.saveOrUpdateUser(regularTrip);
			return new ResponseEntity<String>("trip Registered successfully", HttpStatus.OK);
		}

		@DeleteMapping(value="/{rtripId}")
		public ResponseEntity<?> deleteTrip(@PathVariable Integer rtripId) {
			regularTripServiceImpl.deleteRtripbyid(rtripId);
			return new ResponseEntity<String>("trip deleted successfully", HttpStatus.OK);
		}
		
	        
		
		@GetMapping(value="/get/all/{origin}/{destination}")
	    public List<RegularTrip> getPostingsBySearch(@PathVariable String origin,@PathVariable String destination){
			List<RegularTrip> rt=regularTripServiceImpl.findByOriginAndDestination(origin,destination);
			if(rt!=null) {
	        return regularTripServiceImpl.findByOriginAndDestination(origin, destination);
			}
			return  rt;
	    }
		
		@GetMapping("/search")
		public List<RegularTrip> getFlight(@RequestParam("origin") String origin,
				@RequestParam("destination") String destination) {
			return regularTripServiceImpl.findByOriginAndDestination(origin,destination);
		}

	}

