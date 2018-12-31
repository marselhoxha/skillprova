package com.proxima.skillprova.service;


import com.proxima.skillprova.model.User;

/**
 * Created by Marsel Hoxha on Agosto, 2018
 */
public interface UserService {

    public User findUserByEmail(String email);

    public void saveUser(User user);
}