package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.User;
import com.ihcarp.writomat.exception.ResourceNotFoundException;
import com.ihcarp.writomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not found with id " + id));
    }

    @Override
    public Optional<User> getUserWithAnalytics(Long id) {
        return userRepository.findById(id);
    }
}
