package com.example.chjava2023springbootrickandmortyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class RickAndMortyApi {

    public static void main(String[] args) {
        SpringApplication.run(RickAndMortyApi.class, args);
    }

    @Bean
    WebClient defineWebClient() {
        return WebClient.builder().baseUrl("https://rickandmortyapi.com/").build();
    }
}
