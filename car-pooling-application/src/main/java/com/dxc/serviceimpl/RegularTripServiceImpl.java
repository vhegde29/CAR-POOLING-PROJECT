package com.dxc.serviceimpl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dxc.model.RegularTrip;
import com.dxc.repository.RegularTripRepository;
import com.dxc.service.RegularTripService;
@Service
public class RegularTripServiceImpl implements RegularTripService {
	@Autowired
	private RegularTripRepository regularTripRepository; 

	@Override
	public List<RegularTrip> findAll() {
		return regularTripRepository.findAll();

	}

	@Override
	public RegularTrip findByRtripId(Integer rtripId) {
		return regularTripRepository.findByRtripId(rtripId).orElse(null);
	}

	@Override
	public Optional<RegularTrip> findByDriverId(String driverId) {
		return regularTripRepository.findByRtripId(driverId);
	}

	@Override
	public void saveOrUpdateUser(RegularTrip regularTrip) {
		regularTripRepository.save(regularTrip);

	}
	@Override
	public void deleteRtripbyid(Integer rtripId) {
		regularTripRepository.deleteById(rtripId);

	}
	@Override
	public List<RegularTrip> findByOriginAndDestination(String origin, String destination) {
		return regularTripRepository.findByOriginAndDestination(origin,destination );
	}


}

