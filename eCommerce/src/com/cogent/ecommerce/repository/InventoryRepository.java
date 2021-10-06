package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Inventory;

public interface InventoryRepository {
	
	public String addInventory(Inventory Inventory);
	public String deleteInventoryById(String invId) throws IdNotFoundException, IOException;
	public void deleteAllInventorys() throws IdNotFoundException, IOException;
	public Inventory getInventoryById(String invId) throws IdNotFoundException, IOException;
	public List<Inventory> getInventorys();
	public String updateInventory(String invId, Inventory Inventory) throws IdNotFoundException, IOException;
	public boolean isInventoryExists(String invId);
}
