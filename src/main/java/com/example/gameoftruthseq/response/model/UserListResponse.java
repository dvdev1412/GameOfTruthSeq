package com.example.gameoftruthseq.response.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserListResponse {

    private List<UserResponse> users = new ArrayList<>();

}
