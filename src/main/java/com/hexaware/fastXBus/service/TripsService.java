package com.hexaware.fastXBus.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.fastXBus.dto.TripsDTO;
import com.hexaware.fastXBus.entity.Trips;
import com.hexaware.fastXBus.repository.ITripsRepository;



@Service
public class TripsService implements ITripsService {
	@Autowired
	ITripsRepository repository;

	@Autowired
	RestTemplate restTemplate;
	private static final Logger logger = LoggerFactory.getLogger(TripsService.class);
	@Override
	public Trips createTrips(TripsDTO tripsdto) {
		Trips trips=new Trips();
		trips.setTripId(tripsdto.getBusId());
		trips.setBusId(tripsdto.getBusId());
		trips.setOperatorId(tripsdto.getOperatorId());
		trips.setSourceCity(tripsdto.getSourceCity());
		trips.setDistanceInKms(tripsdto.getDistanceInKms());
		trips.setDurationInHours(tripsdto.getDurationInHours());
		trips.setDepartureTime(tripsdto.getDepartureTime());
		trips.setFare(tripsdto.getFare());
		
		return repository.save(trips);
		
	}

	@Override
	public Trips updateTrips(TripsDTO tripsdto, Long tripId) {
	    
	    Optional<Trips> tripOptional = repository.findById(tripId);
	    
	    if (tripOptional.isPresent()) {
	       
	        Trips existingTrip = tripOptional.get();
	        
	 
	        existingTrip.setBusId(tripsdto.getBusId());
	        existingTrip.setOperatorId(tripsdto.getOperatorId());
	        existingTrip.setSourceCity(tripsdto.getSourceCity());
	        existingTrip.setDestinationCity(tripsdto.getDestinationCity());
	        existingTrip.setDistanceInKms(tripsdto.getDistanceInKms());
	        existingTrip.setDurationInHours(tripsdto.getDurationInHours());
	        existingTrip.setDepartureTime(tripsdto.getDepartureTime());
	        existingTrip.setFare(tripsdto.getFare());
	        
	     
	        return repository.save(existingTrip);
	    } else {
	      
	    	logger.error("Trips not found");
	        return null;
	    }
	}

	@Override
	public void deleteTrips(Long tripId) {
		repository.deleteById(tripId);
	}

	@Override
	public TripsDTO getTripsById(Long tripId) {
		Trips trips=repository.findById(tripId).orElse(new Trips());
		return new TripsDTO(trips.getTripId(),trips.getBusId(),trips.getOperatorId(),trips.getSourceCity(),trips.getDestinationCity(),trips.getDistanceInKms(),trips.getDurationInHours(),trips.getDepartureTime(),trips.getFare());
	}

	@Override
	public List<Trips> getAllTrips() {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by("tripId"));
	}
	
}
