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

    @CrossOrigin(origins = "https://social-media-analytics-dashboard-self.vercel.app")
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
                // Log values to debug NullPointerException
                System.out.println("User Name: " + analytics.getUserName());
                System.out.println("Category: " + analytics.getCategory());
                System.out.println("Bio: " + analytics.getBio());
                System.out.println("Contact: " + analytics.getContact());
                System.out.println("Link: " + analytics.getLink());
                System.out.println("Followers: " + analytics.getFollowers());
                System.out.println("Posts: " + analytics.getPosts());
                System.out.println("Account Reach: " + analytics.getAccountReach());
                System.out.println("Engagement: " + analytics.getEngagement());
                System.out.println("Content Shared: " + analytics.getContentShared());
                System.out.println("Ads Run: " + analytics.getAdsRun());
                System.out.println("Active Promotions: " + analytics.getActivePromotions());
                System.out.println("Total Stories: " + analytics.getTotalStories());
                System.out.println("Total Follows: " + analytics.getTotalFollows());
                System.out.println("Total Posts: " + analytics.getTotalPosts());
                System.out.println("Total Saves: " + analytics.getTotalSaves());
                System.out.println("Total Comments: " + analytics.getTotalComments());
                System.out.println("Total Shares: " + analytics.getTotalShares());

                platformDetails.put("userDetails", Map.of(
                        "userName", analytics.getUserName() != null ? analytics.getUserName() : "John",
                        "category", analytics.getCategory() != null ? analytics.getCategory() : "",
                        "bio", analytics.getBio() != null ? analytics.getBio() : "",
                        "contact", analytics.getContact() != null ? analytics.getContact() : "",
                        "link", analytics.getLink() != null ? analytics.getLink() : ""
                ));
                platformDetails.put("accountStats", Map.of(
                        "followers", analytics.getFollowers() != null ? analytics.getFollowers() : 0,
                        "posts", analytics.getPosts() != null ? analytics.getPosts() : 0,
                        "accountReach", analytics.getAccountReach() != null ? analytics.getAccountReach() : 0,
                        "engagement", analytics.getEngagement() != null ? analytics.getEngagement() : 0,
                        "contentShared", analytics.getContentShared() != null ? analytics.getContentShared() : 0,
                        "adsRun", analytics.getAdsRun() != null ? analytics.getAdsRun() : 10,
                        "activePromotions", analytics.getActivePromotions() != null ? analytics.getActivePromotions() : 0
                ));
                platformDetails.put("totals", Map.of(
                        "totalStories", analytics.getTotalStories() != null ? analytics.getTotalStories() : 50,
                        "totalFollows", analytics.getTotalFollows() != null ? analytics.getTotalFollows() : 350,
                        "totalPosts", analytics.getTotalPosts() != null ? analytics.getTotalPosts() : 70,
                        "totalSaves", analytics.getTotalSaves() != null ? analytics.getTotalSaves() : 30,
                        "totalComments", analytics.getTotalComments() != null ? analytics.getTotalComments() : 200,
                        "totalShares", analytics.getTotalShares() != null ? analytics.getTotalShares() : 100
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
