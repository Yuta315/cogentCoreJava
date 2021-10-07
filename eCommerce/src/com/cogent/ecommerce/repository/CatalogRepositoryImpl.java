package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Catalog;

public class CatalogRepositoryImpl implements CatalogRepository {
	
private Catalog catalogs[] = new Catalog[10];
	
	private static CatalogRepository catalogRepository;
	
	private CatalogRepositoryImpl() {
		
	}

	public static CatalogRepository getInstance()
	{
//		if(cartRepository == null)
//		{
//			cartRepository = new CartRepositoryImpl();
//			return cartRepository;
//		}
//		return cartRepository;
		
		if(catalogRepository == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (CatalogRepositoryImpl.class) {
				if(catalogRepository == null) {
					catalogRepository = new CatalogRepositoryImpl();
					return catalogRepository;
				}
			}
		}
		return catalogRepository;
		
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
	public String updateCatalog(String id, Catalog Catalog) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isCatalogExists(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
