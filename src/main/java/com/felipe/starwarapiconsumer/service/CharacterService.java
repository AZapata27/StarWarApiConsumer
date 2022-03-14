package com.felipe.starwarapiconsumer.service;

import com.felipe.starwarapiconsumer.dto.Character;
import org.springframework.boot.web.client.RootUriTemplateHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Service
public class CharacterService {

    private final RestTemplate restTemplate;

    public CharacterService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
        URI urlPeople = this.restTemplate.getUriTemplateHandler().expand("/people");
        this.restTemplate.setUriTemplateHandler(new RootUriTemplateHandler(urlPeople.toString()));
    }



    public Character findCharacterById(Integer id){

        ResponseEntity<Character> responseEntity = restTemplate.getForEntity("/"+id,Character.class);

        return responseEntity.getBody();

    }

    public Character[] findAllCharacters(){

        ResponseEntity<Character[]> responseEntity = restTemplate.getForEntity("/",Character[].class);

        return responseEntity.getBody();

    }




}
