package com.example.gameoftruthseq.controllers;

import com.example.gameoftruthseq.dao.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@AllArgsConstructor
public class PublicController {

     private UserRepository userRepository;

     @GetMapping("/")
     public String index(Model model) {

         return "index";
     }
}
