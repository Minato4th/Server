package com.example.server.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class Controller {

    @GetMapping
    public List<String> getValues(){
        return List.of("Hello", "Spring");
    }
}
