package com.sid.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.quiz.model.Answer;

public interface AnswerRepository extends JpaRepository<Answer, Long>{

}
