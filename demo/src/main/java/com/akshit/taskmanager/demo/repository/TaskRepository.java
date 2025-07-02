package com.akshit.taskmanager.demo.repository;

import com.akshit.taskmanager.demo.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {}
