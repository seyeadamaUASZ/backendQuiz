package com.sid.quiz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sid.quiz.model.Answer;
import com.sid.quiz.model.Question;
import com.sid.quiz.repositories.QuestionRepository;
import com.sid.quiz.service.interfaces.IQuestion;

@Service
public class QuestionImpl implements IQuestion{
    private final QuestionRepository repos;
    
    @Autowired
	public QuestionImpl(QuestionRepository repos) {
		super();
		this.repos = repos;
	}

	@Override
	public Question addQuestion(Question question) {
		// TODO Auto-generated method stub
		return this.repos.save(question);
	}

	@Override
	public List<Question> listQuestions() {
		// TODO Auto-generated method stub
		return this.repos.findAll();
	}

	@Override
	public Question getQuestion(Long id) {
		// TODO Auto-generated method stub
		return this.repos.getOne(id);
	}

	@Override
	public Long findIdAnswerCorrect(Long id) {
		//recuperer la question
		Question question = this.repos.getOne(id);
		for(Answer answer:question.getAnswers()) {
			if(answer.isCorrect()) {
				return answer.getId();
			}
		}
		return -1L;
		
	}

	@Override
	public Answer findAnwserCorrect(Long id) {
		Question question = this.repos.getOne(id);
		for(Answer answer:question.getAnswers()) {
			if(answer.isCorrect()) {
				return answer;
			}
		}
		return null;
	}

}
