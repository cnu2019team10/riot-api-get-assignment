package org.cnu.realcoding.riotidimformation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RiotPlayerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RiotPlayerApplication.class, args);
	}

}

/*
public class WeatherCrawlerApplication {

	public static void main(String[] args) {
		SpringApplication.run(WeatherCrawlerApplication.class, args);
	}

}

 */