package com.Task.ShowTime.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Movies;
import com.Task.ShowTime.Repository.MovieRepository;

import jakarta.persistence.Entity;

@Service
public class MovieService {
	@Autowired
	MovieRepository MR;
public void addMovie(Movies movies) {
	MR.save(movies);
}
public Optional<Movies> getMovieDetails(String moviename) {
	
	return MR.getMovieDetails(moviename);
}
public List<Movies> getAllMovies() {
	return MR.findAll();
}
public void updateMovie(Movies movies) {
	
}
public void deleteMovie(String movieId) {
	MR.deleteById(movieId);
}
}
