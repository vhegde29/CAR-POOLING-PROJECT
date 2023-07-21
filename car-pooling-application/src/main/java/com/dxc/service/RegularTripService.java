package com.dxc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.dxc.model.RegularTrip;
@Service
public interface RegularTripService {


	List<RegularTrip> findAll();
	RegularTrip findByRtripId(Integer  rtripId);
	Optional<RegularTrip> findByDriverId(String driverId);
	void saveOrUpdateUser(RegularTrip regularTrip);
	void deleteRtripbyid(Integer  rtripId);
	List<RegularTrip> findByOriginAndDestination(String origin, String destination);

}

