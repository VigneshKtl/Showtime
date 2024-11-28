package com.Task.ShowTime.ShowController;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Task.ShowTime.Movies;
import com.Task.ShowTime.Shows;
import com.Task.ShowTime.Service.ServiceForShows;

@RestController
@RequestMapping("/Showtime")
public class ControlShow {

	@Autowired
	ServiceForShows service;
	@PostMapping("/addMovies")
	public String addMovies(@RequestBody Movies sh) {
		service.addMovies(sh);
		return "Movies Details Added";
	}
	@PostMapping("/addShows")
	public String addShows(@RequestBody Shows sh) {
		service.addShows(sh);
		return "Show Details Added";
	}

	@GetMapping("/viewMovies")
	public ResponseEntity viewMovies() {
		List<Movies> Movies = service.viewMovies();
		return new ResponseEntity<>(Movies, HttpStatus.OK);
	}
	@GetMapping("/viewShows")
	public ResponseEntity viewShows() {
		List<Shows> shows = service.viewShows();
		return new ResponseEntity<>(shows, HttpStatus.OK);
	}

	@GetMapping("/getMovies")
	public List<String> getMovies() {
		return service.getMovies();
	}

	@GetMapping("/movieDeatails/{movie}")
	public ResponseEntity movieDeatails(@PathVariable String movie) {
		List<Movies> m = service.movieDetails(movie);
		return new ResponseEntity(m, HttpStatus.OK);
	}

	@GetMapping("/showDetails")
	public ResponseEntity showDetails(@RequestParam("movie") String movie, @RequestParam("date") LocalDate date) {
		List<Shows> s = service.showDetails(movie, date);
		return new ResponseEntity<>(s, HttpStatus.OK);
	}
}
