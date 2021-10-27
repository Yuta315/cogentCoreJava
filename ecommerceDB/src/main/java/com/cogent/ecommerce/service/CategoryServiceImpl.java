package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Category;
import com.cogent.ecommerce.repository.CategoryRepository;

//@Component
@Service

public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryRepository categoryRepository;
/*	
	CategoryRepository categoryRepository = CategoryRepositoryImpl.getInstance();
//	are we consuming the repo?
	
//	loose coupling : 
	
	private static CategoryService categoryService;
	private CategoryServiceImpl()
	{
		
	}
	public static CategoryService getInstance()
	{
		if(categoryService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CategoryServiceImpl.class) {
				if(categoryService == null) {
					categoryService = new CategoryServiceImpl();
					return categoryService;
				}
			}
		}
		return categoryService;
	}
*/	

	@Override
	public String addCategory(Category Category) {
		// TODO Auto-generated method stub
		return categoryRepository.addCategory(Category);
	}

	@Override
	public String deleteCategoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return categoryRepository.deleteCategoryById(id);
	}

	@Override
	public void deleteAllCategorys() {
		// TODO Auto-generated method stub
		categoryRepository.deleteAllCategorys();
	}

	@Override
	public Optional<Category> getCategoryById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return categoryRepository.getCategoryById(id);
	}

	@Override
	public Optional<List<Category>> getCategorys() throws IdNotFoundException {
		// TODO Auto-generated method stub
		return categoryRepository.getCategorys();
	}

	@Override
	public String updateCategory(String id, Category Category) {
		// TODO Auto-generated method stub
		return categoryRepository.updateCategory(id, Category);
	}

	@Override
	public boolean isCategoryExists(String catId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return categoryRepository.isCategoryExists(catId);
	}

}
