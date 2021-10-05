package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Orders;

public interface OrdersRepository {
	public String addOrders(Orders Orders);
	public String deleteOrdersById(String id);
	public void deleteAllOrderss();
	public Orders getOrdersById(String id);
	public List<Orders> getOrderss();
	public String updateOrders(String id, Orders Orders);
	public boolean isOrdersExists(String id);
}
