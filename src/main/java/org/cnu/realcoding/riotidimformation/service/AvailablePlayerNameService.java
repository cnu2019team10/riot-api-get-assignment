package org.cnu.realcoding.riotidimformation.service;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailablePlayerNameService {
    private String[] cityNames = {

            "KooZen2",
            "hide on bush",
            "인생은시궁창"

    };
    public List<String> getAvailablePlayerNames() {
        List<String> collect = Arrays.stream(cityNames).collect(Collectors.toList());
        return collect;
    }
}
