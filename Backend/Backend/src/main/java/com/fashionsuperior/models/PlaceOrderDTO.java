package com.fashionsuperior.models;
import java.util.List;

import com.fashionsuperior.entities.Address;
import com.fashionsuperior.entities.Payment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PlaceOrderDTO {


	private Address address;
	
	private List<CartDTO> cart;
	
	private Payment payment;
	
	private int customerId;
	
}
