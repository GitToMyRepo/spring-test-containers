package com.mywork.springtestcontainers.service;

import com.mywork.springtestcontainers.domain.User;

import java.util.List;

public interface UserService {
    public User saveUser(User user);

    public User findUserById(String id);

    public List<User> findAllUsers();
}
