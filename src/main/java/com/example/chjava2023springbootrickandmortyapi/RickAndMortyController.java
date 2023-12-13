package com.example.chjava2023springbootrickandmortyapi;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
@RequestMapping("/characters")
@RequiredArgsConstructor
public class RickAndMortyController {

private final RickAndMortyService service;

    @GetMapping
    List<Character> findCharacter(){
    return service.findCharacter();
    }


}
