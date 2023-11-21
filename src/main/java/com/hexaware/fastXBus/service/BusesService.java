package com.hexaware.fastXBus.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hexaware.fastXBus.dto.BusesDTO;
import com.hexaware.fastXBus.entity.Buses;
import com.hexaware.fastXBus.repository.IBusesRepository;


@Service
public class BusesService implements IBusesService {
	@Autowired
	IBusesRepository repository;

	@Autowired
	RestTemplate restTemplate;
	private static final Logger logger = LoggerFactory.getLogger(BusesService.class);
	@Override
	public Buses createBuses(BusesDTO busesdto) {
		Buses buses=new Buses();
		buses.setBusId(busesdto.getBusId());
		buses.setOperatorId(buses.getOperatorId());
		buses.setBusNumber(buses.getBusNumber());
		buses.setCapacity(buses.getCapacity());
		buses.setUserId(buses.getUserId());
		buses.setBusRoutes(buses.getBusRoutes());
		return repository.save(buses);
	}

	@Override
	public Buses updateBuses(BusesDTO busesdto, Long busId) {
	    // Find the existing bus by ID
	    Optional<Buses> busOptional = repository.findById(busId);
	    
	    if (busOptional.isPresent()) {
	        // Get the existing bus
	        Buses existingBus = busOptional.get();
	        
	        // Update the fields with new values from DTO
	        existingBus.setOperatorId(busesdto.getOperatorId());
	        existingBus.setBusNumber(busesdto.getBusNumber());
	        existingBus.setCapacity(busesdto.getCapacity());
	        existingBus.setUserId(busesdto.getUserId());
	        existingBus.setBusRoutes(busesdto.getBusRoutes());
	        
	        // Save the updated bus
	        return repository.save(existingBus);
	    } else {
	    	logger.error("Buses not found");
	        return null;
	    }
	}


	@Override
	public void deleteBuses(Long busId) {
		
		repository.deleteById(busId);
	}

	@Override
	public BusesDTO getBusById(Long busId) {
		Buses buses=repository.findById(busId).orElse(new Buses());
		return new BusesDTO(buses.getBusId(),buses.getOperatorId(),buses.getBusNumber(),buses.getCapacity(),buses.getUserId(),buses.getBusRoutes());
	}

	@Override
	public List<Buses> getAllBuses() {
		// TODO Auto-generated method stub
		return repository.findAll(Sort.by("busId"));
	}



	@Override
	public BusesDTO getBybusId(Long busId) {
		Buses buses=repository.findById(busId).orElse(new Buses());
		return new BusesDTO(buses.getBusRoutes());
	} 

	

}
