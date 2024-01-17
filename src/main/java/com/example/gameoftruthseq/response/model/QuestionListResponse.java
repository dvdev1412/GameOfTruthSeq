package com.example.gameoftruthseq.response.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class QuestionListResponse {

    private List<QuestionResponse> questions = new ArrayList<>();
}
