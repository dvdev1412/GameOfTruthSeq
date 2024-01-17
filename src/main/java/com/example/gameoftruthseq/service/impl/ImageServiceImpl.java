package com.example.gameoftruthseq.service.impl;

import com.example.gameoftruthseq.dao.ImageRepository;
import com.example.gameoftruthseq.entity.Image;
import com.example.gameoftruthseq.service.ImageService;
import com.example.gameoftruthseq.utils.BeanUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ImageServiceImpl implements ImageService {

    private ImageRepository imageRepository;

    @Override
    public List<Image> findAll() {
        return imageRepository.findAll();
    }

    @Override
    public Image findById(Long id) {
        return imageRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat
                        .format("Изображение с ID: {0} не найдено", id)));
    }

    @Override
    public Image save(Image image) {
        return imageRepository.save(image);
    }

    @Override
    public Image update(Image image) {
        Image existedImage = findById(image.getId());

        BeanUtils.CopyNoNullProperties(image, existedImage);

        return imageRepository.save(image);
    }

    @Override
    public void delete(Long id) {
        imageRepository.deleteById(id);
    }
}
