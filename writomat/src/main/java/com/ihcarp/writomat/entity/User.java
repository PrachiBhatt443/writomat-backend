//package com.ihcarp.writomat.entity;
//import jakarta.persistence.*;
//import lombok.Data;
//import java.util.List;
//@Data
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String name;
//    private String category;
//    private String bio;
//    private String contactOptions;
//    private String links;
//    private Integer followers;
//    private Integer following;
//    private Integer posts;
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Analytics> analytics;
//}
//package com.ihcarp.writomat.entity;
//
//        import jakarta.persistence.*;
//        import lombok.Data;
//        import com.fasterxml.jackson.annotation.JsonIgnore;
//        import java.util.List;
//
//@Data
//@Entity
//@Table(name = "users")
//public class User {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String category;
//    private String bio;
//    private String contactOptions;
//    private String links;
//
//    private Integer followers;
//    private Integer following;
//    private Integer posts;
//
//    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true)
//    @JsonIgnore
//    private List<Analytics> analytics;
//}
package com.ihcarp.writomat.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private List<Analytics> analytics;

    // Getters and setters
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
