package com.gameshop2.gamestore2.components;


import com.gameshop2.gamestore2.models.Format;
import com.gameshop2.gamestore2.models.Game;
import com.gameshop2.gamestore2.models.Publisher;
import com.gameshop2.gamestore2.repositories.GameRepository;
import com.gameshop2.gamestore2.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    GameRepository gameRepository;

    @Autowired
    PublisherRepository publisherRepository;

    public DataLoader(){

    }

    public void run (ApplicationArguments args){

        Publisher xbox=new Publisher("Xbox");
        publisherRepository.save(xbox);

        Publisher sony=new Publisher("Sony");
        publisherRepository.save(sony);

        Publisher activision=new Publisher("Activision");
        publisherRepository.save(activision);

        Publisher capcom=new Publisher("Capcom");
        publisherRepository.save(capcom);

        Publisher bungie=new Publisher("Bungie");
        publisherRepository.save(bungie);

        Publisher rockstar=new Publisher("Rockstar");
        publisherRepository.save(rockstar);

        Publisher nintendo=new Publisher("Nintendo");
        publisherRepository.save(nintendo);

        Game halo4=new Game("Halo 4",20.99, 15, bungie, Format.XBOXONE,"https://i.imgur.com/3Y6byZK.jpg",5);
        gameRepository.save(halo4);


        Game mariosunshine=new Game("Super Mario Sunshine",30.67, 3, nintendo, Format.GAMECUBE,"https://i.imgur.com/29fYfhP.jpg",7);
        gameRepository.save(mariosunshine);

        Game mariokart8=new Game("MarioKart 8",49.99, 3, nintendo, Format.SWITCH,"https://i.imgur.com/KdrsrbZ.jpg", 9);
        gameRepository.save(mariokart8);

        Game lastOfUs=new Game("Last of Us",49.99, 15, sony, Format.PS4,"https://i.imgur.com/KdrsrbZ.jpg",4);
        gameRepository.save(lastOfUs);

        Game marioodyssey=new Game("Mario Odyssey",30.67, 3, nintendo, Format.SWITCH,"https://i.imgur.com/1Yse61k.jpg",7);
        gameRepository.save(marioodyssey);

        Game mariobros=new Game("Super Mario Bros",10, 3,nintendo, Format.NES,"https://i.imgur.com/5ZkbKEl.jpg",7);
        gameRepository.save(mariobros);

        Game destiny2Xbox=new Game("Destiny 2",30.99, 15, bungie, Format.XBOXONE,"https://i.imgur.com/emC3uqD.jpg",5);
        gameRepository.save(destiny2Xbox);

        Game destiny2Playstation=new Game("Destiny 2",30.99, 15, bungie, Format.PS4,"https://i.imgur.com/emC3uqD.jpg",5);
        gameRepository.save(destiny2Playstation);

        Game halo=new Game("Halo",10.99, 15, bungie, Format.XBOX,"https://i.imgur.com/WU15Kc4.jpg",5);
        gameRepository.save(halo);

        Game spiderman=new Game("Spider-Man",49.99, 12, activision, Format.PS4,"https://i.imgur.com/hZ8zj3x.jpg",5);
        gameRepository.save(spiderman);

        Game gtavPS4=new Game("Grand Theft Auto 5",49.99, 18, rockstar, Format.PS4,"https://i.imgur.com/1lXaU6f.jpg",8);
        gameRepository.save(gtavPS4);

        Game gtavXbox=new Game("Grand Theft Auto 5",49.99, 18, rockstar, Format.XBOXONE,"https://i.imgur.com/1lXaU6f.jpg",9);
        gameRepository.save(gtavXbox);

        Game rdr2ps4=new Game("Red Dead Redemption 2",49.99, 18, rockstar, Format.PS4,"https://i.imgur.com/FAyekbD.jpg",8);
        gameRepository.save(rdr2ps4);

        Game rdr2xbox=new Game("Red Dead Redemption 2",49.99, 18, rockstar, Format.XBOXONE,"https://i.imgur.com/FAyekbD.jpg",8);
        gameRepository.save(rdr2xbox);

        Game halo3=new Game("Halo 3",10.99, 15,bungie, Format.XBOX360,"https://i.imgur.com/NSCqQfA.jpg",2);
        gameRepository.save(halo3);

        Game streetfighter5=new Game("StreetFighter V",29.99, 12, capcom, Format.PS4,"https://i.imgur.com/vZZS0Zb.jpg",8);
        gameRepository.save(streetfighter5);

        Game streetfighter2=new Game("StreetFighter 2",29.99, 12,capcom, Format.SNES,"https://i.imgur.com/PSMJeVS.jpg",8);
        gameRepository.save(streetfighter2);
    }
}
