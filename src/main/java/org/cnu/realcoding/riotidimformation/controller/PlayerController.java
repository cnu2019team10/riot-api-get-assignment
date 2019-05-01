package org.cnu.realcoding.riotidimformation.controller;

import org.cnu.realcoding.riotidimformation.domain.Player;
import org.cnu.realcoding.riotidimformation.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/player-id")
    public List<String> getAvailablePlayers() {
        return playerService.getAvailablePlayerNames();
    }
    @GetMapping("/players/{name}")
    public Player getPlayerByName(@PathVariable String name) {
        return playerService.getPlayersByName(name);
    }

}
