package com.ihcarp.writomat.controller;
import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "https://social-media-analytics-dashboard-315ftrnp3.vercel.app/")
public class AnalyticsController {
    @Autowired
    private AnalyticsService analyticsService;

    @PostMapping
    public Analytics createAnalytics(@RequestBody Analytics analytics) {
        return analyticsService.saveAnalytics(analytics);
    }

    @GetMapping("/{id}")
    public Analytics getAnalyticsById(@PathVariable Long id) {
        return analyticsService.getAnalyticsById(id);
    }

    @GetMapping
    public List<Analytics> getAllAnalytics() {
        return analyticsService.getAllAnalytics();
    }

    @DeleteMapping("/{id}")
    public void deleteAnalytics(@PathVariable Long id) {
        analyticsService.deleteAnalytics(id);
    }
}
