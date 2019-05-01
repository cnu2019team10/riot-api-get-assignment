package org.cnu.realcoding.riotidimformation.api;

import org.cnu.realcoding.riotidimformation.domain.CurrentPlayer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
/*
@Service
public class OpenRiotApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://api.openweathermap.org/data/2.5/weather?q={cityName}&appid={appKey}";

    public CurrentWeather getCurrentWeather(String cityName) {
        return restTemplate.exchange(requestUrl, HttpMethod.GET, null, CurrentWeather.class, cityName, "a789575e81f66349a07f3543910deb93")
                .getBody();
    }

}
*/
@Service
public class OpenRiotApiClient {
    @Autowired
    private RestTemplate restTemplate;

    private String requestUrl = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/KooZen2?api_key=RGAPI-7934ba8a-44a3-42c8-aa1c-9fd0ab16c270";

    public CurrentPlayer getCurrentPlayer() {

        return restTemplate.exchange(requestUrl, HttpMethod.GET,null, CurrentPlayer.class,null,null).getBody();
    }

}

/*
{"coord":{"lon":-0.13,"lat":51.51},
"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],
"base":"stations",
"main":{"temp":288.69,"pressure":1019,"humidity":62,"temp_min":286.15,"temp_max":290.93},
"visibility":10000,
"wind":{"speed":1.5},
"clouds":{"all":44},
"dt":1556709378,
"sys":{"type":1,"id":1414,"message":0.0085,"country":"GB","sunrise":1556685176,"sunset":1556738531},
"id":2643743,
"name":"London",
"cod":200}
 */

/*
{"id":"7l9qv7ea3SbF7VdDLjPvrS0NtCISHqpEsYqoK2tvHuIjdA",
"accountId":"zhvF-RlL17bC3XZAIlT5-ZwSm4qriDf26tEJ4uLsjeJA",
"puuid":"el6VLquc1JZQLkPHCRXsm7duAmMEWNVw1Sh9gtA-3OK4NOFPP_WTlJlrFCzfWT-SoxuztmocdIBhVQ",
"name":"KooZen2",
"profileIconId":1301,
"revisionDate":1556352067000,
"summonerLevel":47}
*/