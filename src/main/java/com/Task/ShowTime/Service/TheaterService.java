package com.Task.ShowTime.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Theater;
import com.Task.ShowTime.Repository.SeatsRepository;
import com.Task.ShowTime.Repository.TheaterRepository;
@Service
public class TheaterService {
	@Autowired
	TheaterRepository TR;
	SeatsRepository SR;
public void addTheaters(Theater theater) {
	TR.save(theater);
	
}
public Optional<Theater> getTheaterById(String theatername) {
	return TR.findById(theatername);
}
public Theater getAllTheater() {
	return (Theater) TR.findAll();
}
public void deleteTheater(int id) {
	
}
}
