package com.Task.ShowTime.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    private Long bookingId;
    private String transactionId;
    private String paymentStatus; // e.g., "SUCCESS", "FAILED"
    private LocalDateTime paymentDateTime;
	public Payment() {
		
	}
	public Payment(Long id, Long bookingId, String transactionId, String paymentStatus, LocalDateTime paymentDateTime) {
		
		this.id = id;
		this.bookingId = bookingId;
		this.transactionId = transactionId;
		this.paymentStatus = paymentStatus;
		this.paymentDateTime = paymentDateTime;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getBookingId() {
		return bookingId;
	}
	public void setBookingId(Long bookingId) {
		this.bookingId = bookingId;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public LocalDateTime getPaymentDateTime() {
		return paymentDateTime;
	}
	public void setPaymentDateTime(LocalDateTime paymentDateTime) {
		this.paymentDateTime = paymentDateTime;
	}

   
}

