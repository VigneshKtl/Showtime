package com.Task.ShowTime.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalTime bookingtime;
    private LocalDate bookingDate;
    private Double TotalCost;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;
    
    @ManyToOne
    @JoinColumn(name = "shows_id")
    private Shows shows;
    
    @ManyToOne
    @JoinColumn(name = "movies_a_moviename")
    private Movies movies;
    
    @ManyToMany
    @JoinTable(name = "booking_seats",
               joinColumns = @JoinColumn(name = "bookings_id"),
               inverseJoinColumns = @JoinColumn(name = "seats_id"))
    private List<Seats> seats;

	public Bookings(int id, LocalTime bookingtime, LocalDate bookingDate, Double totalCost, Users users, Shows shows,
			Movies movies, List<Seats> seats) {
		super();
		this.id = id;
		this.bookingtime = bookingtime;
		this.bookingDate = bookingDate;
		TotalCost = totalCost;
		this.users = users;
		this.shows = shows;
		this.movies = movies;
		this.seats = seats;
	}

	public Bookings() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getBookingtime() {
		return bookingtime;
	}

	public void setBookingtime(LocalTime bookingtime) {
		this.bookingtime = bookingtime;
	}

	public LocalDate getBookingDate() {
		return bookingDate;
	}

	public void setBookingDate(LocalDate bookingDate) {
		this.bookingDate = bookingDate;
	}

	public Double getTotalCost() {
		return TotalCost;
	}

	public void setTotalCost(Double totalCost) {
		TotalCost = totalCost;
	}

	public Users getUsers() {
		return users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	public Shows getShows() {
		return shows;
	}

	public void setShows(Shows shows) {
		this.shows = shows;
	}

	public Movies getMovies() {
		return movies;
	}

	public void setMovies(Movies movies) {
		this.movies = movies;
	}

	public List<Seats> getSeats() {
		return seats;
	}

	public void setSeats(List<Seats> seats) {
		this.seats = seats;
	}

   
}
