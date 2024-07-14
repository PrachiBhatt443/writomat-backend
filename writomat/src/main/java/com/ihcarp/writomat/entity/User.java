package com.ihcarp.writomat.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "app_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Analytics> analytics;

    // Default constructor
    public User() {}

    // Parameterized constructor
    public User(String name) {
        this.name = name;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Analytics> getAnalytics() {
        return analytics;
    }

    public void setAnalytics(List<Analytics> analytics) {
        this.analytics = analytics;
    }
}
