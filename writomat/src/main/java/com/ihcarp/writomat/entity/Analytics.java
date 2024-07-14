package com.ihcarp.writomat.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "platform")
    private String platform;

    @Column(name = "userName")
    private String userName;

    @Column(name = "category")
    private String category;

    @Column(name = "bio")
    private String bio;

    @Column(name = "contact")
    private String contact;

    @Column(name = "link")
    private String link;

    @Column(name = "followers")
    private Integer followers;

    @Column(name = "posts")
    private Integer posts;

    @Column(name = "accountReach")
    private Integer accountReach;

    @Column(name = "engagement")
    private Integer engagement;

    @Column(name = "contentShared")
    private Integer contentShared;

    @Column(name = "adsRun")
    private Integer adsRun;

    @Column(name = "activePromotions")
    private Integer activePromotions;

    @Column(name = "totalStories")
    private Integer totalStories;

    @Column(name = "totalFollows")
    private Integer totalFollows;

    @Column(name = "totalPosts")
    private Integer totalPosts;

    @Column(name = "totalSaves")
    private Integer totalSaves;

    @Column(name = "totalComments")
    private Integer totalComments;

    @Column(name = "totalShares")
    private Integer totalShares;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    // Default constructor
    public Analytics() {}

    // Parameterized constructor
    public Analytics(String platform, String userName, String category, String bio, String contact, String link,
                     Integer followers, Integer posts, Integer accountReach, Integer engagement,
                     Integer contentShared, Integer adsRun, Integer activePromotions, Integer totalStories,
                     Integer totalFollows, Integer totalPosts, Integer totalSaves, Integer totalComments,
                     Integer totalShares, User user) {
        this.platform = platform;
        this.userName = userName;
        this.category = category;
        this.bio = bio;
        this.contact = contact;
        this.link = link;
        this.followers = followers;
        this.posts = posts;
        this.accountReach = accountReach;
        this.engagement = engagement;
        this.contentShared = contentShared;
        this.adsRun = adsRun;
        this.activePromotions = activePromotions;
        this.totalStories = totalStories;
        this.totalFollows = totalFollows;
        this.totalPosts = totalPosts;
        this.totalSaves = totalSaves;
        this.totalComments = totalComments;
        this.totalShares = totalShares;
        this.user = user;
    }

    // Getters and Setters
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public Integer getFollowers() {
        return followers;
    }

    public void setFollowers(Integer followers) {
        this.followers = followers;
    }

    public Integer getPosts() {
        return posts;
    }

    public void setPosts(Integer posts) {
        this.posts = posts;
    }

    public Integer getAccountReach() {
        return accountReach;
    }

    public void setAccountReach(Integer accountReach) {
        this.accountReach = accountReach;
    }

    public Integer getEngagement() {
        return engagement;
    }

    public void setEngagement(Integer engagement) {
        this.engagement = engagement;
    }

    public Integer getContentShared() {
        return contentShared;
    }

    public void setContentShared(Integer contentShared) {
        this.contentShared = contentShared;
    }

    public Integer getAdsRun() {
        return adsRun;
    }

    public void setAdsRun(Integer adsRun) {
        this.adsRun = adsRun;
    }

    public Integer getActivePromotions() {
        return activePromotions;
    }

    public void setActivePromotions(Integer activePromotions) {
        this.activePromotions = activePromotions;
    }

    public Integer getTotalStories() {
        return totalStories;
    }

    public void setTotalStories(Integer totalStories) {
        this.totalStories = totalStories;
    }

    public Integer getTotalFollows() {
        return totalFollows;
    }

    public void setTotalFollows(Integer totalFollows) {
        this.totalFollows = totalFollows;
    }

    public Integer getTotalPosts() {
        return totalPosts;
    }

    public void setTotalPosts(Integer totalPosts) {
        this.totalPosts = totalPosts;
    }

    public Integer getTotalSaves() {
        return totalSaves;
    }

    public void setTotalSaves(Integer totalSaves) {
        this.totalSaves = totalSaves;
    }

    public Integer getTotalComments() {
        return totalComments;
    }

    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }

    public Integer getTotalShares() {
        return totalShares;
    }

    public void setTotalShares(Integer totalShares) {
        this.totalShares = totalShares;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
