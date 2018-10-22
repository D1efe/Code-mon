package com.qa.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.qa.persistence.domain.Question;

public interface QuestionRepository extends JpaRepository<Question,Integer>{

}
