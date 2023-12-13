package com.example.chjava2023springbootrickandmortyapi;

import java.util.List;

public record RickAndMortyResponse (

    List< RickAndMortyResult > result

)
{ }
