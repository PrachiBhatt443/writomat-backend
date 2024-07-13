package com.ihcarp.writomat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platform;
    private int followers;
    private int following;
    private int posts;
    private String category;
    private String bio;
    private String contactOptions;
    private String links;
    private int accountReach;
    private int accountEngagement;
    private int contentShared;
    private int adsRun;
    private int activePromotions;
    private int totalStories;
    private int totalFollows;
    private int totalPosts;
    private int totalSaves;
    private int totalComments;
    private int totalShares;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Getters and Setters for all fields

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getFollowers() {
        return followers;
    }

    public void setFollowers(int followers) {
        this.followers = followers;
    }

    public int getFollowing() {
        return following;
    }

    public void setFollowing(int following) {
        this.following = following;
    }

    public int getPosts() {
        return posts;
    }

    public void setPosts(int posts) {
        this.posts = posts;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getContactOptions() {
        return contactOptions;
    }

    public void setContactOptions(String contactOptions) {
        this.contactOptions = contactOptions;
    }

    public String getLinks() {
        return links;
    }

    public void setLinks(String links) {
        this.links = links;
    }

    public int getAccountReach() {
        return accountReach;
    }

    public void setAccountReach(int accountReach) {
        this.accountReach = accountReach;
    }

    public int getAccountEngagement() {
        return accountEngagement;
    }

    public void setAccountEngagement(int accountEngagement) {
        this.accountEngagement = accountEngagement;
    }

    public int getContentShared() {
        return contentShared;
    }

    public void setContentShared(int contentShared) {
        this.contentShared = contentShared;
    }

    public int getAdsRun() {
        return adsRun;
    }

    public void setAdsRun(int adsRun) {
        this.adsRun = adsRun;
    }

    public int getActivePromotions() {
        return activePromotions;
    }

    public void setActivePromotions(int activePromotions) {
        this.activePromotions = activePromotions;
    }

    public int getTotalStories() {
        return totalStories;
    }

    public void setTotalStories(int totalStories) {
        this.totalStories = totalStories;
    }

    public int getTotalFollows() {
        return totalFollows;
    }

    public void setTotalFollows(int totalFollows) {
        this.totalFollows = totalFollows;
    }

    public int getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(int totalPosts) {
        this.totalPosts = totalPosts;
    }

    public int getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(int totalSaves) {
        this.totalSaves = totalSaves;
    }

    public int getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(int totalComments) {
        this.totalComments = totalComments;
    }

    public int getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(int totalShares) {
        this.totalShares = totalShares;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
