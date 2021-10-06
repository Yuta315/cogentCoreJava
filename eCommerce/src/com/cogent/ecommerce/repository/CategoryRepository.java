package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.*;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Category;

public interface CategoryRepository {
	
	public String addCategory(Category Category);
	public String deleteCategoryById(String catId) throws IdNotFoundException, IOException;
	public void deleteAllCategorys() throws IdNotFoundException, IOException;
	public Category getCategoryById(String catId) throws IdNotFoundException, IOException;
	public List<Category> getCategorys();
	public String updateCategory(String catId, Category Category) throws IdNotFoundException, IOException;
	public boolean isCategoryExists(String catId);
}
