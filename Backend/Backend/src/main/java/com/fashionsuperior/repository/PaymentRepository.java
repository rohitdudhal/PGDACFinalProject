package com.fashionsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionsuperior.entities.Payment;

public interface PaymentRepository extends JpaRepository<Payment,Integer>{

}
