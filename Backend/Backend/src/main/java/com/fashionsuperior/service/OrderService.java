package com.fashionsuperior.service;

import java.util.List;

import com.fashionsuperior.entities.Customer;
import com.fashionsuperior.entities.Orders;

public interface OrderService {

	Orders saveOrder(Orders order);
	List<Orders> getAllOrders();
	List<Orders> getCustomerOrders(Customer customer);
	Orders findById(int id);
}


