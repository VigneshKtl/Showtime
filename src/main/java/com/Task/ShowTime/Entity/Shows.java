package com.Task.ShowTime.Entity;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Shows {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDate Date;

	private LocalTime Showtiming;
	
	@ManyToOne
	@JoinColumn(name = "theater_theatername")
	private Theater theater;
	@ManyToOne
	@JoinColumn(name = "movies_a_moviename")
	private Movies movies;
	public Shows() {
		
	}
	public Shows(int id, LocalDate date, LocalTime showtiming, Theater theater, Movies movies) {
		super();
		this.id = id;
		Date = date;
		Showtiming = showtiming;
		this.theater = theater;
		this.movies = movies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public LocalDate getDate() {
		return Date;
	}
	public void setDate(LocalDate date) {
		Date = date;
	}
	public LocalTime getShowtiming() {
		return Showtiming;
	}
	public void setShowtiming(LocalTime showtiming) {
		Showtiming = showtiming;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public Movies getMovies() {
		return movies;
	}
	public void setMovies(Movies movies) {
		this.movies = movies;
	}
	
}
