package com.fashionsuperior.service;

import java.util.List;
import java.util.Optional;

import com.fashionsuperior.entities.OrderDetails;
import com.fashionsuperior.entities.Orders;


public interface OrderDetailsService {

	void saveOrderDetails(OrderDetails od);
	OrderDetails findById(int id);
	List<OrderDetails> findByOrder(Orders order);
	
}
