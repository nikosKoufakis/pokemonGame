/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.pokemongame;

import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class Pokemon {
    
    public static ArrayList<Pokemon> starterArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> pinkArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> greenArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> blueArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> redArray=new ArrayList<Pokemon>();
    public static ArrayList<Pokemon> yellowArray=new ArrayList<Pokemon>();
    
    
    
    private String name;
    private int attack;
    private int power;
    public  int[] dice;
    private boolean starter;
    private boolean alive;
    private String color;
    private int number;
    private String firstPrevo;
    private String secondPrevo;

    @SuppressWarnings("empty-statement")
    public Pokemon(String name, int attack, int power, int[] dice, boolean starter, boolean alive, String color, int number,String afirstPrevo,String asecondPrevo ) {
        this.name = name;
        this.attack = attack;
        this.power = power;
        this.dice=dice;
        this.starter = starter;
        this.alive = alive;
        this.color = color;
        this.number = number;
        this.firstPrevo = afirstPrevo; 
        this.secondPrevo=asecondPrevo; 
        
    }

    public String getFirstPrevo() {
        return firstPrevo;
    }

    public String getSecondPrevo() {
        return secondPrevo;
    }

    public String getName() {
        return name;
    }

    public int getAttack() {
        return attack;
    }

    public int getPower() {
        return power;
    }

    public int[] getDice() {
        
        return dice;
    }

    public boolean isStarter() {
        return starter;
    }

    public boolean isAlive() {
        return alive;
    }

    public String getColor() {
        
        return color;
    }

    public int getNumber() {
        return number;
    }

  

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }
    
    
    
}
