package ru.kata.spring.boot_security.demo.Service.Impl;


import org.springframework.stereotype.Service;

import ru.kata.spring.boot_security.demo.Model.Role;

import ru.kata.spring.boot_security.demo.Repositories.RoleRepo;
import ru.kata.spring.boot_security.demo.Service.RoleService;


import java.util.List;
@Service
public class RoleServiceImpl implements RoleService {

  private final RoleRepo roleRepo;

  public RoleServiceImpl(RoleRepo roleRepo){
      this.roleRepo=roleRepo;
  }

    @Override
    public Role getRoleByName(String name) {
        return roleRepo.getRoleByName(name);
    }

    @Override
    public Role getRoleById(Long id) {
        return roleRepo.getRoleById(id);
    }

    @Override
    public List<Role> allRoles() {
        return roleRepo.allRoles();
    }

    @Override
    public Role getDefaultRole() {
        return roleRepo.getDefaultRole();
    }
}
