package com.ihcarp.writomat.entity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;

@Entity
@Getter
@Setter
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String platform;
    private String userName;
    private String category;
    private String bio;
    private String contact;
    private String link;
    private Integer followers;
    private Integer posts;
    private Integer accountReach;
    private Integer engagement;
    private Integer contentShared;
    private Integer adsRun;
    private Integer activePromotions;
    private Integer totalStories;
    private Integer totalFollows;
    private Integer totalPosts;
    private Integer totalSaves;
    private Integer totalComments;
    private Integer totalShares;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}
