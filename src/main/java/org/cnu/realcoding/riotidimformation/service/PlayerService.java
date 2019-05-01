package org.cnu.realcoding.riotidimformation.service;

import org.cnu.realcoding.riotidimformation.api.OpenRiotApiClient;
import org.cnu.realcoding.riotidimformation.domain.CurrentPlayer;
import org.cnu.realcoding.riotidimformation.domain.Player;
import org.cnu.realcoding.riotidimformation.repository.CurrentPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class PlayerService {

    private List<Player> playerList = new ArrayList<>();

    @Autowired
    private org.cnu.realcoding.riotidimformation.service.AvailablePlayerNameService availablePlayerNameService;
    @Autowired
    private OpenRiotApiClient openRiotApiClient;

    @Autowired
    private CurrentPlayerRepository currentPlayerRepository;

    private LinkedList<String> queue = new LinkedList<>();


    public List<String> getAvailablePlayerNames() {
        return availablePlayerNameService.getAvailablePlayerNames();
    }


    @Scheduled(initialDelay = 5000L, fixedDelay = 2000L)
    public void getCurrentPlayerPeriodically() {
        if (queue.isEmpty()) {
            queue.addAll(this.getAvailablePlayerNames());

        }
        String target = queue.pop();
        queue.add(target);

        CurrentPlayer currentPlayer = openRiotApiClient.getCurrentPlayer();
        currentPlayerRepository.insertPlayer(currentPlayer);
    }

    public Player getPlayersByName(String name) {
        for (int i = 0; i < playerList.size(); i++) {
            Player target = playerList.get(i);
            if (target.getName().equals(name)) {
                return target;
            }
        }
        return null;
    }
}

/*

public class DogService {
    private List<Dog> dogList = new ArrayList<>();

    public void insertDog(Dog dog) {
        dogList.add(dog);
    }

    public List<Dog> getAllDogs() {
        return dogList;
    }

    public Dog getDogsByName(String name) {
        for (int i = 0; i < dogList.size(); i++) {
            Dog target = dogList.get(i);
            if (target.getName().equals(name)) {
                return target;
            }
        }
        return null;
    }

    public void updateDog(Dog dog) {
        for (int i = 0; i < dogList.size(); i++) {
            Dog target = dogList.get(i);
            if (target.getName().equals(dog.getName())) {
                target.setKind(dog.getKind());
                break;
            }
        }
    }

    public void removeDog(String name) {
        for (int i = 0; i < dogList.size(); i++) {
            Dog target = dogList.get(i);
            if (target.getName().equals(name)) {
                dogList.remove(target);
                break;
            }
        }
    }
}

 */