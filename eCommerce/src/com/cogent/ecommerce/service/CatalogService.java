package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Catalog;

public interface CatalogService {
	public String addCatalog(Catalog Catalog);
	public String deleteCatalogById(String id);
	public void deleteAllCatalogs();
	public Catalog getCatalogById(String id);
	public List<Catalog> getCatalogs();
	public Catalog[] getCatalogsByName(String name);
	public String updateCatalog(String id, Catalog Catalog);
}
