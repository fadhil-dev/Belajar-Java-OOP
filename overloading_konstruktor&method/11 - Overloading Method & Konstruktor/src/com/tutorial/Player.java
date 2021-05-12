package com.tutorial;

public class Player {
    private String name;
    private int hp;

    Player(String name){
        this.name = name;
    }

    Player(int hp){
        this.hp = hp;
    }

    public void show(){
        System.out.println(this.name);
        System.out.println(this.hp);
    }
}

