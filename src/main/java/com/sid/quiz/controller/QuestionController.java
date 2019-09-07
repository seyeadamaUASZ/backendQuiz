package com.sid.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.quiz.model.Question;
import com.sid.quiz.service.interfaces.IQuestion;

@RestController
@CrossOrigin("*")
public class QuestionController {
	private final IQuestion iquestion;
    
	@Autowired
	public QuestionController(IQuestion iquestion) {
		super();
		this.iquestion = iquestion;
	}
	
	@GetMapping("/questions")
	public List<Question> listQuestions(){
		return this.iquestion.listQuestions();
	}
	
	@PostMapping("/questions")
	public Question addQuestion(@RequestBody Question question) {
		return this.iquestion.addQuestion(question);
	}
	
	@GetMapping("/questions/{id}")
	public Question getQuestion(@PathVariable("id")Long id) {
		return this.iquestion.getQuestion(id);
	}
	//answer correct
	
	@GetMapping("/findcorrect/{id}")
	public Long findIdAnswerCorrect(@PathVariable("id")Long id) {
		 return this.iquestion.findIdAnswerCorrect(id);
	}

}
