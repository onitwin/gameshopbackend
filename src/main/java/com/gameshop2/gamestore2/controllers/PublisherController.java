package com.gameshop2.gamestore2.controllers;


import com.gameshop2.gamestore2.models.Publisher;
import com.gameshop2.gamestore2.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PublisherController {

    @Autowired
    PublisherRepository publisherRepository;

    @GetMapping(value="/publishers")
    public ResponseEntity<List<Publisher>> getAllPublishers(){
        return new ResponseEntity<>(publisherRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value="/publishers/{id}")
    public ResponseEntity getPublisher(@PathVariable Long id){
        return new ResponseEntity<>(publisherRepository.findById(id),HttpStatus.OK);
    }

    @GetMapping(value="/publishers/name/{name}")
    public ResponseEntity getPublisher(@PathVariable String name){
        return new ResponseEntity<>(publisherRepository.findByName(name),HttpStatus.OK);
    }
}
