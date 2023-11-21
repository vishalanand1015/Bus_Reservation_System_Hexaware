package com.hexaware.fastXBus.dto;

public class BusOperatorsDTO {
	private Long operatorId;
	private String operatorname;
	private String password;
	private Long contactPhone;
	private float rating;
	private Long userId;
	private String roles;

	public BusOperatorsDTO() {
		}

	public BusOperatorsDTO(Long operatorId, String operatorname, String password, Long contactPhone, float rating,
			Long userId, String roles) {
		super();
		this.operatorId = operatorId;
		this.operatorname = operatorname;
		this.password = password;
		this.contactPhone = contactPhone;
		this.rating = rating;
		this.userId = userId;
		this.roles = roles;
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

	public void setOperatorName(String operatorname) {
		this.operatorname= operatorname;
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

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	
	
}