package com.fashionsuperior.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fashionsuperior.entities.Customer;
import com.fashionsuperior.entities.Orders;
import com.fashionsuperior.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService{
	
	@Autowired
	OrderRepository orderRepo;
	
	@Override
	public Orders saveOrder(Orders order) {
		// TODO Auto-generated method stub
		return orderRepo.save(order);
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return orderRepo.findAll();
	}

	@Override
	public List<Orders> getCustomerOrders(Customer customer) {
		// TODO Auto-generated method stub
		return orderRepo.findByCustomer(customer);
	}

	@Override
	public Orders findById(int id) {
		// TODO Auto-generated method stub
		Optional<Orders> order=orderRepo.findById(id);
		return order.get();
	}

}
