package com.felipe.starwarapiconsumer.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Character {

    @JsonAlias(value = "birth_year")
    String birthYear;
    @JsonAlias(value = "eye_color")
    String eyeColor;
    List<String> films;
    String gender;
    @JsonAlias(value = "hair_color")
    String hairColor;
    Integer height;
    String homeworld;
    Integer mass;
    String name;
    @JsonAlias(value = "skin_color")
    String skinColor;
    LocalDateTime created;
    LocalDateTime edited;
    List<String> species;
    List<String> starships;
    String url;
    List<String> vehicles;


}
