package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Orders;

public class OrdersServiceImpl implements OrdersService {
	
	private static OrdersService ordersService;
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
	

	@Override
	public String addOrders(Orders Orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteOrdersById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllOrderss() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Orders getOrdersById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Orders> getOrderss() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Orders[] getOrderssByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateOrders(String id, Orders Orders) {
		// TODO Auto-generated method stub
		return null;
	}

}
