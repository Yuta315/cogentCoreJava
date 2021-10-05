package com.cogent.ecommerce.repository;

import java.util.List;

import com.cogent.ecommerce.model.Role;


public interface RoleRepository {

	public String addRole(Role Role);
	public String deleteRoleById(String id);
	public void deleteAllRoles();
	public Role getRoleById(String id);
	public List<Role> getRoles();
	public String updateRole(String id, Role role);
	public boolean isRoleExists(String id);
	
}
