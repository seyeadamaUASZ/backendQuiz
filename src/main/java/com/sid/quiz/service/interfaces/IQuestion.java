package com.sid.quiz.service.interfaces;

import java.util.List;

import com.sid.quiz.model.Answer;
import com.sid.quiz.model.Question;

public interface IQuestion {
	public Question addQuestion(Question question);
	public List<Question> listQuestions();
	public Question getQuestion(Long id);
	public Long findIdAnswerCorrect(Long id);
	public Answer findAnwserCorrect(Long id);

}
