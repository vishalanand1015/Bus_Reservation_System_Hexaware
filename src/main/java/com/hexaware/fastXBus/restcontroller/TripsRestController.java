package com.hexaware.fastXBus.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.fastXBus.dto.TripsDTO;
import com.hexaware.fastXBus.entity.Trips;
import com.hexaware.fastXBus.exceptions.TripsNotFoundException;
import com.hexaware.fastXBus.service.ITripsService;

@RestController
@RequestMapping("/api/v1/trips")
public class TripsRestController {


	@Autowired
	private ITripsService tripsService;
	private static final Logger logger = LoggerFactory.getLogger(TripsRestController.class);
	@PostMapping("/create")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public Trips  createTrips(@RequestBody TripsDTO tripdto) {
		 logger.info("Trips created");
		return tripsService.createTrips(tripdto);
	}
	@PutMapping("/update/{tripId}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_BUSOPERATOR')")
	public Trips  updateTrips(@RequestBody TripsDTO tripdto,@PathVariable Long tripId) {
		logger.info("Trips updated");
		return tripsService.updateTrips(tripdto,tripId);
	}
	@DeleteMapping("/delete/{tripId}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public void deleteTrips(@PathVariable Long tripId)
	{
		logger.info("Trips deleted");
		tripsService.deleteTrips(tripId);
		
	}
	@GetMapping("/getById/{tripId}")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN','ROLE_BUSOPERATOR')")
	public TripsDTO getTripsById(@PathVariable Long tripId) {
		if(tripId==0) {
			throw new TripsNotFoundException(HttpStatus.BAD_REQUEST,"trips not found"+tripId);
		}
			
		
		return tripsService.getTripsById(tripId);	
		
	}
	@GetMapping("/getall")
	@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")
	public List<Trips > getAllTrips(){
		
		logger.info("All Trips");
		return tripsService.getAllTrips();
	
	}
}
