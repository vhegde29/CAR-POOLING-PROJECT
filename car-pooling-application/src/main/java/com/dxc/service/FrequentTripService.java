package com.dxc.service;

import java.util.List;
import java.util.Optional;

import com.dxc.model.FrequentTrip;

public interface FrequentTripService {
	FrequentTrip findByFtripId(Integer  ftripId);
	Optional<FrequentTrip> findByDriverId(String driverId);
	void saveOrUpdateUser(FrequentTrip frequentTrip);
	void deleteFtripbyid(Integer  ftripId);
	List<FrequentTrip> findByOriginAndDestination(String origin, String destination);
	List<FrequentTrip> findAll();
}

