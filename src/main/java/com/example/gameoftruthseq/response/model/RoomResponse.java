package com.example.gameoftruthseq.response.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class RoomResponse {

    private Long id;

    private String roomName;

    private String passwordForRoom;

    private List<UserResponse> users = new ArrayList<>();

}
