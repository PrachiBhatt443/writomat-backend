package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.entity.User;
import com.ihcarp.writomat.repository.AnalyticsRepository;
import com.ihcarp.writomat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Autowired
    private UserRepository userRepository;

    public Analytics getAnalyticsById(Long id) {
        return analyticsRepository.findById(id).orElse(null);
    }

    public List<Analytics> getAnalyticsByUserId(Long userId) {
        return analyticsRepository.findAll().stream()
                .filter(analytics -> analytics.getUser().getId().equals(userId))
                .toList();
    }

    public Analytics createAnalytics(Long userId, Analytics analytics) {
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            analytics.setUser(user);
            return analyticsRepository.save(analytics);
        }
        return null;
    }

    public Analytics updateAnalytics(Long id, Analytics analytics) {
        if (analyticsRepository.existsById(id)) {
            analytics.setId(id);
            return analyticsRepository.save(analytics);
        }
        return null;
    }

    public boolean deleteAnalytics(Long id) {
        if (analyticsRepository.existsById(id)) {
            analyticsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
