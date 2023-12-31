package com.hexaware.fastXBus.entity;
import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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
public class Admin implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long adminId;
	@NotNull
	@NotBlank(message = "First name cannot be blank")
	@Size(min=2, max=30)
	private String firstname;
	@NotNull
	@Size(min=2, max=30)
	private String lastName;
	@NotNull
	@Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$")
	private String email;
	@NotNull
    private String password;
	//@Pattern(regexp = "^[0-9]{10}")
    private String phoneNumber;
	private String getRole;
	public Admin() {
		super();
	}
	public Admin(Long adminId,
			@NotNull @NotBlank(message = "First name cannot be blank") @Size(min = 2, max = 30) String firstname,
			@NotNull @Size(min = 2, max = 30) String lastName,
			@NotNull @Email(regexp = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$") String email,
			@NotNull  String password,
			@Pattern(regexp = "^[0-9]{10}") String phoneNumber, String getRole) {
		super();
		this.adminId = adminId;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.getRole = getRole;
	}
	public Long getAdminId() {
		return adminId;
	}
	public void setAdminId(Long adminId) {
		this.adminId = adminId;
	}
	public String getFirstName() {
		return firstname;
	}
	public void setFirstName(String firstname) {
		this.firstname = firstname;
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
	public String getGetRole() {
		return getRole;
	}
	public void setGetRole(String getRole) {
		this.getRole = getRole;
	}
	
	
	
}