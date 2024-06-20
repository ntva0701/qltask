package com.example.qltask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.qltask.model.Task;


public interface Repository extends JpaRepository<Task, Long> {
    List<Task> findByTitleContaining(String title);
    List<Task> findByStatus(String status );
}

