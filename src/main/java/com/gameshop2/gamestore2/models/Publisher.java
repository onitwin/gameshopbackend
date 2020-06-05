package com.gameshop2.gamestore2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="Publishers")
public class Publisher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;


    @JsonIgnoreProperties(value="publisher")
    @OneToMany(mappedBy="publisher",fetch=FetchType.LAZY)
    private List<Game> games;

    public Publisher(String name){
        this.name=name;
        this.games=new ArrayList<Game>();
    }

    public Publisher(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }
}
