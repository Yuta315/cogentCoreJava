package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Inventory;
import com.cogent.ecommerce.repository.InventoryRepository;

//@Component
@Service

public class InventoryServiceImpl implements InventoryService  {
	
	@Autowired
	private InventoryRepository inventoryRepository;
/*	
	private static InventoryService inventoryService;
	
	private InventoryRepository inventoryRepository = InventoryRepositoryImpl.getInstance();
	
	private InventoryServiceImpl()
	{
		
	}
	public static InventoryService getInstance()
	{
		if(inventoryService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (InventoryServiceImpl.class) {
				if(inventoryService == null) {
					inventoryService = new InventoryServiceImpl();
					return inventoryService;
				}
			}
		}
		return inventoryService;
	}
*/
	
	@Override
	public String addInventory(Inventory Inventory) {
		// TODO Auto-generated method stub
		return inventoryRepository.addInventory(Inventory);
	}

	@Override
	public String deleteInventoryById(String invId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return inventoryRepository.deleteInventoryById(invId);
	}

	@Override
	public void deleteAllInventorys() {
		// TODO Auto-generated method stub
		inventoryRepository.deleteAllInventorys();
	}

	@Override
	public Optional<Inventory> getInventoryById(String invId) throws IdNotFoundException{
		// TODO Auto-generated method stub
		return inventoryRepository.getInventoryById(invId);
	}

	@Override
	public Optional<List<Inventory>> getInventorys() {
		// TODO Auto-generated method stub
		return inventoryRepository.getInventorys();
	}

	@Override
	public String updateInventory(String invId, Inventory Inventory) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return inventoryRepository.updateInventory(invId, Inventory);
	}
	
	@Override
	public boolean isInventoryExists(String invId) throws IdNotFoundException {
		return inventoryRepository.isInventoryExists(invId);
	}

}
