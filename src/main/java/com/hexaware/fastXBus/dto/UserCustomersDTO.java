package com.hexaware.fastXBus.dto;

public class UserCustomersDTO {
	private Long userId;
	private String firstname;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private String address;
	private String city;
	private String state;
	private double zipCode;
	private String role;


	public UserCustomersDTO() {
		
	}


	public UserCustomersDTO(Long userId, String firstname, String lastName, String email, String password,
			String phoneNumber, String address, String city, String state, double zipCode, String role) {
		super();
		this.userId = userId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.role = role;
	}


	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstname;
	}


	public void setFirstName(String firstName) {
		this.firstname = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public double getZipCode() {
		return zipCode;
	}


	public void setZipCode(double zipCode) {
		this.zipCode = zipCode;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	

}
