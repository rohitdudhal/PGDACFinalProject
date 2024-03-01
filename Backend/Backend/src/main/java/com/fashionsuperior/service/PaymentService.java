package com.fashionsuperior.service;

import com.fashionsuperior.entities.Payment;

public interface PaymentService {

	Payment savePayment(Payment payment);
	
	Payment findPaymentById(int id);
}
