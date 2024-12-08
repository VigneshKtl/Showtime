package com.Task.ShowTime.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Task.ShowTime.Entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
