package com.example.Almavet.Service;

import com.example.Almavet.Entity.User;

public interface UserService {

    public boolean findByUsernameAndPassword(String username, String password);
}
