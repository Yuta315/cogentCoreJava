package com.cogent.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Orders;

public interface OrdersRepository {
	public String addOrders(Orders Orders);
	public String deleteOrdersById(String orderId) throws IdNotFoundException;
	public void deleteAllOrderss();
	public Optional<Orders> getOrdersById(String orderId) throws IdNotFoundException;
	public Optional<List<Orders>> getOrders();
	public String updateOrders(String orderId, Orders Orders) throws IdNotFoundException;
	public boolean isOrdersExists(String orderId) throws IdNotFoundException;
}
