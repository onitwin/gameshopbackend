package com.gameshop2.gamestore2.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="games")
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private double cost;

    @Column
    private int ageRating;

    @JsonIgnoreProperties(value="games")
    @ManyToOne
    @JoinColumn(name="publisher_id",nullable=false)
    private Publisher publisher;

    @Column
    private Format format;

    @Column
    private String gameCoverUrl;

    @Column
    private int stockLevel;

    public Game (String title, double cost, int ageRating,Publisher publisher ,Format format, String gameCoverUrl, int stockLevel){
        this.title=title;
        this.cost=cost;
        this.ageRating=ageRating;
        this.publisher=publisher;
        this.format=format;
        this.gameCoverUrl=gameCoverUrl;
        this.stockLevel=stockLevel;
    }

    public Game(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public String getGameCoverUrl() {
        return gameCoverUrl;
    }

    public void setGameCoverUrl(String gameCoverUrl) {
        this.gameCoverUrl = gameCoverUrl;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }
}
