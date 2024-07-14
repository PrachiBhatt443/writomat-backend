package com.ihcarp.writomat.controller;

import com.ihcarp.writomat.entity.User;
import com.ihcarp.writomat.exception.ResourceNotFoundException;
import com.ihcarp.writomat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

//    @CrossOrigin(origins = "https://social-media-analytics-dashboard-self.vercel.app")
    @GetMapping("/analytics/{userId}")
    public Map<String, Object> getUserAnalytics(@PathVariable Long userId) {
        Optional<User> userOptional = userService.getUserWithAnalytics(userId);
        if (userOptional.isPresent()) {
            User user = userOptional.get();
            Map<String, Object> response = new HashMap<>();
            response.put("userName", user.getName());

            List<Map<String, Object>> platformData = user.getAnalytics().stream().map(analytics -> {
                Map<String, Object> platformDetails = new HashMap<>();
                platformDetails.put("platform", analytics.getPlatform());
                platformDetails.put("userDetails", Map.of(
                        "userName", analytics.getUserName(),
                        "category", analytics.getCategory(),
                        "bio", analytics.getBio(),
                        "contact", analytics.getContact(),
                        "link", analytics.getLink()
                ));
                platformDetails.put("accountStats", Map.of(
                        "followers", analytics.getFollowers(),
                        "posts", analytics.getPosts(),
                        "accountReach", analytics.getAccountReach(),
                        "engagement", analytics.getEngagement(),
                        "contentShared", analytics.getContentShared(),
                        "adsRun", analytics.getAdsRun(),
                        "activePromotions", analytics.getActivePromotions()
                ));
                platformDetails.put("totals", Map.of(
                        "totalStories", analytics.getTotalStories(),
                        "totalFollows", analytics.getTotalFollows(),
                        "totalPosts", analytics.getTotalPosts(),
                        "totalSaves", analytics.getTotalSaves(),
                        "totalComments", analytics.getTotalComments(),
                        "totalShares", analytics.getTotalShares()
                ));
                return platformDetails;
            }).toList();

            response.put("platformData", platformData);
            return response;
        } else {
            throw new ResourceNotFoundException("User not found with id " + userId);
        }
    }
}
