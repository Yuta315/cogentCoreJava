package com.cogent.ecommerce.service;

import java.util.List;

import com.cogent.ecommerce.model.Role;

public interface RoleService {

	public String addRole(Role Role);
	public String deleteRoleById(String id);
	public void deleteAllRoles();
	public Role getRoleById(String id);
	public List<Role> getRoles();
	public Role[] getRolesByName(String name);
	public String updateRole(String id, Role role);
}
