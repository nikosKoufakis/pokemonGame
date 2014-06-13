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
public class RivalCard extends Card{
    public static ArrayList<RivalCard> rivalArray=new ArrayList<RivalCard>();

    private int attackStrength;
    public RivalCard(String name, int attackBonus,int aattackStrength) {
        super(name, attackBonus);
        this.attackStrength=aattackStrength;
    }

    public static ArrayList<RivalCard> getRivalArray() {
        return rivalArray;
    }

    public static void setRivalArray(ArrayList<RivalCard> rivalArray) {
        RivalCard.rivalArray = rivalArray;
    }

    public int getAttackStrength() {
        return attackStrength;
    }

    public void setAttackStrength(int attackStrength) {
        this.attackStrength = attackStrength;
    }
    
}
