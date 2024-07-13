package com.ihcarp.writomat.controller;

import com.ihcarp.writomat.entity.User;
import com.ihcarp.writomat.entity.Analytics;
import com.ihcarp.writomat.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@CrossOrigin(origins = "https://social-media-analytics-dashboard-self.vercel.app")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user);
        return new ResponseEntity<>(createdUser, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        if (user == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        boolean isDeleted = userService.deleteUser(id);
        if (isDeleted) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/{userId}/analytics")
    public ResponseEntity<List<Analytics>> getUserAnalytics(@PathVariable Long userId) {
        List<Analytics> analytics = userService.getUserAnalytics(userId);
        if (analytics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(analytics, HttpStatus.OK);
    }

    @PostMapping("/{userId}/analytics")
    public ResponseEntity<Analytics> createAnalytics(@PathVariable Long userId, @RequestBody Analytics analytics) {
        Analytics createdAnalytics = userService.createAnalytics(userId, analytics);
        if (createdAnalytics == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(createdAnalytics, HttpStatus.CREATED);
    }
}
