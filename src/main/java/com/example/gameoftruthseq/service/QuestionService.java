package com.example.gameoftruthseq.service;

import com.example.gameoftruthseq.entity.Question;

import java.util.List;

public interface QuestionService {
    List<Question> findAll();

    Question findById(Long id);

    Question save(Question question);

    Question update(Question question);

    void delete(Long id);
}
