package com.mywork.springtestcontainers.service;

import com.mywork.springtestcontainers.domain.User;
import com.mywork.springtestcontainers.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
@Service
public class UserServiceImpl implements UserService{

    private static final Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        logger.info("Saving {}", user);
        return userRepository.save(user);
    }

    @Override
    public User findUserById(String id) {
        logger.info("Finding user by {}", id);
        return userRepository.findById(id).get();
    }
}