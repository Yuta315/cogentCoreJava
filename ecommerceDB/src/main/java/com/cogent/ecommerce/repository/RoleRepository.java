package com.cogent.ecommerce.repository;

import java.util.List;
import java.util.Optional;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Role;


public interface RoleRepository {

	public String addRole(Role role);
	public String deleteRoleById(String roleId) throws IdNotFoundException;
	public void deleteAllRoles() throws IdNotFoundException;
	public Optional<Role> getRoleById(String roleId) throws IdNotFoundException;
	public Optional<List<Role>>getRoles();
	public String updateRole(String roleId, Role role) throws IdNotFoundException;
	public boolean isRoleExists(String roleId) throws IdNotFoundException;
	
}
