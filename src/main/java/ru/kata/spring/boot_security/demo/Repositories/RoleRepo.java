package ru.kata.spring.boot_security.demo.Repositories;


import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.Model.Role;

import java.util.List;
@Repository
public interface RoleRepo  {
    Role getRoleByName(String name);

    Role getRoleById(Long id);

    List<Role> allRoles();

    Role getDefaultRole();
}
