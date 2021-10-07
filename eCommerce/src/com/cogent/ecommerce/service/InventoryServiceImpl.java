package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Category;

public class InventoryServiceImpl implements InventoryService  {
	
	private static InventoryService inventoryService;
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
	

	@Override
	public String addCategory(Category Category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCategoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCategorys() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Category getCategoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Category> getCategorys() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category[] getCategorysByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCategory(String id, Category Category) {
		// TODO Auto-generated method stub
		return null;
	}

}
