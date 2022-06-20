package com.example.springbootapp.service;

import com.example.springbootapp.model.User;
import com.example.springbootapp.rep.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repo;


    @Override
    @Transactional
    public void addUser(User user) {
        repo.save(user);
    }

    @Override
    @Transactional
    public void changeUser(User user) {

    }

    @Override
    public User getUserById(Long id) {
         Optional<User> user = repo.findById(id);
         return user.get();
    }

    @Override
    public List<User> listOfUsers() {
       return (List<User>) repo.findAll();
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        repo.deleteById(id);
    }
}
