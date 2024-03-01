package com.fashionsuperior.service;

import java.util.List;

import com.fashionsuperior.entities.Feedback;

public interface FeedbackService {

	void saveFeedback(Feedback feedback);

	List<Feedback> findAllFeedbacks();

}
