package com.fashionsuperior.service;

import com.fashionsuperior.entities.Address;

public interface AddressService {
	
	Address saveAddress(Address address);
	
	Address findAddress(int id);
}
