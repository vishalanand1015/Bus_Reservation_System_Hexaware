package com.hexaware.fastXBus.entity;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */




@Entity
public class BusOperators implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long operatorId;
	@NotBlank
    @Size(min = 2, max = 20)
	private String operatorname;
	@NotNull
    private String password;
	@Pattern(regexp = "^[0-9]{10}")
	private Long contactPhone;
	@DecimalMin(value = "0.0")
	@DecimalMax(value = "5.0")
	private float rating;
	@NotNull
	private Long userId;
	private String Role;
	
	public BusOperators() {
		super();
	}

	public BusOperators(Long operatorId, @NotBlank @Size(min = 2, max = 20) String operatorname,
			@NotNull String password,
			Long contactPhone, @DecimalMin("0.0") @DecimalMax("5.0") float rating, @NotNull Long userId, String role) {
		super();
		this.operatorId = operatorId;
		this.operatorname = operatorname;
		this.password = password;
		this.contactPhone = contactPhone;
		this.rating = rating;
		this.userId = userId;
		Role = role;
	}

	public Long getOperatorId() {
		return operatorId;
	}

	public void setOperatorId(Long operatorId) {
		this.operatorId = operatorId;
	}

	public String getOperatorName() {
		return operatorname;
	}

	public void setOperatorName(String operatorName) {
		this.operatorname = operatorname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(Long contactPhone) {
		this.contactPhone = contactPhone;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}


	
}