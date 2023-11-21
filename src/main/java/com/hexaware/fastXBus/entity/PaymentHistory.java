package com.hexaware.fastXBus.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

/*
 * Author:Vishal Anand
 * Date: 20-11-23
 */

@Entity
public class PaymentHistory implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	private Long paymentId;
	@Positive
	private float amountPaid;
	@NotNull
	private LocalDate paymentDate;

	@ManyToOne
    @JoinColumn(name = "bookingId")
    private Bookings booking;
	public PaymentHistory() {
	}

	public PaymentHistory(Long paymentId,  float amountPaid, LocalDate paymentDate ) {
		super();
		this.paymentId = paymentId;
		
		this.amountPaid = amountPaid;
		this.paymentDate = paymentDate;
		
	}
	public Bookings getBooking() {
        return booking;
    }

    public void setBooking(Bookings booking) {
        this.booking = booking;
    }

	public Long getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	

	public float getAmountPaid() {
		return amountPaid;
	}

	public void setAmountPaid(float amountPaid) {
		this.amountPaid = amountPaid;
	}

	public LocalDate getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(LocalDate paymentDate) {
		this.paymentDate = paymentDate;
	}

	

	@Override
	public String toString() {
		return "PaymentHistory [paymentId=" + paymentId + ", bookingId=" +  ", amountPaid=" + amountPaid
				+ ", paymentDate=" + paymentDate + ", userId=" +  "]";
	}

	
	

}
