package com.gameshop2.gamestore2.repositories;

import com.gameshop2.gamestore2.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PublisherRepository extends JpaRepository <Publisher,Long>{
    List<Publisher> findByName(String name);

}
