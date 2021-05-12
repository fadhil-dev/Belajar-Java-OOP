package com.tutorial;

public class Player {
    String name;
    private int hp;

    Player(String name, int hp){
        this.name = name;
        this.hp = hp;
    }

    public int getHp(){
        return this.hp;
    }
    
}


