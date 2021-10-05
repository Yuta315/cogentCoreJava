package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Category;

public interface CategoryService {

	public String addCategory(Category Category);
	public String deleteCategoryById(String id);
	public void deleteAllCategorys();
	public Category getCategoryById(String id);
	public List<Category> getCategorys();
	public Category[] getCategorysByName(String name);
	public String updateCategory(String id, Category Category);
}
