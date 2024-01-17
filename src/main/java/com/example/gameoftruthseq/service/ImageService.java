package com.example.gameoftruthseq.service;

import com.example.gameoftruthseq.entity.Image;

import java.util.List;

public interface ImageService {

    List<Image> findAll();

    Image findById(Long id);

    Image save(Image image);

    Image update(Image image);

    void delete(Long id);
}
