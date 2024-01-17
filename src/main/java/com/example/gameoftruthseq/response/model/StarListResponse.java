package com.example.gameoftruthseq.response.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class StarListResponse {

    private List<StarResponse> stars = new ArrayList<>();
}
