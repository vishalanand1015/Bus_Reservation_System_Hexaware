package com.hexaware.fastXBus.dto;

import java.time.LocalDate;

public class BookingsDTO {
	private Long bookingId;
	private Long tripId;
	private LocalDate bookingDate;
	private int seatNumber;
	private String bookingStatus;
	public BookingsDTO() {
		super();
	}
	public BookingsDTO(Long bookingId,  Long tripId, LocalDate bookingDate, int seatNumber,
			String bookingStatus) {
		super();
		this.bookingId = bookingId;
	
		this.tripId = tripId;
		this.bookingDate = bookingDate;
		this.seatNumber = seatNumber;
		this.bookingStatus = bookingStatus;
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
		return "Bookings [bookingId=" + bookingId + ", userId="  + ", tripId=" + tripId + ", bookingDate="
				+ bookingDate + ", seatNumber=" + seatNumber + ", bookingStatus=" + bookingStatus + "]";
	}
	
	
	
}
