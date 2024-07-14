package com.ihcarp.writomat.repository;

import com.ihcarp.writomat.entity.Analytics;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnalyticsRepository extends JpaRepository<Analytics, Long> {
    List<Analytics> findAllByUserId(Long userId);
}
