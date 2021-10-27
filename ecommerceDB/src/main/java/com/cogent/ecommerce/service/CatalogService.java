package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Catalog;

public interface CatalogService {
	public String addCatalog(Catalog Catalog);
	public String deleteCatalogById(String catId) throws IdNotFoundException;
	public void deleteAllCatalogs();
	public Optional<Catalog> getCatalogById(String catId) throws IdNotFoundException;
	public Optional<List<Catalog>> getCatalogs();
	public String updateCatalog(String catId, Catalog Catalog) throws IdNotFoundException;
	public boolean isCatalogExists(String catId) throws IdNotFoundException;
}
