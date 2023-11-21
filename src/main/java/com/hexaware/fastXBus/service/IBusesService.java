package com.hexaware.fastXBus.service;

import java.util.List;

import com.hexaware.fastXBus.dto.BusesDTO;
import com.hexaware.fastXBus.entity.Buses;

public interface IBusesService {

	public Buses createBuses(BusesDTO busesdto);
	public Buses updateBuses(BusesDTO busesdto,Long busId);
	public void  deleteBuses(Long busId);
	public BusesDTO getBusById(Long busId);
	public BusesDTO getBybusId(Long busId);
	
	public List<Buses>getAllBuses();
}
