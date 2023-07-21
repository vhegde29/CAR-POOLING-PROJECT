package com.dxc.repository;


	import java.util.List;
	import java.util.Optional;

	import org.springframework.data.jpa.repository.JpaRepository;
	import org.springframework.stereotype.Repository;

import com.dxc.model.FrequentTrip;


	@Repository
	public interface FrequentTripRepository extends JpaRepository<FrequentTrip, Integer> {

		
	    Optional<FrequentTrip> findByFtripId(String ftripId);
		FrequentTrip findByDriverId(String driverId);
		List<FrequentTrip> findByOriginAndDestination(String origin, String destination);
		Optional<FrequentTrip> findByFtripId(Integer ftripId);
		List<FrequentTrip> findAll();


	}

