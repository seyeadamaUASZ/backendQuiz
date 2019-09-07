package com.sid.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.quiz.model.Quiz;
import com.sid.quiz.service.interfaces.IQuiz;

@RestController
@CrossOrigin("*")
public class QuizController {
	private final IQuiz iquiz;
    
	@Autowired
	public QuizController(IQuiz iquiz) {
		super();
		this.iquiz = iquiz;
	}
	
	@PostMapping("/quiz")
	public Quiz addQuiz(@RequestBody Quiz quiz) {
		return this.iquiz.addQuiz(quiz);
	}
	
	@GetMapping("/quiz")
	public List<Quiz> listQuiz(){
		return this.iquiz.listQuiz();
	}
	
	@GetMapping("/quiz/{id}")
	public Quiz getquiz(@PathVariable("id")Long id) {
		return this.iquiz.getQuiz(id);
	}
	

}
