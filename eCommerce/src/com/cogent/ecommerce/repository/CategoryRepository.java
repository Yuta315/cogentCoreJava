package com.cogent.ecommerce.repository;

import java.util.*;
import com.cogent.ecommerce.model.Category;

public interface CategoryRepository {
	
	public String addCategory(Category Category);
	public String deleteCategoryById(String id);
	public void deleteAllCategorys();
	public Category getCategoryById(String id);
	public List<Category> getCategorys();
	public String updateCategory(String id, Category Category);
	public boolean isCategoryExists(String id);
}
