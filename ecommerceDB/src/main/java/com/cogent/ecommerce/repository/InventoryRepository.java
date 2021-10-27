package com.cogent.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Inventory;

public interface InventoryRepository {
	
	public String addInventory(Inventory Inventory);
	public String deleteInventoryById(String invId) throws IdNotFoundException;
	public void deleteAllInventorys();
//	public Inventory getInventoryById(String invId) throws IdNotFoundException, IOException;
	public Optional<Inventory> getInventoryById(String invId) throws IdNotFoundException;
	public Optional<List<Inventory>> getInventorys();
	public String updateInventory(String invId, Inventory Inventory) throws IdNotFoundException;
	public boolean isInventoryExists(String invId) throws IdNotFoundException;
}
