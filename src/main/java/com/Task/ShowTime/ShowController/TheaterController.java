package com.Task.ShowTime.ShowController;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Task.ShowTime.Entity.Movies;
import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Shows;
import com.Task.ShowTime.Entity.Theater;
import com.Task.ShowTime.Repository.MovieRepository;
import com.Task.ShowTime.Repository.ShowRepository;
import com.Task.ShowTime.Service.MovieService;
import com.Task.ShowTime.Service.SeatService;
import com.Task.ShowTime.Service.ShowService;
import com.Task.ShowTime.Service.TheaterService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/Theater")
public class TheaterController {

@Autowired
MovieService movieservice;

@Autowired
ShowService showservice;
@PostMapping("/addMovies/{movie}/Genre/{genre}/Rating/{rating}")
public String addMovies(@PathVariable("movie") String movie,@PathVariable("genre") String genre,@PathVariable("rating") String rating) {
	Movies mv=new Movies();
	mv.setMoviename(movie);
	mv.setGenre(genre);
	mv.setRating(rating);
	movieservice.addMovie(mv);
return "Movies Added Successfully";	
}

@PostMapping("/addShows/{movie}/Theater/{theater}/Date/{date}/Time/{time}")
public String addShows(@PathVariable("movie") String movie,@PathVariable("theater") String theater,@PathVariable("date")LocalDate date,@PathVariable("time") LocalTime time) {
	
	showservice.addshows(movie, theater, date, time);
return "Shows Added Successfully";	
}

}
