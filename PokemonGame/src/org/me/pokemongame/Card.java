/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.pokemongame;

import java.util.ArrayList;


public class Card {
    private String name;
    private int attackBonus;
    public static ArrayList<Card> decisionArray=new ArrayList<Card>();
    public static ArrayList<Card> objectArray=new ArrayList<Card>();

    public Card(String name, int attackBonus) {
        this.name = name;
        this.attackBonus = attackBonus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    
}
