package com.sid.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.quiz.model.Quiz;
import com.sid.quiz.repositories.QuizRepository;
import com.sid.quiz.service.interfaces.IQuiz;

@Service
public class QuizImpl implements IQuiz{
    private final QuizRepository repos;
    
    @Autowired
	public QuizImpl(QuizRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public Quiz addQuiz(Quiz quiz) {
		// TODO Auto-generated method stub
		return this.repos.save(quiz);
	}

	@Override
	public List<Quiz> listQuiz() {
		// TODO Auto-generated method stub
		return this.repos.findAll();
	}

	@Override
	public Quiz getQuiz(Long id) {
		// TODO Auto-generated method stub
		return this.repos.getOne(id);
	}

}
