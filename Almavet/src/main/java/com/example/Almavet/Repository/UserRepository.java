package com.example.Almavet.Repository;


import com.example.Almavet.Entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {
    User findByUsername(String username);
    boolean findByUsernameAndPassword(String username, String password);
}
