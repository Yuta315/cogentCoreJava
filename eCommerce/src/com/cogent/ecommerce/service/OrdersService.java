package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Orders;

public interface OrdersService {
	public String addOrders(Orders Orders);
	public String deleteOrdersById(String id);
	public void deleteAllOrderss();
	public Orders getOrdersById(String id);
	public List<Orders> getOrderss();
	public Orders[] getOrderssByName(String name);
	public String updateOrders(String id, Orders Orders);
}
