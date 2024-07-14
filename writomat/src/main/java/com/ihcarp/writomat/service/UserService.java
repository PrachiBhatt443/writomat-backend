package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.User;

import java.util.Optional;

public interface UserService {
    User saveUser(User user);
    User getUserById(Long id);
    Optional<User> getUserWithAnalytics(Long id);
}
