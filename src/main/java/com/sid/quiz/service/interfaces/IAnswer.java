package com.sid.quiz.service.interfaces;

import java.util.List;

import com.sid.quiz.model.Answer;

public interface IAnswer {
	public Answer addAnswer(Answer answer);
	public List<Answer> listAnswer();
	public Answer getAnswer(Long id);

}
