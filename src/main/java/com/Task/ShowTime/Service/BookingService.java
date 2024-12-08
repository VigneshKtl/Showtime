package com.Task.ShowTime.Service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Task.ShowTime.Entity.Bookings;
import com.Task.ShowTime.Entity.Movies;
import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Shows;
import com.Task.ShowTime.Entity.Users;
import com.Task.ShowTime.Exceptions.EntityNotFoundException;
import com.Task.ShowTime.Repository.BookingsRepository;
import com.Task.ShowTime.Repository.MovieRepository;
import com.Task.ShowTime.Repository.SeatsRepository;
import com.Task.ShowTime.Repository.ShowRepository;
import com.Task.ShowTime.Repository.UserRepository;

@Service
public class BookingService {
	@Autowired
	BookingsRepository bookingrepository;
	ShowRepository showrepository;
	MovieRepository movirepository;
	UserRepository userrepository;
	SeatsRepository seatrepository;

public void createBooking(int userId,int showtimingId,List<Integer>seatId) {
	Users user=userrepository.findById(userId)
   .orElseThrow(() -> new EntityNotFoundException("User Not Found Please Create the account "));
	

	Optional<Shows> shows= showrepository.findById(showtimingId);
	//[1,2,3]		
	List<Seats>seats=seatrepository.findAllById(seatId);
	Bookings bookings=new Bookings();
		Iterator<Seats> st=seats.iterator();
		while(st.hasNext()) {
			Seats s=st.next();
			s.getId();
			s.getSeatnum();
			s.getTicketrate();
			
			
			s.getShows().getTheater();
			s.getShows().getMovies();
			
			
			bookings.setUsers(user);
			bookings.setMovies(s.getShows().getMovies());
			bookings.setBookingDate(s.getShows().getDate());
			bookings.setBookingtime(s.getShows().getShowtiming());
			bookings.setSeats(seats);
			bookings.setShows(s.getShows());
			bookings.setTotalCost(s.getTicketrate()*seats.size());
		}
		
	bookingrepository.save(bookings);
}

	public List<Bookings> getBookingById(int userId,int bookingId) {
		Optional<Users> user=userrepository.findById(userId);
		Users u=user.get();
		Optional<Bookings> bookings=bookingrepository.findById(bookingId);
		Bookings b=bookings.get();
		if(u.getId()==b.getUsers().getId()) {
			return (List<Bookings>) b;
		}
		
		return null;
	}

	public void cancelBooking(int bookingID) {
     bookingrepository.deleteById(bookingID);
	}
}
