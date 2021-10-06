package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Catalog;

public interface CatalogRepository {
	
	public String addCatalog(Catalog Catalog);
	public String deleteCatalogById(String catId) throws IdNotFoundException, IOException;
	public void deleteAllCatalogs() throws IdNotFoundException, IOException;
	public Catalog getCatalogById(String catId) throws IdNotFoundException, IOException;
	public List<Catalog> getCatalogs();
	public String updateCatalog(String catId, Catalog Catalog) throws IdNotFoundException, IOException;
	public boolean isCatalogExists(String catId);
}
