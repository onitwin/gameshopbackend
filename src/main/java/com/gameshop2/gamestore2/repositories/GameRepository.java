package com.gameshop2.gamestore2.repositories;

import com.gameshop2.gamestore2.models.Format;
import com.gameshop2.gamestore2.models.Game;
import com.gameshop2.gamestore2.models.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends JpaRepository<Game,Long> {
    List<Game> findAllByAgeRatingGreaterThanEqual(int ageRating);

    List<Game> findGameByFormat(Format format);

    List<Game>findByTitle(String title);


}
