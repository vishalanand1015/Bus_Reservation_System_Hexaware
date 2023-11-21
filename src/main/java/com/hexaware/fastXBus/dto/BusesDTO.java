package com.hexaware.fastXBus.dto;

public class BusesDTO {
	private Long busId;
	private Long operatorId;
	private String busNumber;
	private int capacity;
	private Long userId;
	private String busRoutes;
	

	public BusesDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public BusesDTO(String busRoutes) {
		super();
		this.busRoutes = busRoutes;
	}



	public BusesDTO(Long busId, Long operatorId, String busNumber, int capacity, Long userId, String busRoutes) {
		super();
		this.busId = busId;
		this.operatorId = operatorId;
		this.busNumber = busNumber;
		this.capacity = capacity;
		this.userId = userId;
		this.busRoutes = busRoutes;
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


	public String getBusNumber() {
		return busNumber;
	}


	public void setBusNumber(String busNumber) {
		this.busNumber = busNumber;
	}


	public int getCapacity() {
		return capacity;
	}


	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getBusRoutes() {
		return busRoutes;
	}


	public void setBusRoutes(String busRoutes) {
		this.busRoutes = busRoutes;
	}


}
