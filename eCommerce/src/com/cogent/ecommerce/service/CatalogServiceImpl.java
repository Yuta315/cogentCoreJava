package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommerce.repository.CatalogRepository;
import com.cogent.ecommerce.repository.CatalogRepositoryImpl;

public class CatalogServiceImpl implements CatalogService  {
	
	CatalogRepository catalogRepository = CatalogRepositoryImpl.getInstance();
//	are we consuming the repo?
	
//	loose coupling : 
	
	private static CatalogService catalogService;
	private CatalogServiceImpl()
	{
		
	}
	public static CatalogService getInstance()
	{
		if(catalogService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CatalogServiceImpl.class) {
				if(catalogService == null) {
					catalogService = new CatalogServiceImpl();
					return catalogService;
				}
			}
		}
		return catalogService;
	}
	

	@Override
	public String addCatalog(Catalog Catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteCatalogById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllCatalogs() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Catalog getCatalogById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Catalog> getCatalogs() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Catalog[] getCatalogsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateCatalog(String id, Catalog Catalog) {
		// TODO Auto-generated method stub
		return null;
	}

}
