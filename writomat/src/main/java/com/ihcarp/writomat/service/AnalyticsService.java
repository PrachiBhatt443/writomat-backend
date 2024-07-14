package com.ihcarp.writomat.service;

import com.ihcarp.writomat.entity.Analytics;

import java.util.List;

public interface AnalyticsService {
    Analytics saveAnalytics(Analytics analytics);
    List<Analytics> getAnalyticsByUserId(Long userId);
}
