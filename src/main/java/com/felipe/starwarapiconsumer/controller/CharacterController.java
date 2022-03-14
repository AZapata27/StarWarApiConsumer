package com.felipe.starwarapiconsumer.controller;

import com.felipe.starwarapiconsumer.dto.Character;
import com.felipe.starwarapiconsumer.service.CharacterService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${v1API}/character")
public class CharacterController {

    private static final Logger LOGGER = LogManager.getLogger(CharacterController.class);

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/{id}")
    public Character findCharacterById(@PathVariable Integer id){

        return characterService.findCharacterById(id);
    }

    @GetMapping("/")
    public Character[] findAllCharacters(){

        return characterService.findAllCharacters();
    }




}

