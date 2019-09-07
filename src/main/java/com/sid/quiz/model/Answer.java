package com.sid.quiz.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSetter;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Answer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String content;
	private boolean correct;
	
	@ManyToOne
	@JoinColumn(name="question")
	private Question question;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public boolean isCorrect() {
		return correct;
	}

	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
    
	@JsonIgnore
	public Question getQuestion() {
		return question;
	}
    
	@JsonSetter
	public void setQuestion(Question question) {
		this.question = question;
	}

	public Answer(String content, boolean correct) {
		super();
		this.content = content;
		this.correct = correct;
	}

	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
