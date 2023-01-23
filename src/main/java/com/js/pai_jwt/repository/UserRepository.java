package com.js.pai_jwt.repository;

import com.js.pai_jwt.model.UserDAO;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserDAO, Long> {
    UserDAO findByUsername(String Username);
}
