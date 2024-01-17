package com.example.gameoftruthseq.service.impl;
import com.example.gameoftruthseq.dao.StarRepository;
import com.example.gameoftruthseq.entity.Star;
import com.example.gameoftruthseq.service.StarService;
import com.example.gameoftruthseq.utils.BeanUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StarServiceImpl implements StarService {

    private StarRepository starRepository;

    @Override
    public List<Star> findAll() {
        return starRepository.findAll();
    }

    @Override
    public Star findById(Long id) {
        return starRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat
                        .format("Вопрос с ID: {0} не найден", id)));
    }

    @Override
    public Star save(Star star) {
        return starRepository.save(star);
    }

    @Override
    public Star update(Star star) {
        Star existedStar = findById(star.getId());

        BeanUtils.CopyNoNullProperties(star, existedStar);

        return starRepository.save(star);
    }

    @Override
    public void delete(Long id) {

    }
}
