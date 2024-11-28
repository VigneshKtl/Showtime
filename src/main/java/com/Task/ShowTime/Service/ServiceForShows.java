package com.Task.ShowTime.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Movies;
import com.Task.ShowTime.Shows;
import com.Task.ShowTime.Repository.MovieRepository;
import com.Task.ShowTime.Repository.ShowRepository;

@Service
public class ServiceForShows {
	@Autowired
	ShowRepository sr;
    
	@Autowired
	MovieRepository mr;
    public void addMovies(Movies m) {
    	mr.save(m);
    }
    public List<Movies> viewMovies(){
		return mr.findAll();
	}
	public void addShows(Shows s) {
		sr.save(s);
	}
	
	public List<Shows> viewShows(){
		return sr.findAll();
	}
	
	public List<String> getMovies(){
		return sr.getMovies();
	}
	
	public List<Movies> movieDetails(String movie){
		return mr.movieDetails(movie);
	}
	

public List<Shows> showDetails(String movie, LocalDate date){
	return sr.showDetails(movie, date);
}
	
}
