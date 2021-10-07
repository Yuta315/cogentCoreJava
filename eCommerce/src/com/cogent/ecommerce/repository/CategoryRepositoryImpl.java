package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Category;

public class CategoryRepositoryImpl implements CategoryRepository {
	
private Category categorys[] = new Category[10];
	
	private static CategoryRepository categoryRepository;
	
	private CategoryRepositoryImpl() {
		
	}

	public static CategoryRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(categoryRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CategoryRepositoryImpl.class) {
				if(categoryRepository == null) {
					categoryRepository = new CategoryRepositoryImpl();
					return categoryRepository;
				}
			}
		}
		return categoryRepository;
		
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
	public String updateCategory(String id, Category Category) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCategoryExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}

}
