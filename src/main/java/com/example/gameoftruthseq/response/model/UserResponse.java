package com.example.gameoftruthseq.response.model;

import com.example.gameoftruthseq.entity.Image;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserResponse {

    private String username;

    private String password;

    private String email;

    private Image avatar;

    private List<StarResponse> stars = new ArrayList<>();

    private List<RoomResponse> rooms = new ArrayList<>();
}
