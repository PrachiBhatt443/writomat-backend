package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnalyticsServiceImpl implements AnalyticsService {

    @Autowired
    private AnalyticsRepository analyticsRepository;

    @Override
    public Analytics saveAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    @Override
    public List<Analytics> getAnalyticsByUserId(Long userId) {
        return analyticsRepository.findAllByUserId(userId);
    }
}
