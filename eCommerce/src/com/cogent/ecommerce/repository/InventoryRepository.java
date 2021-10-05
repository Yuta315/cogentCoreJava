package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Inventory;

public interface InventoryRepository {
	
	public String addInventory(Inventory Inventory);
	public String deleteInventoryById(String id);
	public void deleteAllInventorys();
	public Inventory getInventoryById(String id);
	public List<Inventory> getInventorys();
	public String updateInventory(String id, Inventory Inventory);
	public boolean isInventoryExists(String id);
}
