package com.dxc.repository;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import com.dxc.model.RegularTrip;
@Repository
public interface RegularTripRepository extends JpaRepository<RegularTrip, Integer>{

	Optional<RegularTrip> findByRtripId(String rtripId);
	RegularTrip findByDriverId(String driverId);
	List<RegularTrip> findByOriginAndDestination(String origin, String destination);
	Optional<RegularTrip> findByRtripId(Integer rtripId);
   
}

