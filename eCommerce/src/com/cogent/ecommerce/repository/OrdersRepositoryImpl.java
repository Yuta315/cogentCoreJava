package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Orders;

public class OrdersRepositoryImpl implements OrdersRepository {
	
private Orders orders[] = new Orders[10];
	
	private static OrdersRepository ordersRepository;
	
	private OrdersRepositoryImpl() {
		
	}

	public static OrdersRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(ordersRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (InventoryRepositoryImpl.class) {
				if(ordersRepository == null) {
					ordersRepository = new OrdersRepositoryImpl();
					return ordersRepository;
				}
			}
		}
		return ordersRepository;
		
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
	public String updateOrders(String id, Orders Orders) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isOrdersExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
