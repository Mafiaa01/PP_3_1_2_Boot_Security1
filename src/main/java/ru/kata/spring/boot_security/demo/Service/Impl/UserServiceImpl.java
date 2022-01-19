package ru.kata.spring.boot_security.demo.Service.Impl;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.kata.spring.boot_security.demo.Model.User;
import ru.kata.spring.boot_security.demo.Repositories.UserRepo;
import ru.kata.spring.boot_security.demo.Service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

    private  final UserRepo userRepo;

    public UserServiceImpl(UserRepo userRepo) {

        this.userRepo = userRepo;
    }

    @Override
    public void addUser(User user) {
        userRepo.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepo.deleteUser(id);
    }

    @Override
    public void editUser(User user) {
        userRepo.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.getUserById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepo.getAllUsers();
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.getUserByUsername(username);
    }
}