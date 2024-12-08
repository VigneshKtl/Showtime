package com.Task.ShowTime.ShowController;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Task.ShowTime.Entity.Movies;
import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Shows;
import com.Task.ShowTime.Repository.MovieRepository;
import com.Task.ShowTime.Repository.ShowRepository;
import com.Task.ShowTime.Service.MovieService;
import com.Task.ShowTime.Service.SeatService;
import com.Task.ShowTime.Service.ShowService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
@RestController
@RequestMapping("/shows")
public class ShowController {
	@Autowired
	MovieService movieservice;
@Autowired
SeatService seatservice;
@Autowired
ShowService showservice;
	@GetMapping("/getAllMovies")
	public ResponseEntity<List<Movies>> getAllMovies(){
		List<Movies> movies=movieservice.getAllMovies();
		 return ResponseEntity.status(HttpStatus.OK).body(movies);
	}
	@GetMapping("/getMovieDetails/{moviname}")
	public ResponseEntity<Optional<Movies>> getMovieDetails(@PathVariable("moviname") String moviename){
		Optional<Movies> movies=movieservice.getMovieDetails(moviename);
		 return ResponseEntity.status(HttpStatus.OK).body(movies);
	}
	
	@GetMapping("/getShowsByDate/{date}")
	public ResponseEntity<List<Shows>> getShowsByDate(@PathVariable("date") LocalDate date){
		List<Shows> shows=showservice.getShowsByDate(date);
		return ResponseEntity.status(HttpStatus.FOUND).body(shows);
	}
	@GetMapping("/getShowsById/{id}")
	public ResponseEntity<Optional<Shows>> getShowsById(@PathVariable("date")int id){
		Optional<Shows> shows=showservice.getShowsById(id);
		return ResponseEntity.status(HttpStatus.FOUND).body(shows);
	}
	@GetMapping("/getAvailableSeats/{showtimeid}")
	public ResponseEntity<List<Seats>> getAvailableSeats(@PathVariable("showtimeid")int id){
	return ResponseEntity.status(HttpStatus.FOUND).body(seatservice.getAvailableSeats(id));	
	}
	@GetMapping("/selectSeat")
	public ResponseEntity<String>bookSeat(@RequestParam("seatId")int seatId,@RequestParam("showTimeId")int showTimeId){
		List<Seats> seats=seatservice.bookSeat(seatId,showTimeId);
		return ResponseEntity.status(HttpStatus.CONTINUE).body("Seat Selected "+"\n"+seats+"\n"+"Now You can go for the booking process(Remember the Seat Id)");
	}
	public ResponseEntity<String>cancelSeat(@RequestParam("seatId")int seatId,@RequestParam("showTimeId")int showTimeId){
		seatservice.cancelSeat(seatId, showTimeId);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("Seat Canceled Succesfully");
	}
}
