package com.sid.quiz.service.interfaces;

import java.util.List;

import com.sid.quiz.model.Quiz;

public interface IQuiz {
	public Quiz addQuiz(Quiz quiz);
	public List<Quiz> listQuiz();
	public Quiz getQuiz(Long id);

}
