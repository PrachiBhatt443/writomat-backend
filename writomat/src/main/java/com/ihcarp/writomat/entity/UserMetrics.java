package com.ihcarp.writomat.entity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "user_metrics")
public class UserMetrics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    private int followersCount;
    private int followingCount;
    private int postsCount;
    private int totalReach;
    private int totalEngagement;
    private int contentSharedCount;
    private int adsRunningCount;
    private int activePromotionsCount;
    private int totalStories;
    private int totalFollows;
    private int totalPosts;
    private int totalSaves;
    private int totalComments;
    private int totalShares;
}