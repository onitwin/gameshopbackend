package com.gameshop2.gamestore2.controllers;

import com.gameshop2.gamestore2.models.Format;
import com.gameshop2.gamestore2.models.Game;
import com.gameshop2.gamestore2.models.Publisher;
import com.gameshop2.gamestore2.repositories.GameRepository;
import com.gameshop2.gamestore2.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @GetMapping(value="/games")
    public ResponseEntity<List<Game>> getAllGames(){
        return new ResponseEntity<>(gameRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/games/{id}")
    public ResponseEntity getGame(@PathVariable Long id){
        return new ResponseEntity<>(gameRepository.findById(id),HttpStatus.OK);
    }

    @GetMapping(value="/games/age/{ageRating}")
    public ResponseEntity getGame(@PathVariable int ageRating){
        return new ResponseEntity<>(gameRepository.findAllByAgeRatingGreaterThanEqual(ageRating), HttpStatus.OK);
    }

    @GetMapping(value="/games/format/{format}")
    public ResponseEntity getGame(@PathVariable Format format){
        return new ResponseEntity<>(gameRepository.findGameByFormat(format), HttpStatus.OK);
    }

    @GetMapping(value="/games/title/{title}")
    public ResponseEntity getGame(@PathVariable String title){
        return new ResponseEntity<>(gameRepository.findByTitle(title),HttpStatus.OK);
    }

}
