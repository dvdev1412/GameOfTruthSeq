package com.example.gameoftruthseq.service;

import com.example.gameoftruthseq.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {

   List<User> findAll();

   User findById(Long id);

   User save(User user);

   User update(User user);

   void delete(Long id);


}
