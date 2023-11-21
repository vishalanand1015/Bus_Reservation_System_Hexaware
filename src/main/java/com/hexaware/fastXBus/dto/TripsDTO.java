package com.hexaware.fastXBus.dto;

public class TripsDTO {
	private Long tripId;
	private Long busId;
	private Long operatorId;
	private String sourceCity;
	private String destinationCity;
	private int distanceInKms;
	private int durationInHours;
	private int departureTime;
	private float fare;
	

	public TripsDTO() {
		
	}


	public TripsDTO(Long tripId, Long busId, Long operatorId, String sourceCity, String destinationCity, int distanceInKms,
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
