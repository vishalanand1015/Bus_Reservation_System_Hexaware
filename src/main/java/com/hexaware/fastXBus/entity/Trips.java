package com.hexaware.fastXBus.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */


@Entity
public class Trips implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	private Long tripId;
	@NotNull
	private Long busId;
	@NotNull
	private Long operatorId;
	private String sourceCity;
	@NotBlank
	private String destinationCity;
	@Min(value = 1)
	private int distanceInKms;
	@Min(value = 1)
	private int durationInHours;
	@Min(value = 0)
	private int departureTime;
	@Positive
	private float fare;
	

	public Trips() {
		
	}


	public Trips(Long tripId, Long busId, Long operatorId, String sourceCity, String destinationCity, int distanceInKms,
			int durationInHours, int departureTime, float fare) {
		super();
		this.tripId = tripId;
		this.busId = busId;
		this.operatorId = operatorId;
		this.sourceCity = sourceCity;
		this.destinationCity = destinationCity;
		this.distanceInKms = distanceInKms;
		this.durationInHours = durationInHours;
		this.departureTime = departureTime;
		this.fare = fare;
	}


	public Long getTripId() {
		return tripId;
	}


	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}


	public Long getBusId() {
		return busId;
	}


	public void setBusId(Long busId) {
		this.busId = busId;
	}


	public Long getOperatorId() {
		return operatorId;
	}


	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}


	public String getSourceCity() {
		return sourceCity;
	}


	public void setSourceCity(String sourceCity) {
		this.sourceCity = sourceCity;
	}


	public String getDestinationCity() {
		return destinationCity;
	}


	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}


	public int getDistanceInKms() {
		return distanceInKms;
	}


	public void setDistanceInKms(int distanceInKms) {
		this.distanceInKms = distanceInKms;
	}


	public int getDurationInHours() {
		return durationInHours;
	}


	public void setDurationInHours(int durationInHours) {
		this.durationInHours = durationInHours;
	}


	public int getDepartureTime() {
		return departureTime;
	}


	public void setDepartureTime(int departureTime) {
		this.departureTime = departureTime;
	}


	public float getFare() {
		return fare;
	}


	public void setFare(float fare) {
		this.fare = fare;
	}


	@Override
	public String toString() {
		return "Trips [tripId=" + tripId + ", busId=" + busId + ", operatorId=" + operatorId + ", sourceCity="
				+ sourceCity + ", destinationCity=" + destinationCity + ", distanceInKms=" + distanceInKms
				+ ", durationInHours=" + durationInHours + ", departureTime=" + departureTime + ", fare=" + fare + "]";
	}



}
