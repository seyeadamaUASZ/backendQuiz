package com.sid.quiz.model;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Quiz {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nameQuiz;
	
	@OneToMany(mappedBy = "quiz")
	private Collection<Question> questions= new ArrayList<Question>();
	
	@JsonIgnore 
	public Collection<Question> getQuestions() {
		return questions;
	}
	public void setQuestions(Collection<Question> questions) {
		this.questions = questions;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNameQuiz() {
		return nameQuiz;
	}
	public void setNameQuiz(String nameQuiz) {
		this.nameQuiz = nameQuiz;
	}
	
	public Quiz(String nameQuiz) {
		super();
		this.nameQuiz = nameQuiz;
	}
	
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
