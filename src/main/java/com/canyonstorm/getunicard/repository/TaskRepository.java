package com.canyonstorm.getunicard.repository;

import com.canyonstorm.getunicard.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}