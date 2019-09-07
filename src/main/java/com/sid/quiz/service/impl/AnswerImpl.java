package com.sid.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.quiz.model.Answer;
import com.sid.quiz.repositories.AnswerRepository;
import com.sid.quiz.service.interfaces.IAnswer;

@Service
public class AnswerImpl implements IAnswer{
    private final AnswerRepository repos;
    
    @Autowired
	public AnswerImpl(AnswerRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public Answer addAnswer(Answer answer) {
		// TODO Auto-generated method stub
		return this.repos.save(answer);
	}

	@Override
	public List<Answer> listAnswer() {
		// TODO Auto-generated method stub
		return this.repos.findAll();
	}

	@Override
	public Answer getAnswer(Long id) {
		// TODO Auto-generated method stub
		return this.repos.getOne(id);
	}

}
