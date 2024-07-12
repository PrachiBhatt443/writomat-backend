package com.ihcarp.writomat.service;
import com.ihcarp.writomat.repository.AnalyticsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.ihcarp.writomat.entity.Analytics;

@Service
public class AnalyticsService {
    @Autowired
    private AnalyticsRepository analyticsRepository;

    public Analytics saveAnalytics(Analytics analytics) {
        return analyticsRepository.save(analytics);
    }

    public Analytics getAnalyticsById(Long id) {
        return analyticsRepository.findById(id).orElse(null);
    }

    public void deleteAnalytics(Long id) {
        analyticsRepository.deleteById(id);
    }

    public List<Analytics> getAllAnalytics() {
        return analyticsRepository.findAll();
    }
}
