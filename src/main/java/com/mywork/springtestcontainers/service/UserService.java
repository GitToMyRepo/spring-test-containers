package com.mywork.springtestcontainers.service;

import com.mywork.springtestcontainers.domain.User;

public interface UserService {
    public User saveUser(User user);

    public User findUserById(String id);
}
