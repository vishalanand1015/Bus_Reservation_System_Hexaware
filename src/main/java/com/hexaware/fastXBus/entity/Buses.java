package com.hexaware.fastXBus.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */


@Entity
public class Buses implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	private Long busId;
	@NotNull
	private Long operatorId;
	@NotBlank
    @Size(min = 1, max = 20)
	private String busNumber;
	@Min(value = 1)	
	private int capacity;
	@NotNull
	private Long userId;
	@NotBlank
	private String busRoutes;
	
	public Buses() {
		super();
	}
	

	public Buses(String busRoutes) {
		super();
		this.busRoutes = busRoutes;
	}


	public Buses(Long busId, Long operatorId, String busNumber, int capacity, Long userId, String busRoutes) {
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

	@Override
	public String toString() {
		return "Buses [busId=" + busId + ", operatorId=" + operatorId + ", busNumber=" + busNumber + ", capacity="
				+ capacity + ", userId=" + userId + ", busRoutes=" + busRoutes + "]";
	}



}
