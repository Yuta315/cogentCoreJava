package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Catalog;
import com.cogent.ecommerce.repository.CatalogRepository;

//@Component
@Service

public class CatalogServiceImpl implements CatalogService  {

	@Autowired
	private CatalogRepository catalogRepository;
/*	
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
*/	

	@Override
	public String addCatalog(Catalog Catalog) {
		// TODO Auto-generated method stub
		return catalogRepository.addCatalog(Catalog);
	}

	@Override
	public String deleteCatalogById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return catalogRepository.deleteCatalogById(id);
	}

	@Override
	public void deleteAllCatalogs() {
		// TODO Auto-generated method stub
		catalogRepository.deleteAllCatalogs();
	}

	@Override
	public Optional<Catalog> getCatalogById(String id) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return catalogRepository.getCatalogById(id);
	}

	@Override
	public Optional<List<Catalog>> getCatalogs() {
		// TODO Auto-generated method stub
		return catalogRepository.getCatalogs();
	}

//	@Override
//	public Catalog[] getCatalogsByName(String name) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	@Override
	public String updateCatalog(String id, Catalog Catalog) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return catalogRepository.updateCatalog(id, Catalog);
	}
	
	@Override
	public boolean isCatalogExists(String catId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return catalogRepository.isCatalogExists(catId);
	}

}
