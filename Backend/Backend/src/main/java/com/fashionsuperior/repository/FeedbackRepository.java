package com.fashionsuperior.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fashionsuperior.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Integer>{

}
