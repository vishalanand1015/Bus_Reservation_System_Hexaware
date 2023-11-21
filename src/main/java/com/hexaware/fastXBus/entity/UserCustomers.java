package com.hexaware.fastXBus.entity;
import java.io.Serializable;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */




@Entity
public class UserCustomers implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long userId;
	@NotBlank
    @Size(min = 2, max = 20)
	private String firstname;
	@NotBlank
    @Size(min = 2, max = 20)
	private String lastName;
	@Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")
	private String email;
	@NotNull
	private String password;
	@Pattern(regexp = "^[0-9]{10}")
	private String phoneNumber;
	private String address;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@Digits(integer = 6,fraction=0)
	private double zipCode;
	private String role;


	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Bookings> bookings;

	public UserCustomers() {
		
	}


	public UserCustomers(Long userId, @NotBlank @Size(min = 2, max = 20) String firstname,
			@NotBlank @Size(min = 2, max = 20) String lastName,
			@Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$") String email,
			@NotNull String password,
			@Pattern(regexp = "^[0-9]{10}") String phoneNumber, String address, @NotBlank String city,
			@NotBlank String state, @Digits(integer = 6, fraction = 0) double zipCode, String role) {
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

	public List<Bookings> getBookings() {
        return bookings;
    }

    public void setBookings(List<Bookings> bookings) {
        this.bookings = bookings;
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
