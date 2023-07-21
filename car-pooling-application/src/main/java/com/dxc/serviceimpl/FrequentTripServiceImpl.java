package com.dxc.serviceimpl;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

import com.dxc.model.FrequentTrip;
import com.dxc.repository.FrequentTripRepository;
import com.dxc.service.FrequentTripService;

	@Service
	public class FrequentTripServiceImpl implements FrequentTripService{
		@Autowired
		private FrequentTripRepository frequentTripRepository; 


		@Override
		public FrequentTrip findByFtripId(Integer ftripId) {
			return frequentTripRepository.findByFtripId(ftripId).orElse(null);
		}

		@Override
		public Optional<FrequentTrip> findByDriverId(String driverId) {
			return frequentTripRepository.findByFtripId(driverId);
		}

		@Override
		public void saveOrUpdateUser(FrequentTrip frequentTrip) {
			frequentTripRepository.save(frequentTrip);

		}
		@Override
		public void deleteFtripbyid(Integer ftripId) {
			frequentTripRepository.deleteById(ftripId);

		}
		@Override
	    public List<FrequentTrip> findByOriginAndDestination(String origin, String destination) {
	        return frequentTripRepository.findByOriginAndDestination(origin,destination );
	    }
		@Override
		public List<FrequentTrip> findAll() {
			return frequentTripRepository.findAll();
		}



		}
		
