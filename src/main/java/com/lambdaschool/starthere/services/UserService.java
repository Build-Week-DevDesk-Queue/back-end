package com.lambdaschool.starthere.services;

import com.lambdaschool.starthere.models.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

public interface UserService {

    User findUserByEmail(String email);

    boolean findRoleByUser(String role, User user);

    boolean isAdmin(User user);

    boolean isUser(User user);

    void saveUser(User user);

}