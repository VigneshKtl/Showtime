package com.Task.ShowTime.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Movies;
import com.Task.ShowTime.Entity.Shows;
import com.Task.ShowTime.Entity.Theater;
import com.Task.ShowTime.Repository.MovieRepository;
import com.Task.ShowTime.Repository.ShowRepository;
import com.Task.ShowTime.Repository.TheaterRepository;

@Service
public class ShowService {
	public static final String ResponseEntity = null;
	@Autowired
	ShowRepository showrepository;
	MovieRepository movierepository;
	TheaterRepository theaterrepository;
public void addshows(String movie,String theater,LocalDate date,LocalTime time) {
	Shows s=new Shows();
	Optional<Movies>mv=movierepository.findById(movie);
	Optional<Theater>tr=Optional.ofNullable(theaterrepository.getById(theater));
	Movies m=mv.get();
	Theater t=tr.get();
	s.setMovies(m);
	s.setTheater(t);
	s.setDate(date);
	s.setShowtiming(time);
	
	 showrepository.save(s);
}
public List<Shows> getShowsByDate(LocalDate date) {

return 	showrepository.getShowsByDate(date);	
}
public Optional<Shows> getShowsById(int id) {
	
	return showrepository.findById(id);
}
public List<Shows>  getShowTimimgsForTheater(String theatername) {
	
	return showrepository.getShowTimimgsForTheater(theatername);
}
public void updateShows(Shows shows) {
	
}
public void deleteShows(int id) {
	
}
}
