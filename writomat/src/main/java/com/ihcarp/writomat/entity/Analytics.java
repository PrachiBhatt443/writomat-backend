package com.ihcarp.writomat.entity;

import lombok.Data;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Data
@Entity
@Table(name = "analytics")
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private User user;

    private Integer accountReach;
    private Integer accountEngaged;  // Changed from accountEngagement to accountEngaged
    private Integer contentShared;
    private Integer adsRun;
    private Integer activePromotions;
    private Integer totalStories;
    private Integer totalFollows;
    private Integer totalPosts;
    private Integer totalSaves;
    private Integer totalComments;
    private Integer totalShares;
}
