package com.pelletier;

public class Event {

    private int id;
    private int gameId;
    private String killer;
    private String weapon;
    private String victim;

    public Event(int id, int gameId, String killer, String weapon, String victim){
        this.id = id;
        this.gameId = gameId;
        this.killer = killer;
        this.weapon = weapon;
        this.victim = victim;
    }

    public int getId() {return id;}
    public int getGameId() {return gameId;}
    public String getKiller() {return killer;}
    public String getWeapon() {return weapon;}
    public String getVictim() {return victim;}


    public void setId(int id) {this.id = id;}
    public void setGameId(int gameId) {this.gameId = gameId;}
    public void setKiller(String killer) {this.killer = killer;}
    public void setWeapon(String weapon) {this.weapon = weapon;}
    public void setVictim(String victim) {this.victim = victim;}





}
