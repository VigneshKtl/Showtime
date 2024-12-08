package com.Task.ShowTime.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Seats {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String Seatnum;
	@Column(name="'row'")
	private String row;
	private double ticketrate;
	private boolean isavailable;
	@ManyToOne
    private Shows shows;
	public Seats() {
		
	}
	public Seats(int id, String seatnum, String row, double ticketrate, boolean isavailable, Shows shows) {
		super();
		this.id = id;
		Seatnum = seatnum;
		this.row = row;
		this.ticketrate = ticketrate;
		this.isavailable = isavailable;
		this.shows = shows;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSeatnum() {
		return Seatnum;
	}
	public void setSeatnum(String seatnum) {
		Seatnum = seatnum;
	}
	public String getRow() {
		return row;
	}
	public void setRow(String row) {
		this.row = row;
	}
	public double getTicketrate() {
		return ticketrate;
	}
	public void setTicketrate(double ticketrate) {
		this.ticketrate = ticketrate;
	}
	public boolean isIsavailable() {
		return isavailable;
	}
	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}
	public Shows getShows() {
		return shows;
	}
	public void setShows(Shows shows) {
		this.shows = shows;
	}
	
}
