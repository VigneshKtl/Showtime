package com.Task.ShowTime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.ShowTime.Entity.Seats;
import com.Task.ShowTime.Entity.Users;

public interface UserRepository extends JpaRepository<Users,Integer>{

}
