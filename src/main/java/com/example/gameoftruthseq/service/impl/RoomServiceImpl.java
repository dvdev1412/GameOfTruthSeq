package com.example.gameoftruthseq.service.impl;

import com.example.gameoftruthseq.dao.RoomRepository;
import com.example.gameoftruthseq.entity.Room;
import com.example.gameoftruthseq.service.RoomService;
import com.example.gameoftruthseq.utils.BeanUtils;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {

    private RoomRepository roomRepository;

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(MessageFormat
                        .format("Комната с ID: {0} не найден", id)));
    }

    @Override
    public Room save(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Room update(Room room) {
        Room existedRoom = findById(room.getId());

        BeanUtils.CopyNoNullProperties(room, existedRoom);

        return roomRepository.save(room);
    }

    @Override
    public void delete(Long id) {
                roomRepository.deleteById(id);
    }
}
