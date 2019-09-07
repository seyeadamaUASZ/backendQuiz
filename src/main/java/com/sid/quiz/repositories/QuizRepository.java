package com.sid.quiz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.quiz.model.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{

}
