package com.cogent.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cogent.ecommerce.exception.IdNotFoundException;
import com.cogent.ecommerce.model.Role;
import com.cogent.ecommerce.repository.RoleRepository;

//@Component
@Service

public class RoleServiceImpl implements RoleService {
	
	@Autowired
	private RoleRepository roleRepository;
/*	
	private static RoleService roleService;
	private RoleRepository roleRepository = RoleRepositoryImpl.getInstance();
	
	private RoleServiceImpl()
	{
		
	}
	public static RoleService getInstance()
	{
		if(roleService == null) {
			
//			synchronized (cartRepositoryALImpl.class) {
			synchronized (RoleServiceImpl.class) {
				if(roleService == null) {
					roleService = new  RoleServiceImpl();
					return roleService;
				}
			}
		}
		return roleService;
	}
*/	
	
	@Override
	public String addRole(Role Role) {
		// TODO Auto-generated method stub
		return roleRepository.addRole(Role);
	}

	@Override
	public String deleteRoleById(String id) {
		// TODO Auto-generated method stub
		return roleRepository.deleteRoleById(id);
	}

	@Override
	public void deleteAllRoles() {
		// TODO Auto-generated method stub
		roleRepository.deleteAllRoles();
		
	}

	@Override
	public Optional<Role> getRoleById(String roleId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return roleRepository.getRoleById(roleId);
	}

	@Override
	public Optional<List<Role>> getRoles() {
		// TODO Auto-generated method stub
		return roleRepository.getRoles();
	}

	@Override
	public String updateRole(String id, Role role) {
		// TODO Auto-generated method stub
		return roleRepository.updateRole(id, role);
	}

	@Override
	public boolean isRoleExists(String roleId) throws IdNotFoundException {
		// TODO Auto-generated method stub
		return roleRepository.isRoleExists(roleId);
	}

}
