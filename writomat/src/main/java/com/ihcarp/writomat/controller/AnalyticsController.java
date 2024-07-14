package com.ihcarp.writomat.controller;

import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping
    public Analytics createAnalytics(@RequestBody Analytics analytics) {
        return analyticsService.saveAnalytics(analytics);
    }

    @GetMapping("/user/{userId}")
    public List<Analytics> getAnalyticsByUserId(@PathVariable Long userId) {
        return analyticsService.getAnalyticsByUserId(userId);
    }
}
