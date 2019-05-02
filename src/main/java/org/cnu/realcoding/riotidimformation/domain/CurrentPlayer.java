package org.cnu.realcoding.riotidimformation.domain;
import lombok.Data;

@Data
public class CurrentPlayer {
    private String name;
    private String id;
    private int profileIconId;
    private long revisionDate;
    private long summonerLevel;
    private String tier;

    /*
    private Main main;
    private Wind wind;
    private Others sys;

    @Data
    public static class Main {
        private double temp;
        private int pressure;
        private int humidity;
    }

    @Data
    public static class Wind {
        private double speed;
        private int deg;
    }

    @Data
    public static class Others {
        private String country;
        private long sunrise;
        private long sunset;
    }

    */
}