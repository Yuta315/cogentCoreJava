package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Orders;

public interface OrdersRepository {
	public String addOrders(Orders Orders);
	public String deleteOrdersById(String orderId) throws IdNotFoundException, IOException;
	public void deleteAllOrderss() throws IdNotFoundException, IOException;
	public Orders getOrdersById(String orderId) throws IdNotFoundException, IOException;
	public List<Orders> getOrderss();
	public String updateOrders(String orderId, Orders Orders) throws IdNotFoundException, IOException;
	public boolean isOrdersExists(String orderId);
}
