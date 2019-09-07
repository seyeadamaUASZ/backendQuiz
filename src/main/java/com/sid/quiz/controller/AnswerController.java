package com.sid.quiz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sid.quiz.model.Answer;
import com.sid.quiz.service.interfaces.IAnswer;

@RestController
@CrossOrigin("*")
public class AnswerController {
	private final IAnswer ianswer;
    
	@Autowired
	public AnswerController(IAnswer ianswer) {
		super();
		this.ianswer = ianswer;
	}
	
	
	@PostMapping("/answer")
	public Answer addAnswer(@RequestBody Answer answer) {
		return this.ianswer.addAnswer(answer);
	}
	
	@GetMapping("/answer")
	public List<Answer> listAnswer(){
		return this.listAnswer();
	}
	
	@GetMapping("/answer/{id}")
	public Answer getAnswer(@PathVariable("id") Long id) {
		return this.ianswer.getAnswer(id);
	}
	
	

}
