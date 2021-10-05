package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Catalog;

public interface CatalogRepository {
	
	public String addCatalog(Catalog Catalog);
	public String deleteCatalogById(String id);
	public void deleteAllCatalogs();
	public Catalog getCatalogById(String id);
	public List<Catalog> getCatalogs();
	public String updateCatalog(String id, Catalog Catalog);
	public boolean isCatalogExists(String id);
}
