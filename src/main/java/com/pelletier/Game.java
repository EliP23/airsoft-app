package com.pelletier;

import java.time.Instant;

public class Game {

    private int id;
    private String type;
    private Instant timePlayed;



    public Game(int id, String type, Instant timePlayed){
        this.id = id;
        this.type = type;
        this.timePlayed = timePlayed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Instant getTimePlayed() {
        return timePlayed;
    }

    public void setTimePlayed(Instant timePlayed) {
        this.timePlayed = timePlayed;
    }
}
