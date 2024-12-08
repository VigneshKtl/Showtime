package com.Task.ShowTime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.ShowTime.Entity.Bookings;
import com.Task.ShowTime.Entity.Users;

public interface BookingsRepository extends JpaRepository<Bookings,Integer>{

}
