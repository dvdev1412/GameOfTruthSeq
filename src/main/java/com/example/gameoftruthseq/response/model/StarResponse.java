package com.example.gameoftruthseq.response.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StarResponse {

    private Long id;

    private String starName;

    private List<QuestionResponse> questions = new ArrayList<>();
}
