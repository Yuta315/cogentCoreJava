package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Orders;
import com.cogent.ecommerce.repository.OrdersRepository;

//@Component
@Service

public class OrdersServiceImpl implements OrdersService {
	
	@Autowired
	private OrdersRepository ordersRepository;
/*	
	private static OrdersService ordersService;
	private OrdersRepository ordersRepository = OrdersRepositoryImpl.getInstance();
	
	private OrdersServiceImpl()
	{
		
	}
	public static OrdersService getInstance()
	{
		if(ordersService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (OrdersServiceImpl.class) {
				if(ordersService == null) {
					ordersService = new  OrdersServiceImpl();
					return ordersService;
				}
			}
		}
		return ordersService;
	}
*/	

	@Override
	public String addOrders(Orders Orders) {
		// TODO Auto-generated method stub
		return ordersRepository.addOrders(Orders);
	}

	@Override
	public String deleteOrdersById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return ordersRepository.deleteOrdersById(id);
	}

	@Override
	public void deleteAllOrderss() {
		// TODO Auto-generated method stub
		ordersRepository.deleteAllOrderss();
	}

	@Override
	public Optional<Orders> getOrdersById(String orderId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return ordersRepository.getOrdersById(orderId);
	}
	@Override
	public Optional<List<Orders>> getOrders() {
		// TODO Auto-generated method stub
		return ordersRepository.getOrders();
	}

	@Override
	public String updateOrders(String id, Orders Orders) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return ordersRepository.updateOrders(id, Orders);
	}

	@Override
	public boolean isOrdersExists(String orderId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return ordersRepository.isOrdersExists(orderId);
	}

}
