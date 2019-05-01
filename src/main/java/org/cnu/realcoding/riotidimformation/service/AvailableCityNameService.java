package org.cnu.realcoding.riotidimformation.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AvailableCityNameService {
    private String[] cityNames = {
            "Anbaeteo",
            "Andong",
            "Haejeong",
            "Haenam",
            "Sunch’ang",
            "Sup’yŏng-dong",
            "Sŏlman",
            "Sŏnb"
    };
    public List<String> getAvailableCityNames() {
        List<String> collect = Arrays.stream(cityNames).collect(Collectors.toList());
        return collect;
    }
}
