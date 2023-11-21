package com.hexaware.fastXBus.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */


@Entity
public class Bookings implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Long bookingId;
	@NotNull
	private Long tripId;
	@NotNull
	private LocalDate bookingDate;
	@Min(value = 1)
	private int seatNumber;
	@NotBlank
	private String bookingStatus;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private UserCustomers user;
	@OneToMany(mappedBy = "booking")
    private List<PaymentHistory> paymentHistoryList;
	public Bookings() {
		super();
	}
	public Bookings(Long bookingId, Long tripId, LocalDate bookingDate, int seatNumber,
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
	
		this.tripId = tripId;
		this.bookingDate = bookingDate;
		this.seatNumber = seatNumber;
		this.bookingStatus = bookingStatus;
	}
	public List<PaymentHistory> getPaymentHistoryList() {
        return paymentHistoryList;
    }

    public void setPaymentHistoryList(List<PaymentHistory> paymentHistoryList) {
        this.paymentHistoryList = paymentHistoryList;
    }
	public UserCustomers getUser() {
        return user;
    }

    public void setUser(UserCustomers user) {
        this.user = user;
    }
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	
	public Long getTripId() {
		return tripId;
	}
	public void setTripId(Long tripId) {
		this.tripId = tripId;
	}
	public LocalDate getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public String getBookingStatus() {
		return bookingStatus;
	}
	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	@Override
	public String toString() {
		return "Bookings [bookingId=" + bookingId + ", userId=" +  ", tripId=" + tripId + ", bookingDate="
				+ bookingDate + ", seatNumber=" + seatNumber + ", bookingStatus=" + bookingStatus + "]";
	}
	
	
	
}
