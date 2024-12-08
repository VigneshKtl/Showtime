package com.Task.ShowTime.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Shows;
import com.Task.ShowTime.Repository.SeatsRepository;
import com.Task.ShowTime.Repository.ShowRepository;

@Service
public class SeatService {
	@Autowired
	SeatsRepository seatsrepository;
	ShowRepository  showrepository;
public void addSeats(Seats seats) {
	seatsrepository.save(seats);
}
public List<Seats> getAvailableSeats(int showTimeId) {
//	Optional<Shows> shows=showrepository.findById(showTimeId);
//	Shows s1=shows.get();
	List<Seats> seats=seatsrepository.findAll();
	for(Seats st:seats) {
		if(st.isIsavailable()&&st.getShows().getId()==showTimeId) {
			return seats;
		}
	}
return null;	
}
public List<Seats> bookSeat(int seatId,int showTimeId) {
	List<Seats> seats=seatsrepository.findAll();
	
	for(Seats st:seats) {
	if(st.getId()==seatId&&st.getShows().getId()==showTimeId) {
	st.setIsavailable(false);
	return seats;
	}
	}
	return null;
}
public void cancelSeat(int seatId,int showTimeId) {
List<Seats> seats=seatsrepository.findAll();
	
	for(Seats st:seats) {
	if(st.getId()==seatId&&st.getShows().getId()==showTimeId) {
	st.setIsavailable(true);;	
	}
	}
}
}
