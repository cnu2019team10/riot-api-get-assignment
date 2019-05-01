package org.cnu.realcoding.riotidimformation.repository;

import org.cnu.realcoding.riotidimformation.domain.CurrentPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CurrentPlayerRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertPlayer(CurrentPlayer currentPlayer) {
        mongoTemplate.insert(currentPlayer);
    }
}

/*
@Repository
public class CurrentWeatherRepository {
    @Autowired
    private MongoTemplate mongoTemplate;

    public void insertCurrentWeather(CurrentWeather currentWeather) {
        mongoTemplate.insert(currentWeather);
    }
}

 */