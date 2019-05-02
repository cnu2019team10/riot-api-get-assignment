package org.cnu.realcoding.riotidimformation.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailablePlayerNameService {
    private String[] playerNames = {

            "KooZen2"

    };
    public List<String> getAvailablePlayerNames() {
        List<String> collect = Arrays.stream(playerNames).collect(Collectors.toList());
        return collect;
    }
}
