package com.hexaware.fastXBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.fastXBus.dto.BusesDTO;
import com.hexaware.fastXBus.entity.Buses;
@Repository
public interface IBusesRepository extends JpaRepository<Buses,Long >{

	public BusesDTO getBybusId(Long busId);
}
