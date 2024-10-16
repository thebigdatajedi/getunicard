package com.example.featuremanagementapp.repository;

import com.example.featuremanagementapp.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
