package com.cogent.ecommerce.repository;

import java.io.IOException;
import java.util.List;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Role;


public interface RoleRepository {

	public String addRole(Role role);
	public String deleteRoleById(String roleId) throws IdNotFoundException, IOException;
	public void deleteAllRoles() throws IdNotFoundException, IOException;
	public Role getRoleById(String roleId) throws IdNotFoundException, IOException;
	public List<Role> getRoles();
	public String updateRole(String roleId, Role role) throws IdNotFoundException, IOException;
	public boolean isRoleExists(String roleId);
	
}
