package com.example.gameoftruthseq.response.model;
import lombok.Data;

@Data
public class QuestionResponse {

    private Long questionId;

    private Boolean trueOrFalse;

    private String text;
}
