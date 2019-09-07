package com.sid.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.quiz.model.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{

}
