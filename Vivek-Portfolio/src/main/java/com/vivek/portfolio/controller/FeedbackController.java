package com.vivek.portfolio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.vivek.portfolio.entity.Feedback;
import com.vivek.portfolio.repository.*;
import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class FeedbackController {

    @Autowired
    private FeedbackRepository feedbackRepository;
    
 

    @GetMapping("/feedback")
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }

    @PostMapping("/feedback")
    public Feedback saveFeedback(@RequestBody Feedback feedback) {
        return feedbackRepository.save(feedback);
    }
}

