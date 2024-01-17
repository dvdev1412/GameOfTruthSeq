package com.example.gameoftruthseq.service.impl;
import com.example.gameoftruthseq.dao.QuestionRepository;
import com.example.gameoftruthseq.entity.Question;
import com.example.gameoftruthseq.entity.Star;
import com.example.gameoftruthseq.service.QuestionService;
import com.example.gameoftruthseq.utils.BeanUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;

    private StarServiceImpl starServiceImpl;
    @Override
    public List<Question> findAll() {
        return questionRepository.findAll();
    }

    @Override
    public Question findById(Long id) {
        return questionRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat
                        .format("Вопрос с ID: {0} не найден", id)));
    }

    @Override
    public Question save(Question question) {
        Star star = starServiceImpl.findById(question.getStar().getId());
        question.setStar(star);
        return questionRepository.save(question);
    }

    @Override
    public Question update(Question question) {
        Star star = starServiceImpl.findById(question.getStar().getId());
        Question existedQuestion = findById(question.getId());
        BeanUtils.CopyNoNullProperties(question, existedQuestion);
        return questionRepository.save(question);
    }

    @Override
    public void delete(Long id) {
           questionRepository.deleteById(id);
    }
}
