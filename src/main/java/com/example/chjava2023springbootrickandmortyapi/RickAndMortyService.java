package com.example.chjava2023springbootrickandmortyapi;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@Service
@RequiredArgsConstructor
public class RickAndMortyService {

    private final WebClient webClient;
    public List<Character> findCharacter() {
    RickAndMortyResponse response =  Objects.requireNonNull(
            webClient
                    .get()
                    .uri("/rickandmorty/characters")
                    .retrieve()
                    .toEntity(RickAndMortyResponse.class)
                    .block()
    )
            .getBody();
        List<Character> character = new ArrayList<>();
        for (RickAndMortyResult result : Objects.requireNonNull(response).result()) {
            character.add(
                    new Character(result.id(), result.name(),result.species())
            );
        }
        return character;
    }

}
