package com.example.gameoftruthseq.service;

import com.example.gameoftruthseq.entity.Room;

import java.util.List;

public interface RoomService {

    List<Room> findAll();

    Room findById(Long id);

    Room save(Room room);

    Room update(Room room);

    void delete(Long id);
}
