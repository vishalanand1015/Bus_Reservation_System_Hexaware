package com.hexaware.fastXBus.service;

import java.util.List;

import com.hexaware.fastXBus.dto.TripsDTO;
import com.hexaware.fastXBus.entity.Trips;


public interface ITripsService {
	public Trips createTrips(TripsDTO trips);
	public Trips updateTrips(TripsDTO trips,Long tripId);
	public void  deleteTrips(Long tripId);
	public TripsDTO getTripsById(Long tripId);
	public List<Trips>getAllTrips();
	

}
