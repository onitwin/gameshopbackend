package com.gameshop2.gamestore2;

import com.gameshop2.gamestore2.models.Format;
import com.gameshop2.gamestore2.models.Game;
import com.gameshop2.gamestore2.models.Publisher;
import com.gameshop2.gamestore2.repositories.GameRepository;
import com.gameshop2.gamestore2.repositories.PublisherRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Gamestore2ApplicationTests {

	@Autowired
	PublisherRepository publisherRepository;

	@Autowired
	GameRepository gameRepository;

	@Test
	void contextLoads() {
	}

	@Test public void createPublisherAndSave(){
		Publisher nintendo=new Publisher("Nintendo");
		publisherRepository.save(nintendo);

	}

	@Test public void createPublisherAndGameThenSave(){
		Publisher xbox=new Publisher("Xbox");
		publisherRepository.save(xbox);
		Game halo4=new Game("Halo 4",39.99,15,xbox,Format.XBOXONE,"https://imgur.com/3Y6byZK",5);
		gameRepository.save(halo4);

	}
}
