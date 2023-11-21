package com.hexaware.fastXBus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hexaware.fastXBus.entity.Trips;
@Repository
public interface ITripsRepository extends JpaRepository<Trips,Long > {

}
