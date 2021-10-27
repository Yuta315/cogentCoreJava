package com.cogent.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Category;

public interface CategoryRepository {
	
	public String addCategory(Category Category);
	public String deleteCategoryById(String catId) throws IdNotFoundException;
	public void deleteAllCategorys();
	public Optional<Category> getCategoryById(String catId) throws IdNotFoundException;
	public Optional<List<Category>> getCategorys();
	public String updateCategory(String catId, Category Category) throws IdNotFoundException;
	public boolean isCategoryExists(String catId) throws IdNotFoundException;
}
