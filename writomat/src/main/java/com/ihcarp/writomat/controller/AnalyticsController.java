package com.ihcarp.writomat.controller;

import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.service.AnalyticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/analytics")
@CrossOrigin(origins = "https://social-media-analytics-dashboard-self.vercel.app/")
public class AnalyticsController {

    @Autowired
    private AnalyticsService analyticsService;

    @GetMapping("/{id}")
    public ResponseEntity<Analytics> getAnalyticsById(@PathVariable Long id) {
        Analytics analytics = analyticsService.getAnalyticsById(id);
        if (analytics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(analytics, HttpStatus.OK);
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Analytics>> getAnalyticsByUserId(@PathVariable Long userId) {
        List<Analytics> analyticsList = analyticsService.getAnalyticsByUserId(userId);
        if (analyticsList == null || analyticsList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(analyticsList, HttpStatus.OK);
    }

    @PostMapping("/user/{userId}")
    public ResponseEntity<Analytics> createAnalytics(@PathVariable Long userId, @RequestBody Analytics analytics) {
        Analytics createdAnalytics = analyticsService.createAnalytics(userId, analytics);
        if (createdAnalytics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(createdAnalytics, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Analytics> updateAnalytics(@PathVariable Long id, @RequestBody Analytics analytics) {
        Analytics updatedAnalytics = analyticsService.updateAnalytics(id, analytics);
        if (updatedAnalytics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(updatedAnalytics, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAnalytics(@PathVariable Long id) {
        boolean isDeleted = analyticsService.deleteAnalytics(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
