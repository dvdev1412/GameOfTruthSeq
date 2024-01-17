package com.example.gameoftruthseq.mapper;
import com.example.gameoftruthseq.entity.Question;
import com.example.gameoftruthseq.response.model.QuestionListResponse;
import com.example.gameoftruthseq.response.model.QuestionResponse;
import com.example.gameoftruthseq.response.model.UpsertQuestionRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;


@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface QuestionMapper {

    Question requestToQuestion(UpsertQuestionRequest request);

    @Mapping(source = "questionId", target = "id")
    Question requestToQuestion(Long questionId, UpsertQuestionRequest request);


    QuestionResponse questionToResponse(Question question);

    List<QuestionResponse> questionListToResponseList(List<Question> questions);
    }

