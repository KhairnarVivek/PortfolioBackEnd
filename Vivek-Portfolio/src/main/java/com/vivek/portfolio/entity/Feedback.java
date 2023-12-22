package com.vivek.portfolio.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "feedback")
public class Feedback {
	@Id
    private String id;
    private String feedback_name;
    private String feedback_email;
    private String feedback_rating;
    private String feedback_message;
}