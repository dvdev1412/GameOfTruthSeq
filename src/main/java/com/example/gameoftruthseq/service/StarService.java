package com.example.gameoftruthseq.service;

import com.example.gameoftruthseq.entity.Star;

import java.util.List;

public interface StarService {

    List<Star> findAll();

    Star findById(Long id);

    Star save(Star star);

    Star update(Star star);

    void delete(Long id);
}
