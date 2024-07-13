package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.User;
import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.repository.UserRepository;
import com.ihcarp.writomat.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AnalyticsRepository analyticsRepository;

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public boolean deleteUser(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public List<Analytics> getUserAnalytics(Long userId) {
        User user = getUserById(userId);
        if (user != null) {
            return user.getAnalytics();
        }
        return null;
    }

    public Analytics createAnalytics(Long userId, Analytics analytics) {
        User user = getUserById(userId);
        if (user != null) {
            analytics.setUser(user);
            return analyticsRepository.save(analytics);
        }
        return null;
    }
}
