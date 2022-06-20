package com.example.springbootapp.rep;

import com.example.springbootapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
