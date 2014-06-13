/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.pokemongame;

import static com.sun.org.apache.regexp.internal.RETest.test;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragGestureListener;
import java.awt.dnd.DragSource;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DragSourceListener;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.TransferHandler;
import static org.me.pokemongame.PlayerFrame.caughtPokemon;

/**
 *
 * @author user
 */
public class TabloFrame extends javax.swing.JFrame {
    public static ArrayList<JLabel> labelList=new ArrayList<JLabel>();
    //public static ArrayList<JLabel> playerLabelList=new ArrayList<JLabel>();
    /**
     * Creates new form TabloFrame
     */
    public TabloFrame() {
        initComponents();
        myinitComponents();
        
       
        
        
        
        Pokemon.starterArray.add(new Pokemon("Bulbasaur",4,4,null,true,true,"starter",1,null,null));
        Pokemon.starterArray.add(new Pokemon("Charmander",4,5,null,true,true,"starter",4,null,null));
        Pokemon.starterArray.add(new Pokemon("Squirtle",4,5,null,true,true,"starter",7,null,null));
        Pokemon.starterArray.add(new Pokemon("Pikachu",3,3,null,true,true,"starter",25,null,null));
        Pokemon.starterArray.add(new Pokemon("Meowth",3,3,null,true,true,"starter",52,null,null));
        Pokemon.starterArray.add(new Pokemon("Clefairy",3,3,null,true,true,"starter",35,null,null));
        
       
        
Pokemon.pinkArray.add(new Pokemon("Caterpie",1,2,new int[]{3, 4, 5},false,true,"pink",10,null,null));
Pokemon.pinkArray.add(new Pokemon("Weedle",2,2,new int[]{3, 4, 5},false,true,"pink",13,null,null)) ;
Pokemon.pinkArray.add(new Pokemon("Pidgey",2,2,new int[]{3, 4, 5},false,true,"pink",16,null,null));
Pokemon.pinkArray.add(new Pokemon("Rattata",2,2,new int[]{3, 4, 5},false,true,"pink",19,null,null)); 
Pokemon.pinkArray.add(new Pokemon("Spearow",3,2,new int[]{3, 4, 5},false,true,"pink",21,null,null) );
Pokemon.pinkArray.add(new Pokemon("Ekans",3,3,new int[]{3, 4, 5},false,true,"pink",23,null,null) );
Pokemon.pinkArray.add(new Pokemon("Sandshrew",2,3,new int[]{3, 4, 5},false,true,"pink",27,null,null));
Pokemon.pinkArray.add(new Pokemon("Nidoran+",2,2,new int[]{3, 4, 5},false,true,"pink",29,null,null) );
Pokemon.pinkArray.add(new Pokemon("Nidoran-",3,2,new int[]{3, 4, 5},false,true,"pink",32,null,null) );
Pokemon.pinkArray.add(new Pokemon("Vulpix",1,3,new int[]{3, 4, 5},false,true,"pink",37,null,null) );
Pokemon.pinkArray.add(new Pokemon("Jigglypuff",2,3,new int[]{3, 4, 5},false,true,"pink",39,null,null));
Pokemon.pinkArray.add(new Pokemon("Zubat",3,2,new int[]{3, 4, 5},false,true,"pink",41,null,null)) ;
Pokemon.pinkArray.add(new Pokemon("Oddish",2,2,new int[]{3, 4, 5},false,true,"pink",43,null,null)) ;
Pokemon.pinkArray.add(new Pokemon("Paras",1,3,new int[]{3, 4, 5},false,true,"pink",46,null,null) );
Pokemon.pinkArray.add(new Pokemon("Venonat",2,2,new int[]{3, 4, 5},false,true,"pink",48,null,null)); 
Pokemon.pinkArray.add(new Pokemon("Diglett",3,2,new int[]{3, 4, 5},false,true,"pink",50,null,null) );
Pokemon.pinkArray.add(new Pokemon("Psyduck",2,3,new int[]{3, 4, 5},false,true,"pink",54,null,null));
Pokemon.pinkArray.add(new Pokemon("Poliwag",2,2,new int[]{3, 4, 5},false,true,"pink",60,null,null) );
Pokemon.pinkArray.add(new Pokemon("Abra",2,3,new int[]{3, 4, 5},false,true,"pink",63,null,null) );
Pokemon.pinkArray.add(new Pokemon("Bellsprout",1,2,new int[]{3, 4, 5},false,true,"pink",69,null,null));
Pokemon.pinkArray.add(new Pokemon("Tentacool",1,2,new int[]{3, 4, 5},false,true,"pink",72,null,null) );
Pokemon.pinkArray.add(new Pokemon("Geodude",1,2,new int[]{3, 4, 5},false,true,"pink",74,null,null) );
Pokemon.pinkArray.add(new Pokemon("Slowpoke",2,3,new int[]{3, 4, 5},false,true,"pink",79,null,null) );
Pokemon.pinkArray.add(new Pokemon("Magnemite",2,2,new int[]{3, 4, 5},false,true,"pink",81,null,null) );
Pokemon.pinkArray.add(new Pokemon("Doduo",3,2,new int[]{3, 4, 5},false,true,"pink",84,null,null) );
Pokemon.pinkArray.add(new Pokemon("Grimer",3,3,new int[]{3, 4, 5},false,true,"pink",88,null,null) );
Pokemon.pinkArray.add(new Pokemon("Shellder",2,2,new int[]{3, 4, 5},false,true,"pink",90,null,null));
Pokemon.pinkArray.add(new Pokemon("Gastly",2,2,new int[]{3, 4, 5},false,true,"pink",92,null,null)) ;
Pokemon.pinkArray.add(new Pokemon("Krabby",3,2,new int[]{3, 4, 5},false,true,"pink",98,null,null) );
Pokemon.pinkArray.add(new Pokemon("Voltorb",3,3,new int[]{3, 4, 5},false,true,"pink",100,null,null));
Pokemon.pinkArray.add(new Pokemon("Exeggcute",1,2,new int[]{3, 4, 5},false,true,"pink",102,null,null));
Pokemon.pinkArray.add(new Pokemon("Horsea",1,2,new int[]{3, 4, 5},false,true,"pink",116,null,null) );
Pokemon.pinkArray.add(new Pokemon("Goldeen",2,2,new int[]{3, 4, 5},false,true,"pink",118,null,null) );
Pokemon.pinkArray.add(new Pokemon("Staryu",2,3,new int[]{3, 4, 5},false,true,"pink",120,null,null));
Pokemon.pinkArray.add(new Pokemon("Magikarp",1,2,new int[]{3, 4, 5},false,true,"pink",129,null,null));

Pokemon.greenArray.add(new Pokemon("Metapod",3,4,new int[]{4, 5},false,true,"green",11,null,null)); 
Pokemon.greenArray.add(new Pokemon("Kakuna",3,4,new int[]{4, 5},false,true,"green",14,null,null));
Pokemon.greenArray.add(new Pokemon("Pidgeotto",4,4,new int[]{4, 5},false,true,"green",17,null,null));
Pokemon.greenArray.add(new Pokemon("Sandslash",5,4,new int[]{4, 5},false,true,"green",28,null,null));
Pokemon.greenArray.add(new Pokemon("Nidorina",5,4,new int[]{4, 5},false,true,"green",30,null,null));
Pokemon.greenArray.add(new Pokemon("Nidorino",5,5,new int[]{4, 5},false,true,"green",33,null,null));
Pokemon.greenArray.add(new Pokemon("Clefable",4,5,new int[]{4, 5},false,true,"green",36,"Clefairy",null));
Pokemon.greenArray.add(new Pokemon("Wigglytuff",4,5,new int[]{4, 5},false,true,"green",40,"Jigglypuff",null));
Pokemon.greenArray.add(new Pokemon("Golbat",4,4,new int[]{4, 5},false,true,"green",42,"Zubat",null));
Pokemon.greenArray.add(new Pokemon("Gloom",5,4,new int[]{4, 5},false,true,"green",44,null,null));
Pokemon.greenArray.add(new Pokemon("Parasect",5,5,new int[]{4, 5},false,true,"green",47,"Paras",null));
Pokemon.greenArray.add(new Pokemon("Dugtrio",4,4,new int[]{4, 5},false,true,"green",51,"Diglett",null));
Pokemon.greenArray.add(new Pokemon("Mankey",5,4,new int[]{4, 5},false,true,"green",56,null,null));
Pokemon.greenArray.add(new Pokemon("Growlithe",4,5,new int[]{4, 5},false,true,"green",58,null,null));
Pokemon.greenArray.add(new Pokemon("Poliwhirl",4,4,new int[]{4, 5},false,true,"green",61,null,null));
Pokemon.greenArray.add(new Pokemon("Kadabra",4,5,new int[]{4, 5},false,true,"green",64,null,null));
Pokemon.greenArray.add(new Pokemon("Machop",5,4,new int[]{4, 5},false,true,"green",66,null,null));
Pokemon.greenArray.add(new Pokemon("Weepinbell",3,4,new int[]{4, 5},false,true,"green",70,null,null));
Pokemon.greenArray.add(new Pokemon("Tentacruel",4,4,new int[]{4, 5},false,true,"green",73,"Tentacool",null));
Pokemon.greenArray.add(new Pokemon("Graveler",4,4,new int[]{4, 5},false,true,"green",75,null,null));
Pokemon.greenArray.add(new Pokemon("Ponyta",5,5,new int[]{4, 5},false,true,"green",77,null,null));
Pokemon.greenArray.add(new Pokemon("Slowbro",3,5,new int[]{4, 5},false,true,"green",80,"Slowpoke",null));
Pokemon.greenArray.add(new Pokemon("Magneton",4,4,new int[]{4, 5},false,true,"green",82,"Magnemite",null));
Pokemon.greenArray.add(new Pokemon("Dodrio",5,5,new int[]{4, 5},false,true,"green",85,"Doduo",null));
Pokemon.greenArray.add(new Pokemon("Seel",5,5,new int[]{4, 5},false,true,"green",86,null,null));
Pokemon.greenArray.add(new Pokemon("Muk",4,4,new int[]{4, 5},false,true,"green",89,"Grimer",null));
Pokemon.greenArray.add(new Pokemon("Cloyster",5,4,new int[]{4, 5},false,true,"green",91,"Shellder",null));
Pokemon.greenArray.add(new Pokemon("Haunter",4,5,new int[]{4, 5},false,true,"green",93,null,null));
Pokemon.greenArray.add(new Pokemon("Drowzee",4,4,new int[]{4, 5},false,true,"green",96,null,null));
Pokemon.greenArray.add(new Pokemon("Kingler",5,4,new int[]{4, 5},false,true,"green",99,"Krabby",null));
Pokemon.greenArray.add(new Pokemon("Electrode",5,4,new int[]{4, 5},false,true,"green",101,"Voltorb",null)); 
Pokemon.greenArray.add(new Pokemon("Cubone",3,4,new int[]{4, 5},false,true,"green",104,null,null));
Pokemon.greenArray.add(new Pokemon("Lickitung",4,5,new int[]{4, 5},false,true,"green",108,null,null));
Pokemon.greenArray.add(new Pokemon("Koffing",4,5,new int[]{4, 5},false,true,"green",109,null,null));
Pokemon.greenArray.add(new Pokemon("Tangela",3,4,new int[]{4, 5},false,true,"green",114,null,null));
Pokemon.greenArray.add(new Pokemon("Seadra",5,4,new int[]{4, 5},false,true,"green",117,"Horsea",null));
Pokemon.greenArray.add(new Pokemon("Seaking",4,4,new int[]{4, 5},false,true,"green",119,"Goldeen",null));
Pokemon.greenArray.add(new Pokemon("Starmie",4,4,new int[]{4, 5},false,true,"green",121,"Staryu",null));
Pokemon.greenArray.add(new Pokemon("Ditto",5,5,new int[]{4, 5},false,true,"green",132,null,null));
Pokemon.greenArray.add(new Pokemon("Eevee",3,5,new int[]{4, 5},false,true,"green",133,null,null));
Pokemon.greenArray.add(new Pokemon("Porygon",4,5,new int[]{4, 5},false,true,"green",137,null,null));

Pokemon.blueArray.add(new Pokemon("Ivysaur",7,7,new int[]{3, 4},false,true,"blue",2,null,null)); 
Pokemon.blueArray.add(new Pokemon("Charmeleon",7,7,new int[]{3, 4},false,true,"blue",5,null,null));
Pokemon.blueArray.add(new Pokemon("Wartortle",7,7,new int[]{3, 4},false,true,"blue",7,null,null));
Pokemon.blueArray.add(new Pokemon("Butterfree",5,6,new int[]{3, 4},false,true,"blue",12,"Metapod","Caterpie"));
Pokemon.blueArray.add(new Pokemon("Beedrill",5,6,new int[]{3, 4},false,true,"blue",15,"Kakuna","Weedle"));
Pokemon.blueArray.add(new Pokemon("Pidgeot",6,6,new int[]{3, 4},false,true,"blue",18,"Pidgeotto","Pidgey"));
Pokemon.blueArray.add(new Pokemon("Raticate",6,6,new int[]{3, 4},false,true,"blue",20,"Rattata",null));
Pokemon.blueArray.add(new Pokemon("Fearow",5,6,new int[]{3, 4},false,true,"blue",22,"Spearow",null));
Pokemon.blueArray.add(new Pokemon("Arbok",5,6,new int[]{3, 4},false,true,"blue",24,"Ekans",null));
Pokemon.blueArray.add(new Pokemon("Raichu",6,6,new int[]{3, 4},false,true,"blue",26,"Pikachu",null));
Pokemon.blueArray.add(new Pokemon("Nidoqueen",5,7,new int[]{3, 4},false,true,"blue",31,"Nidorina","Nidoran+"));
Pokemon.blueArray.add(new Pokemon("Nidoking",6,7,new int[]{3, 4},false,true,"blue",34,"Nidorino","Nidoran-")); 
Pokemon.blueArray.add(new Pokemon("Ninetales",5,7,new int[]{3, 4},false,true,"blue",38,"Vulpix",null));
Pokemon.blueArray.add(new Pokemon("Vileplume",5,7,new int[]{3, 4},false,true,"blue",45,"Gloom","Oddish"));
Pokemon.blueArray.add(new Pokemon("Venomoth",5,6,new int[]{3, 4},false,true,"blue",49,"Venonat",null));
Pokemon.blueArray.add(new Pokemon("Persian",6,7,new int[]{3, 4},false,true,"blue",53,"Meowth",null));
Pokemon.blueArray.add(new Pokemon("Golduck",5,6,new int[]{3, 4},false,true,"blue",55,"Psyduck",null));
Pokemon.blueArray.add(new Pokemon("Primeape",7,7,new int[]{3, 4},false,true,"blue",57,"Mankey",null)); 
Pokemon.blueArray.add(new Pokemon("Poliwrath",7,6,new int[]{3, 4},false,true,"blue",62,"Poliwhirl","Poliwag"));
Pokemon.blueArray.add(new Pokemon("Machoke",7,6,new int[]{3, 4},false,true,"blue",67,null,null));
Pokemon.blueArray.add(new Pokemon("Victreebel",6,6,new int[]{3, 4},false,true,"blue",71,"Weepinbell","Bellsprout"));
Pokemon.blueArray.add(new Pokemon("Golem",6,6,new int[]{3, 4},false,true,"blue",76,"Graveler","Geodude"));
Pokemon.blueArray.add(new Pokemon("Farfetch'd",5,6,new int[]{3, 4},false,true,"blue",83,null,null));
Pokemon.blueArray.add(new Pokemon("Hypno",6,7,new int[]{3, 4},false,true,"blue",97,"Drowzee",null));
Pokemon.blueArray.add(new Pokemon("Marowak",6,6,new int[]{3, 4},false,true,"blue",105,"Cubone",null));
Pokemon.blueArray.add(new Pokemon("Hitmonlee",7,6,new int[]{3, 4},false,true,"blue",106,null,null));
Pokemon.blueArray.add(new Pokemon("Hitmonchan",7,6,new int[]{3, 4},false,true,"blue",107,null,null));
Pokemon.blueArray.add(new Pokemon("Weezing",5,6,new int[]{3, 4},false,true,"blue",110,"Koffing",null));
Pokemon.blueArray.add(new Pokemon("Rhyhorn",6,6,new int[]{3, 4},false,true,"blue",111,null,null));
Pokemon.blueArray.add(new Pokemon("Mr.Mime",6,7,new int[]{3, 4},false,true,"blue",122,null,null));
Pokemon.blueArray.add(new Pokemon("Jynx",5,6,new int[]{3, 4},false,true,"blue",124,null,null)); 
Pokemon.blueArray.add(new Pokemon("Pinsir",5,6,new int[]{3, 4},false,true,"blue",127,null,null));
Pokemon.blueArray.add(new Pokemon("Vaporeon",6,7,new int[]{3, 4},false,true,"blue",134,"Eevee",null));
Pokemon.blueArray.add(new Pokemon("Jolteon",6,7,new int[]{3, 4},false,true,"blue",135,"Eevee",null));
Pokemon.blueArray.add(new Pokemon("Flareon",6,7,new int[]{3, 4},false,true,"blue",136,"Eevee",null));
Pokemon.blueArray.add(new Pokemon("Omanyte",5,7,new int[]{3, 4},false,true,"blue",138,null,null));
Pokemon.blueArray.add(new Pokemon("Kabuto",5,7,new int[]{3, 4},false,true,"blue",140,null,null));
Pokemon.blueArray.add(new Pokemon("Dratini",5,7,new int[]{3, 4},false,true,"blue",147,null,null));

Pokemon.redArray.add(new Pokemon("Venusaur",8,7,new int[]{5},false,true,"red",3,"Ivysaur","Bulbasaur") );
Pokemon.redArray.add(new Pokemon("Charizard",8,7,new int[]{5},false,true,"red",6,"Charmeleon","Charmander") );
Pokemon.redArray.add(new Pokemon("Blastoise",8,7,new int[]{5},false,true,"red",9,"Wartortle","Squirtle") );
Pokemon.redArray.add(new Pokemon("Arcanine",7,6,new int[]{5},false,true,"red",59,"Growlithe",null) );
Pokemon.redArray.add(new Pokemon("Alakazam",7,6,new int[]{5},false,true,"red",65,"Kadabra","Abra") );
Pokemon.redArray.add(new Pokemon("Machamp",8,7,new int[]{5},false,true,"red",68,"Machoke","Machop") );
Pokemon.redArray.add(new Pokemon("Rapidash",7,6,new int[]{5},false,true,"red",78,"Ponyta",null) );
Pokemon.redArray.add(new Pokemon("Dewgong",7,6,new int[]{5},false,true,"red",87,"Seel",null) );
Pokemon.redArray.add(new Pokemon("Gengar",7,7,new int[]{5},false,true,"red",94,"Haunter","Gastly") );
Pokemon.redArray.add(new Pokemon("Onix",7,6,new int[]{5},false,true,"red",95,null,null) );
Pokemon.redArray.add(new Pokemon("Exeggutor",7,6,new int[]{5},false,true,"red",103,"Exeggcute",null) );
Pokemon.redArray.add(new Pokemon("Rhydon",8,6,new int[]{5},false,true,"red",112,"Rhyhorn",null) );
Pokemon.redArray.add(new Pokemon("Chansey",7,7,new int[]{5},false,true,"red",113,null,null) );
Pokemon.redArray.add(new Pokemon("Kangaskhan",7,6,new int[]{5},false,true,"red",115,null,null) );
Pokemon.redArray.add(new Pokemon("Scyther",7,6,new int[]{5},false,true,"red",123,null,null) );
Pokemon.redArray.add(new Pokemon("Electabuzz",8,6,new int[]{5},false,true,"red",125,null,null) );
Pokemon.redArray.add(new Pokemon("Magmar",7,6,new int[]{5},false,true,"red",126,null,null)) ;
Pokemon.redArray.add(new Pokemon("Tauros",8,7,new int[]{5},false,true,"red",128,null,null) );
Pokemon.redArray.add(new Pokemon("Gyarados",8,7,new int[]{5},false,true,"red",130,"Magikarp",null) );
Pokemon.redArray.add(new Pokemon("Lapras",7,6,new int[]{5},false,true,"red",131,null,null) );
Pokemon.redArray.add(new Pokemon("Omastar",7,6,new int[]{5},false,true,"red",139,"Omanyte",null));
Pokemon.redArray.add(new Pokemon("Kabutops",7,6,new int[]{5},false,true,"red",141,"Kabuto",null) );
Pokemon.redArray.add(new Pokemon("Aerodactyl",7,6,new int[]{5},false,true,"red",142,null,null) );
Pokemon.redArray.add(new Pokemon("Snorlax",7,7,new int[]{5},false,true,"red",143,null,null) );
Pokemon.redArray.add(new Pokemon("Dragonair",6,6,new int[]{5},false,true,"red",148,null,null));
Pokemon.redArray.add(new Pokemon("Dragonite",7,7,new int[]{5},false,true,"red",149,"Dragonair","Dratini") );

Pokemon.yellowArray.add(new Pokemon("Articuno",9,8,new int[]{6},false,true,"yellow",144,null,null));
Pokemon.yellowArray.add(new Pokemon("Zapdos",9,8,new int[]{6},false,true,"yellow",145,null,null));
Pokemon.yellowArray.add(new Pokemon("Moltres",9,8,new int[]{6},false,true,"yellow",146,null,null));
Pokemon.yellowArray.add(new Pokemon("Mewtwo",9,9,new int[]{6},false,true,"yellow",150,null,null));        
        
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("1KartaAntikeimenou",0));
Card.decisionArray.add(new Card("2KartesAntikeimenou",0));
Card.decisionArray.add(new Card("2KartesAntikeimenou",0));
Card.decisionArray.add(new Card("2KartesAntikeimenou",0));
Card.decisionArray.add(new Card("2KartesAntikeimenou",0));
Card.decisionArray.add(new Card("2KartesAntikeimenou",0));
Card.decisionArray.add(new Card("3KartesAntikeimenou",0));
Card.decisionArray.add(new Card("3KartesAntikeimenou",0));
Card.decisionArray.add(new Card("3KartesAntikeimenou",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("Battle",0));
Card.decisionArray.add(new Card("KartaTyxis",0));
Card.decisionArray.add(new Card("KartaTyxis",0));
Card.decisionArray.add(new Card("KartaTyxis",0));
Card.decisionArray.add(new Card("KartaTyxis",0));
Card.decisionArray.add(new Card("KartaTyxis",0));
Card.decisionArray.add(new Card("PokeCenter",0));
Card.decisionArray.add(new Card("PokeCenter",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("RandomDungeonPokemon",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));
Card.decisionArray.add(new Card("Trade",0));


Card.objectArray.add(new Card("MagikoFiltro",0));
Card.objectArray.add(new Card("MagikoFiltro",0));
Card.objectArray.add(new Card("MagikoFiltro",0));
Card.objectArray.add(new Card("MagikoFiltro",0));
Card.objectArray.add(new Card("MagikoFiltro",0));
Card.objectArray.add(new Card("Petagma",0));
Card.objectArray.add(new Card("Petagma",0));
Card.objectArray.add(new Card("Petagma",0));
Card.objectArray.add(new Card("Petagma",0));
Card.objectArray.add(new Card("Petagma",0));
Card.objectArray.add(new Card("PokeDoll",0));
Card.objectArray.add(new Card("PokeDoll",0));
Card.objectArray.add(new Card("PokeDoll",0));
Card.objectArray.add(new Card("PokeDoll",0));
Card.objectArray.add(new Card("TimeMachine",0));
Card.objectArray.add(new Card("TimeMachine",0));
Card.objectArray.add(new Card("TimeMachine",0));
Card.objectArray.add(new Card("TimeMachine",0));
Card.objectArray.add(new Card("BonusAttack1",1));
Card.objectArray.add(new Card("BonusAttack1",1));
Card.objectArray.add(new Card("BonusAttack1",1));
Card.objectArray.add(new Card("BonusAttack1",1));
Card.objectArray.add(new Card("BonusAttack2",2));
Card.objectArray.add(new Card("BonusAttack2",2));
Card.objectArray.add(new Card("BonusAttack2",2));
Card.objectArray.add(new Card("BonusAttack2",2));
Card.objectArray.add(new Card("BonusAttack3",3));
Card.objectArray.add(new Card("BonusAttack3",3));
Card.objectArray.add(new Card("BonusAttack3",3));
Card.objectArray.add(new Card("BonusAttack3",3));
Card.objectArray.add(new Card("BonusAttack4",4));
Card.objectArray.add(new Card("BonusAttack4",4));
Card.objectArray.add(new Card("BonusAttack4",4));
Card.objectArray.add(new Card("BonusAttack5",5));
Card.objectArray.add(new Card("BonusAttack5",5));
Card.objectArray.add(new Card("BonusAttack5",5));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("GreatBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("UltraBall",0));
Card.objectArray.add(new Card("MasterBall",0));
Card.objectArray.add(new Card("MasterBall",0));
Card.objectArray.add(new Card("MasterBall",0));
Card.objectArray.add(new Card("MasterBall",0));
Card.objectArray.add(new Card("MasterBall",0));
Card.objectArray.add(new Card("MasterBall",0));

RivalCard.rivalArray.add(new RivalCard("Lorelei",0,10));
RivalCard.rivalArray.add(new RivalCard("Bruno",0,11));
RivalCard.rivalArray.add(new RivalCard("Agatha",0,12));
RivalCard.rivalArray.add(new RivalCard("Lance",0,14));
RivalCard.rivalArray.add(new RivalCard("Gary",0,15));

 Collections.shuffle(Card.objectArray);

Collections.shuffle(Card.decisionArray);

labelList.add(roz1label);
labelList.add(roz2label);
labelList.add(roz3label);
labelList.add(roz4label);
labelList.add(roz5label);
labelList.add(roz6label);
labelList.add(roz7label);
labelList.add(roz8label);
labelList.add(roz9label);
labelList.add(roz10label);

labelList.add(blue1label);
labelList.add(blue2label);
labelList.add(blue3label);
labelList.add(blue4label);
labelList.add(blue5label);
labelList.add(blue6label);
labelList.add(blue7label);
labelList.add(blue8label);
labelList.add(blue9label);
labelList.add(blue10label);

labelList.add(green1label);
labelList.add(green2label);
labelList.add(green3label);
labelList.add(green4label);
labelList.add(green5label);
labelList.add(green6label);
labelList.add(green7label);
labelList.add(green8label);
labelList.add(green9label);
labelList.add(green10label);

labelList.add(red1label);
labelList.add(red2label);
labelList.add(red3label);
labelList.add(red4label);
labelList.add(red5label);
labelList.add(red6label);
labelList.add(red7label);






       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel = new javax.swing.JLabel();
        roz1Button = new javax.swing.JButton();
        roz2Button = new javax.swing.JButton();
        roz3Button = new javax.swing.JButton();
        roz4Button = new javax.swing.JButton();
        roz5Button = new javax.swing.JButton();
        roz6Button = new javax.swing.JButton();
        roz7Button = new javax.swing.JButton();
        roz8Button = new javax.swing.JButton();
        roz9Button = new javax.swing.JButton();
        roz10Button = new javax.swing.JButton();
        yellowButton = new javax.swing.JButton();
        green1Button = new javax.swing.JButton();
        green2Button = new javax.swing.JButton();
        green3Button = new javax.swing.JButton();
        green4Button = new javax.swing.JButton();
        green5Button = new javax.swing.JButton();
        green6Button = new javax.swing.JButton();
        green7Button = new javax.swing.JButton();
        green8Button = new javax.swing.JButton();
        green9Button = new javax.swing.JButton();
        green10Button = new javax.swing.JButton();
        red1Button = new javax.swing.JButton();
        red2Button = new javax.swing.JButton();
        red3Button = new javax.swing.JButton();
        red4Button = new javax.swing.JButton();
        red5Button = new javax.swing.JButton();
        red6Button = new javax.swing.JButton();
        red7Button = new javax.swing.JButton();
        blue1Button = new javax.swing.JButton();
        blue2Button = new javax.swing.JButton();
        blue3Button = new javax.swing.JButton();
        blue4Button = new javax.swing.JButton();
        blue5Button = new javax.swing.JButton();
        blue6Button = new javax.swing.JButton();
        blue7Button = new javax.swing.JButton();
        blue8Button = new javax.swing.JButton();
        blue9Button = new javax.swing.JButton();
        blue10Button = new javax.swing.JButton();
        kartaantipalouButton = new javax.swing.JButton();
        roz1label = new javax.swing.JLabel();
        roz2label = new javax.swing.JLabel();
        roz3label = new javax.swing.JLabel();
        roz4label = new javax.swing.JLabel();
        roz5label = new javax.swing.JLabel();
        roz6label = new javax.swing.JLabel();
        roz7label = new javax.swing.JLabel();
        roz8label = new javax.swing.JLabel();
        roz9label = new javax.swing.JLabel();
        roz10label = new javax.swing.JLabel();
        green1label = new javax.swing.JLabel();
        green2label = new javax.swing.JLabel();
        green3label = new javax.swing.JLabel();
        green4label = new javax.swing.JLabel();
        green5label = new javax.swing.JLabel();
        green6label = new javax.swing.JLabel();
        green7label = new javax.swing.JLabel();
        green8label = new javax.swing.JLabel();
        green9label = new javax.swing.JLabel();
        green10label = new javax.swing.JLabel();
        red1label = new javax.swing.JLabel();
        red2label = new javax.swing.JLabel();
        red3label = new javax.swing.JLabel();
        red4label = new javax.swing.JLabel();
        red5label = new javax.swing.JLabel();
        red6label = new javax.swing.JLabel();
        red7label = new javax.swing.JLabel();
        blue1label = new javax.swing.JLabel();
        blue2label = new javax.swing.JLabel();
        blue3label = new javax.swing.JLabel();
        blue4label = new javax.swing.JLabel();
        blue5label = new javax.swing.JLabel();
        blue6label = new javax.swing.JLabel();
        blue7label = new javax.swing.JLabel();
        blue8label = new javax.swing.JLabel();
        blue9label = new javax.swing.JLabel();
        blue10label = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        healpkmnButton1 = new javax.swing.JButton();
        healpkmnButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Board");
        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 990));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setOpaque(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setPreferredSize(new java.awt.Dimension(3575, 2162));

        jLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/board_final.png"))); // NOI18N

        roz1Button.setBorderPainted(false);
        roz1Button.setContentAreaFilled(false);
        roz1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz1ButtonActionPerformed(evt);
            }
        });

        roz2Button.setBorderPainted(false);
        roz2Button.setContentAreaFilled(false);
        roz2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz2ButtonActionPerformed(evt);
            }
        });

        roz3Button.setBorderPainted(false);
        roz3Button.setContentAreaFilled(false);
        roz3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz3ButtonActionPerformed(evt);
            }
        });

        roz4Button.setBorderPainted(false);
        roz4Button.setContentAreaFilled(false);
        roz4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz4ButtonActionPerformed(evt);
            }
        });

        roz5Button.setBorderPainted(false);
        roz5Button.setContentAreaFilled(false);
        roz5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz5ButtonActionPerformed(evt);
            }
        });

        roz6Button.setBorderPainted(false);
        roz6Button.setContentAreaFilled(false);
        roz6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz6ButtonActionPerformed(evt);
            }
        });

        roz7Button.setBorderPainted(false);
        roz7Button.setContentAreaFilled(false);
        roz7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz7ButtonActionPerformed(evt);
            }
        });

        roz8Button.setBorderPainted(false);
        roz8Button.setContentAreaFilled(false);
        roz8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz8ButtonActionPerformed(evt);
            }
        });

        roz9Button.setBorderPainted(false);
        roz9Button.setContentAreaFilled(false);
        roz9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz9ButtonActionPerformed(evt);
            }
        });

        roz10Button.setBorderPainted(false);
        roz10Button.setContentAreaFilled(false);
        roz10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roz10ButtonActionPerformed(evt);
            }
        });

        yellowButton.setBorderPainted(false);
        yellowButton.setContentAreaFilled(false);
        yellowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yellowButtonActionPerformed(evt);
            }
        });

        green1Button.setBorderPainted(false);
        green1Button.setContentAreaFilled(false);
        green1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green1ButtonActionPerformed(evt);
            }
        });

        green2Button.setBorderPainted(false);
        green2Button.setContentAreaFilled(false);
        green2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green2ButtonActionPerformed(evt);
            }
        });

        green3Button.setBorderPainted(false);
        green3Button.setContentAreaFilled(false);
        green3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green3ButtonActionPerformed(evt);
            }
        });

        green4Button.setBorderPainted(false);
        green4Button.setContentAreaFilled(false);
        green4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green4ButtonActionPerformed(evt);
            }
        });

        green5Button.setBorderPainted(false);
        green5Button.setContentAreaFilled(false);
        green5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green5ButtonActionPerformed(evt);
            }
        });

        green6Button.setBorderPainted(false);
        green6Button.setContentAreaFilled(false);
        green6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green6ButtonActionPerformed(evt);
            }
        });

        green7Button.setBorderPainted(false);
        green7Button.setContentAreaFilled(false);
        green7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green7ButtonActionPerformed(evt);
            }
        });

        green8Button.setBorderPainted(false);
        green8Button.setContentAreaFilled(false);
        green8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green8ButtonActionPerformed(evt);
            }
        });

        green9Button.setBorderPainted(false);
        green9Button.setContentAreaFilled(false);
        green9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green9ButtonActionPerformed(evt);
            }
        });

        green10Button.setBorderPainted(false);
        green10Button.setContentAreaFilled(false);
        green10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                green10ButtonActionPerformed(evt);
            }
        });

        red1Button.setBorderPainted(false);
        red1Button.setContentAreaFilled(false);
        red1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red1ButtonActionPerformed(evt);
            }
        });

        red2Button.setBorderPainted(false);
        red2Button.setContentAreaFilled(false);
        red2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red2ButtonActionPerformed(evt);
            }
        });

        red3Button.setBorderPainted(false);
        red3Button.setContentAreaFilled(false);
        red3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red3ButtonActionPerformed(evt);
            }
        });

        red4Button.setBorderPainted(false);
        red4Button.setContentAreaFilled(false);
        red4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red4ButtonActionPerformed(evt);
            }
        });

        red5Button.setBorderPainted(false);
        red5Button.setContentAreaFilled(false);
        red5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red5ButtonActionPerformed(evt);
            }
        });

        red6Button.setBorderPainted(false);
        red6Button.setContentAreaFilled(false);
        red6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red6ButtonActionPerformed(evt);
            }
        });

        red7Button.setBorderPainted(false);
        red7Button.setContentAreaFilled(false);
        red7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red7ButtonActionPerformed(evt);
            }
        });

        blue1Button.setBorderPainted(false);
        blue1Button.setContentAreaFilled(false);
        blue1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue1ButtonActionPerformed(evt);
            }
        });

        blue2Button.setBorderPainted(false);
        blue2Button.setContentAreaFilled(false);
        blue2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue2ButtonActionPerformed(evt);
            }
        });

        blue3Button.setBorderPainted(false);
        blue3Button.setContentAreaFilled(false);
        blue3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue3ButtonActionPerformed(evt);
            }
        });

        blue4Button.setBorderPainted(false);
        blue4Button.setContentAreaFilled(false);
        blue4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue4ButtonActionPerformed(evt);
            }
        });

        blue5Button.setBorderPainted(false);
        blue5Button.setContentAreaFilled(false);
        blue5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue5ButtonActionPerformed(evt);
            }
        });

        blue6Button.setBorderPainted(false);
        blue6Button.setContentAreaFilled(false);
        blue6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue6ButtonActionPerformed(evt);
            }
        });

        blue7Button.setBorderPainted(false);
        blue7Button.setContentAreaFilled(false);
        blue7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue7ButtonActionPerformed(evt);
            }
        });

        blue8Button.setBorderPainted(false);
        blue8Button.setContentAreaFilled(false);
        blue8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue8ButtonActionPerformed(evt);
            }
        });

        blue9Button.setBorderPainted(false);
        blue9Button.setContentAreaFilled(false);
        blue9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue9ButtonActionPerformed(evt);
            }
        });

        blue10Button.setBorderPainted(false);
        blue10Button.setContentAreaFilled(false);
        blue10Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue10ButtonActionPerformed(evt);
            }
        });

        kartaantipalouButton.setBorderPainted(false);
        kartaantipalouButton.setContentAreaFilled(false);
        kartaantipalouButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartaantipalouButtonActionPerformed(evt);
            }
        });

        roz1label.setBackground(new java.awt.Color(255, 255, 255));
        roz1label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz2label.setBackground(new java.awt.Color(255, 255, 255));
        roz2label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz3label.setBackground(new java.awt.Color(255, 255, 255));
        roz3label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz4label.setBackground(new java.awt.Color(255, 255, 255));
        roz4label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz5label.setBackground(new java.awt.Color(255, 255, 255));
        roz5label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz6label.setBackground(new java.awt.Color(255, 255, 255));
        roz6label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz7label.setBackground(new java.awt.Color(255, 255, 255));
        roz7label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz8label.setBackground(new java.awt.Color(255, 255, 255));
        roz8label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz9label.setBackground(new java.awt.Color(255, 255, 255));
        roz9label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        roz10label.setBackground(new java.awt.Color(255, 255, 255));
        roz10label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green1label.setBackground(new java.awt.Color(255, 255, 255));
        green1label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green2label.setBackground(new java.awt.Color(255, 255, 255));
        green2label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green3label.setBackground(new java.awt.Color(255, 255, 255));
        green3label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green4label.setBackground(new java.awt.Color(255, 255, 255));
        green4label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green5label.setBackground(new java.awt.Color(255, 255, 255));
        green5label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green6label.setBackground(new java.awt.Color(255, 255, 255));
        green6label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green7label.setBackground(new java.awt.Color(255, 255, 255));
        green7label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green8label.setBackground(new java.awt.Color(255, 255, 255));
        green8label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green9label.setBackground(new java.awt.Color(255, 255, 255));
        green9label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        green10label.setBackground(new java.awt.Color(255, 255, 255));
        green10label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red1label.setBackground(new java.awt.Color(255, 255, 255));
        red1label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red2label.setBackground(new java.awt.Color(255, 255, 255));
        red2label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red3label.setBackground(new java.awt.Color(255, 255, 255));
        red3label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red4label.setBackground(new java.awt.Color(255, 255, 255));
        red4label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red5label.setBackground(new java.awt.Color(255, 255, 255));
        red5label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red6label.setBackground(new java.awt.Color(255, 255, 255));
        red6label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        red7label.setBackground(new java.awt.Color(255, 255, 255));
        red7label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue1label.setBackground(new java.awt.Color(255, 255, 255));
        blue1label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue2label.setBackground(new java.awt.Color(255, 255, 255));
        blue2label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue3label.setBackground(new java.awt.Color(255, 255, 255));
        blue3label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue4label.setBackground(new java.awt.Color(255, 255, 255));
        blue4label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue5label.setBackground(new java.awt.Color(255, 255, 255));
        blue5label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue6label.setBackground(new java.awt.Color(255, 255, 255));
        blue6label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue7label.setBackground(new java.awt.Color(255, 255, 255));
        blue7label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue8label.setBackground(new java.awt.Color(255, 255, 255));
        blue8label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue9label.setBackground(new java.awt.Color(255, 255, 255));
        blue9label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        blue10label.setBackground(new java.awt.Color(255, 255, 255));
        blue10label.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player1.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel1MouseDragged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player2.png"))); // NOI18N
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player3.png"))); // NOI18N
        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player4.png"))); // NOI18N
        jLabel4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel4MouseDragged(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player5.png"))); // NOI18N
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel5MouseDragged(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/player6.png"))); // NOI18N
        jLabel6.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel6MouseDragged(evt);
            }
        });

        healpkmnButton1.setText("Heal PKMN");
        healpkmnButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healpkmnButton1ActionPerformed(evt);
            }
        });

        healpkmnButton2.setText("Heal PKMN");
        healpkmnButton2.setOpaque(false);
        healpkmnButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healpkmnButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(480, 480, 480)
                .addComponent(roz8label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(710, 710, 710)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(green2label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(green2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(913, 913, 913)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(green5label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(green5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(roz10label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(roz5label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(610, 610, 610)
                .addComponent(red1label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1330, 1330, 1330)
                .addComponent(green8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(roz3label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2993, 2993, 2993)
                .addComponent(blue5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(630, 630, 630)
                .addComponent(jLabel2)
                .addGap(43, 43, 43)
                .addComponent(jLabel6)
                .addGap(1100, 1100, 1100)
                .addComponent(blue9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(460, 460, 460)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blue7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(blue7label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(120, 120, 120)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(blue6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(blue6label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1140, 1140, 1140)
                .addComponent(red5label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1920, 1920, 1920)
                .addComponent(blue10label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1330, 1330, 1330)
                .addComponent(red7label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(roz6label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(roz7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(red4label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(roz1label, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(roz5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2320, 2320, 2320)
                .addComponent(green8label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(red3label, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1960, 1960, 1960)
                .addComponent(blue1label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(570, 570, 570)
                .addComponent(jLabel4))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3113, 3113, 3113)
                .addComponent(green7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1903, 1903, 1903)
                .addComponent(blue1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2963, 2963, 2963)
                .addComponent(blue4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1650, 1650, 1650)
                .addComponent(red6label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(roz3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2553, 2553, 2553)
                .addComponent(green6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(443, 443, 443)
                .addComponent(roz8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(roz2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(red1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(340, 340, 340)
                .addComponent(roz7label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(743, 743, 743)
                .addComponent(red4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3030, 3030, 3030)
                .addComponent(blue4label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(roz6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2530, 2530, 2530)
                .addComponent(blue3label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1293, 1293, 1293)
                .addComponent(red7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1473, 1473, 1473)
                .addComponent(green10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2630, 2630, 2630)
                .addComponent(green6label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1510, 1510, 1510)
                .addComponent(green3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(750, 750, 750)
                .addComponent(red2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1260, 1260, 1260)
                .addComponent(kartaantipalouButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1950, 1950, 1950)
                .addComponent(blue9label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1863, 1863, 1863)
                .addComponent(blue10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2310, 2310, 2310)
                .addComponent(blue2label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2510, 2510, 2510)
                .addComponent(blue8label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1910, 1910, 1910)
                .addComponent(green4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2253, 2253, 2253)
                .addComponent(blue2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1103, 1103, 1103)
                .addComponent(red5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1148, 1148, 1148)
                .addComponent(green1label, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(823, 823, 823)
                .addComponent(roz10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1540, 1540, 1540)
                .addComponent(green9label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(roz2label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(jLabel1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(860, 860, 860)
                .addComponent(roz9label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(823, 823, 823)
                .addComponent(roz9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(543, 543, 543)
                .addComponent(roz4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2440, 2440, 2440)
                .addComponent(blue8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(580, 580, 580)
                .addComponent(roz4label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2793, 2793, 2793)
                .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 630, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(roz1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1503, 1503, 1503)
                .addComponent(green9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1100, 1100, 1100)
                .addComponent(green1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2463, 2463, 2463)
                .addComponent(blue3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3190, 3190, 3190)
                .addComponent(green7label, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1510, 1510, 1510)
                .addComponent(green10label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1970, 1970, 1970)
                .addComponent(green4label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1633, 1633, 1633)
                .addComponent(red6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1680, 1680, 1680)
                .addComponent(healpkmnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(3060, 3060, 3060)
                .addComponent(blue5label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(730, 730, 730)
                .addComponent(jLabel3))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(790, 790, 790)
                .addComponent(red2label, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(healpkmnButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1530, 1530, 1530)
                .addComponent(green3label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(743, 743, 743)
                .addComponent(red3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 6850, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(roz8label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(green2label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(green2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(green5label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(green5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(170, 170, 170)
                .addComponent(roz10label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(roz5label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(red1label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(green8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(140, 140, 140)
                .addComponent(roz3label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250)
                .addComponent(blue5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(jLabel6))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(blue9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blue7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(blue7label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(blue6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(blue6label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(80, 80, 80)
                .addComponent(red5label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(blue10label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(red7label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(410, 410, 410)
                .addComponent(roz6label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(roz7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1380, 1380, 1380)
                .addComponent(red4label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1400, 1400, 1400)
                .addComponent(roz1label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(600, 600, 600)
                .addComponent(roz5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(560, 560, 560)
                .addComponent(green8label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1100, 1100, 1100)
                .addComponent(red3label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(930, 930, 930)
                .addComponent(blue1label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1626, 1626, 1626)
                .addComponent(jLabel4))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(green7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(890, 890, 890)
                .addComponent(blue1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(840, 840, 840)
                .addComponent(blue4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(2000, 2000, 2000)
                .addComponent(red6label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(roz3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(green6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1630, 1630, 1630)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roz8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1190, 1190, 1190)
                .addComponent(roz2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(red1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(roz7label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1340, 1340, 1340)
                .addComponent(red4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(blue4label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(380, 380, 380)
                .addComponent(roz6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(870, 870, 870)
                .addComponent(blue3label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1840, 1840, 1840)
                .addComponent(red7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(780, 780, 780)
                .addComponent(green10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(470, 470, 470)
                .addComponent(green6label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(green3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(850, 850, 850)
                .addComponent(red2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1150, 1150, 1150)
                .addComponent(kartaantipalouButton, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1560, 1560, 1560)
                .addComponent(blue9label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1833, 1833, 1833)
                .addComponent(blue10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1340, 1340, 1340)
                .addComponent(blue2label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(blue8label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(green4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1310, 1310, 1310)
                .addComponent(blue2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1730, 1730, 1730)
                .addComponent(red5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(444, 444, 444)
                .addComponent(green1label, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(430, 430, 430)
                .addComponent(roz10Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(green9label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1230, 1230, 1230)
                .addComponent(roz2label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1556, 1556, 1556)
                .addComponent(jLabel1))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(roz9label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(roz9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(610, 610, 610)
                .addComponent(roz4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1710, 1710, 1710)
                .addComponent(blue8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(640, 640, 640)
                .addComponent(roz4label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1670, 1670, 1670)
                .addComponent(yellowButton, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1370, 1370, 1370)
                .addComponent(roz1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(460, 460, 460)
                .addComponent(green9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(green1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(840, 840, 840)
                .addComponent(blue3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(390, 390, 390)
                .addComponent(green7label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(820, 820, 820)
                .addComponent(green10label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(green4label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1940, 1940, 1940)
                .addComponent(red6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(223, 223, 223)
                .addComponent(healpkmnButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1170, 1170, 1170)
                .addComponent(blue5label, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1556, 1556, 1556)
                .addComponent(jLabel3))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(890, 890, 890)
                .addComponent(red2label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1030, 1030, 1030)
                .addComponent(healpkmnButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(green3label, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(1060, 1060, 1060)
                .addComponent(red3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 2151, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jScrollPane1.setViewportView(jPanel3);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 3573, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 2154, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roz1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz1ButtonActionPerformed
      if(roz1label.isOpaque()){
            new PokemonTapaFrame(roz1label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);
            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
            }
        roz1label.setText(PokemonTapaFrame.p.getName()); 
        roz1label.setOpaque(true); 
        }
        }
        
      
        
   

/*
new PokemonTapaFrame().setVisible(true);    }//GEN-LAST:event_roz1ButtonActionPerformed
*/
    private void yellowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yellowButtonActionPerformed
       if(Pokemon.yellowArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("yellow").setVisible(true);
               
            }
    }//GEN-LAST:event_yellowButtonActionPerformed

    private void green1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green1ButtonActionPerformed
      if(green1label.isOpaque()){
            new PokemonTapaFrame(green1label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
        green1label.setText(PokemonTapaFrame.p.getName());
        green1label.setOpaque(true);}
    }//GEN-LAST:event_green1ButtonActionPerformed

    private void red1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red1ButtonActionPerformed
     if(red1label.isOpaque()){
            new PokemonTapaFrame(red1label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
        red1label.setText(PokemonTapaFrame.p.getName());
        red1label.setOpaque(true);}
    }//GEN-LAST:event_red1ButtonActionPerformed

    private void blue1ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue1ButtonActionPerformed
       if(blue1label.isOpaque()){
            new PokemonTapaFrame(blue1label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
        blue1label.setText(PokemonTapaFrame.p.getName());
        blue1label.setOpaque(true);}
    }//GEN-LAST:event_blue1ButtonActionPerformed

    private void roz2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz2ButtonActionPerformed
      if(roz2label.isOpaque()){
            new PokemonTapaFrame(roz2label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
        roz2label.setText(PokemonTapaFrame.p.getName());
        roz2label.setOpaque(true);}
    }//GEN-LAST:event_roz2ButtonActionPerformed

    private void roz3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz3ButtonActionPerformed
      
        if(roz3label.isOpaque()){
            new PokemonTapaFrame(roz3label.getText()).setVisible(true);
        }
        else {if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz3label.setText(PokemonTapaFrame.p.getName());
        roz3label.setOpaque(true);}
    }//GEN-LAST:event_roz3ButtonActionPerformed

    private void roz4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz4ButtonActionPerformed
       if(roz4label.isOpaque()){
            new PokemonTapaFrame(roz4label.getText()).setVisible(true);
        }
        else {
        
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz4label.setText(PokemonTapaFrame.p.getName());
        roz4label.setOpaque(true);}
    }//GEN-LAST:event_roz4ButtonActionPerformed

    private void roz5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz5ButtonActionPerformed
       if(roz5label.isOpaque()){
            new PokemonTapaFrame(roz5label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz5label.setText(PokemonTapaFrame.p.getName());
        roz5label.setOpaque(true);}
    }//GEN-LAST:event_roz5ButtonActionPerformed

    private void roz6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz6ButtonActionPerformed
       if(roz6label.isOpaque()){
            new PokemonTapaFrame(roz6label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz6label.setText(PokemonTapaFrame.p.getName());
        roz6label.setOpaque(true);}
    }//GEN-LAST:event_roz6ButtonActionPerformed

    private void roz7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz7ButtonActionPerformed
       if(roz7label.isOpaque()){
            new PokemonTapaFrame(roz7label.getText()).setVisible(true);
        }
        else {
        if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz7label.setText(PokemonTapaFrame.p.getName());
        roz7label.setOpaque(true);}
    }//GEN-LAST:event_roz7ButtonActionPerformed

    private void roz8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz8ButtonActionPerformed
      
        if(roz8label.isOpaque()){
            new PokemonTapaFrame(roz8label.getText()).setVisible(true);
        }
        else {if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz8label.setText(PokemonTapaFrame.p.getName());
        roz8label.setOpaque(true);}
    }//GEN-LAST:event_roz8ButtonActionPerformed

    private void roz9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz9ButtonActionPerformed
       
        if(roz9label.isOpaque()){
            new PokemonTapaFrame(roz9label.getText()).setVisible(true);
        }
        else {if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz9label.setText(PokemonTapaFrame.p.getName());
        roz9label.setOpaque(true);}
    }//GEN-LAST:event_roz9ButtonActionPerformed

    private void roz10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roz10ButtonActionPerformed
     if(roz10label.isOpaque()){
            new PokemonTapaFrame(roz10label.getText()).setVisible(true);
        }
        else {   if(Pokemon.pinkArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("pink").setVisible(true);
               
            }
         roz10label.setText(PokemonTapaFrame.p.getName());
        roz10label.setOpaque(true);}
    }//GEN-LAST:event_roz10ButtonActionPerformed

    private void green2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green2ButtonActionPerformed
        if(green2label.isOpaque()){
            new PokemonTapaFrame(green2label.getText()).setVisible(true);
        }
        else { if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green2label.setText(PokemonTapaFrame.p.getName());
        green2label.setOpaque(true);}
    }//GEN-LAST:event_green2ButtonActionPerformed

    private void green3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green3ButtonActionPerformed
       if(green3label.isOpaque()){
            new PokemonTapaFrame(green3label.getText()).setVisible(true);
        }
        else {  if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green3label.setText(PokemonTapaFrame.p.getName());
        green3label.setOpaque(true);}
    }//GEN-LAST:event_green3ButtonActionPerformed

    private void green4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green4ButtonActionPerformed
       if(green4label.isOpaque()){
            new PokemonTapaFrame(green4label.getText()).setVisible(true);
        }
        else {  if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green4label.setText(PokemonTapaFrame.p.getName());
        green4label.setOpaque(true);}
    }//GEN-LAST:event_green4ButtonActionPerformed

    private void green5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green5ButtonActionPerformed
       if(green5label.isOpaque()){
            new PokemonTapaFrame(green5label.getText()).setVisible(true);
        }
        else {  if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green5label.setText(PokemonTapaFrame.p.getName());
        green5label.setOpaque(true);}
    }//GEN-LAST:event_green5ButtonActionPerformed

    private void green6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green6ButtonActionPerformed
        if(green6label.isOpaque()){
            new PokemonTapaFrame(green6label.getText()).setVisible(true);
        }
        else { if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green6label.setText(PokemonTapaFrame.p.getName());
        green6label.setOpaque(true);}
    }//GEN-LAST:event_green6ButtonActionPerformed

    private void green7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green7ButtonActionPerformed
        if(green7label.isOpaque()){
            new PokemonTapaFrame(green7label.getText()).setVisible(true);
        }
        else { if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green7label.setText(PokemonTapaFrame.p.getName());
        green7label.setOpaque(true);}
    }//GEN-LAST:event_green7ButtonActionPerformed

    private void green8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green8ButtonActionPerformed
        if(green8label.isOpaque()){
            new PokemonTapaFrame(green8label.getText()).setVisible(true);
        }
        else { if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green8label.setText(PokemonTapaFrame.p.getName());
        green8label.setOpaque(true);}
    }//GEN-LAST:event_green8ButtonActionPerformed

    private void green9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green9ButtonActionPerformed
        if(green9label.isOpaque()){
            new PokemonTapaFrame(green9label.getText()).setVisible(true);
        }
        else { if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green9label.setText(PokemonTapaFrame.p.getName());
        green9label.setOpaque(true);}
    }//GEN-LAST:event_green9ButtonActionPerformed

    private void green10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_green10ButtonActionPerformed
       if(green10label.isOpaque()){
            new PokemonTapaFrame(green10label.getText()).setVisible(true);
        }
        else {  if(Pokemon.greenArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("green").setVisible(true);
               
            }
         green10label.setText(PokemonTapaFrame.p.getName());
        green10label.setOpaque(true);}
    }//GEN-LAST:event_green10ButtonActionPerformed

    private void red2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red2ButtonActionPerformed
       if(red2label.isOpaque()){
            new PokemonTapaFrame(red2label.getText()).setVisible(true);
        }
        else {  if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
         red2label.setText(PokemonTapaFrame.p.getName());
        red2label.setOpaque(true);}
    }//GEN-LAST:event_red2ButtonActionPerformed

    private void red3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red3ButtonActionPerformed
         if(red3label.isOpaque()){
            new PokemonTapaFrame(red3label.getText()).setVisible(true);
        }
        else { if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
         red3label.setText(PokemonTapaFrame.p.getName());
        red3label.setOpaque(true);}
    }//GEN-LAST:event_red3ButtonActionPerformed

    private void red4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red4ButtonActionPerformed
        if(red4label.isOpaque()){
            new PokemonTapaFrame(red4label.getText()).setVisible(true);
        }
        else { if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
        red4label.setText(PokemonTapaFrame.p.getName());
        red4label.setOpaque(true);}
    }//GEN-LAST:event_red4ButtonActionPerformed

    private void red5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red5ButtonActionPerformed
        if(red5label.isOpaque()){
            new PokemonTapaFrame(red5label.getText()).setVisible(true);
        }
        else {  if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
         red5label.setText(PokemonTapaFrame.p.getName());
        red5label.setOpaque(true);}
    }//GEN-LAST:event_red5ButtonActionPerformed

    private void red6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red6ButtonActionPerformed
          if(red6label.isOpaque()){
            new PokemonTapaFrame(red6label.getText()).setVisible(true);
        }
        else {if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
         red6label.setText(PokemonTapaFrame.p.getName());
        red6label.setOpaque(true);}
    }//GEN-LAST:event_red6ButtonActionPerformed

    private void red7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red7ButtonActionPerformed
        if(red7label.isOpaque()){
            new PokemonTapaFrame(red7label.getText()).setVisible(true);
        }
        else {  if(Pokemon.redArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("red").setVisible(true);
               
            }
         red7label.setText(PokemonTapaFrame.p.getName());
        red7label.setOpaque(true);}
    }//GEN-LAST:event_red7ButtonActionPerformed

    private void blue2ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue2ButtonActionPerformed
          if(blue2label.isOpaque()){
            new PokemonTapaFrame(blue2label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue2label.setText(PokemonTapaFrame.p.getName());
        blue2label.setOpaque(true);}
    }//GEN-LAST:event_blue2ButtonActionPerformed

    private void blue3ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue3ButtonActionPerformed
          if(blue3label.isOpaque()){
            new PokemonTapaFrame(blue3label.getText()).setVisible(true);
        }
        else {  if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue3label.setText(PokemonTapaFrame.p.getName());
        blue3label.setOpaque(true);}
    }//GEN-LAST:event_blue3ButtonActionPerformed

    private void blue4ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue4ButtonActionPerformed
           if(blue4label.isOpaque()){
            new PokemonTapaFrame(blue4label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue4label.setText(PokemonTapaFrame.p.getName());
        blue4label.setOpaque(true);}
    }//GEN-LAST:event_blue4ButtonActionPerformed

    private void blue5ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue5ButtonActionPerformed
           if(blue5label.isOpaque()){
            new PokemonTapaFrame(blue5label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue5label.setText(PokemonTapaFrame.p.getName());
        blue5label.setOpaque(true);}
    }//GEN-LAST:event_blue5ButtonActionPerformed

    private void blue6ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue6ButtonActionPerformed
          if(blue6label.isOpaque()){
            new PokemonTapaFrame(blue6label.getText()).setVisible(true);
        }
        else {  if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue6label.setText(PokemonTapaFrame.p.getName());
        blue6label.setOpaque(true);}
    }//GEN-LAST:event_blue6ButtonActionPerformed

    private void blue7ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue7ButtonActionPerformed
           if(blue7label.isOpaque()){
            new PokemonTapaFrame(blue7label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue7label.setText(PokemonTapaFrame.p.getName());
        blue7label.setOpaque(true);}
    }//GEN-LAST:event_blue7ButtonActionPerformed

    private void blue8ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue8ButtonActionPerformed
           if(blue8label.isOpaque()){
            new PokemonTapaFrame(blue8label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue8label.setText(PokemonTapaFrame.p.getName());
        blue8label.setOpaque(true);}
    }//GEN-LAST:event_blue8ButtonActionPerformed

    private void blue9ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue9ButtonActionPerformed
           if(blue9label.isOpaque()){
            new PokemonTapaFrame(blue9label.getText()).setVisible(true);
        }
        else { if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue9label.setText(PokemonTapaFrame.p.getName());
        blue9label.setOpaque(true);}
    }//GEN-LAST:event_blue9ButtonActionPerformed

    private void blue10ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue10ButtonActionPerformed
          if(blue10label.isOpaque()){
            new PokemonTapaFrame(blue10label.getText()).setVisible(true);
        }
        else {  if(Pokemon.blueArray.isEmpty())
            {
                JOptionPane.showMessageDialog(rootPane, "There are no more Pokemon of this color! ", "Sorry! ", WIDTH);

            }
        else
            {
              new PokemonTapaFrame("blue").setVisible(true);
               
            }
          blue10label.setText(PokemonTapaFrame.p.getName());
        blue10label.setOpaque(true);}
    }//GEN-LAST:event_blue10ButtonActionPerformed

    private void kartaantipalouButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartaantipalouButtonActionPerformed
    
    }//GEN-LAST:event_kartaantipalouButtonActionPerformed

    private void jLabel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseDragged
       Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();
    }//GEN-LAST:event_jLabel1MouseDragged

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel4MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseDragged
        Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();// TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseDragged

    private void jLabel5MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseDragged
Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseDragged

    private void jLabel6MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseDragged
Component c = evt.getComponent();
c.setLocation( c.getX()+evt.getX(), c.getY()+evt.getY() );

this.repaint();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseDragged

    private void healpkmnButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healpkmnButton1ActionPerformed
new HealFrame().setVisible(true);    }//GEN-LAST:event_healpkmnButton1ActionPerformed

    private void healpkmnButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healpkmnButton2ActionPerformed

        new HealFrame().setVisible(true);                                            

    }//GEN-LAST:event_healpkmnButton2ActionPerformed

 
            
    
    private void myinitComponents()
{
    Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension d = tk.getScreenSize();
    Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(getGraphicsConfiguration());
int taskBarSize = scnMax.bottom;
    this.setBounds(0, 0, 1000, d.height-taskBarSize);
    
    jScrollPane1.getVerticalScrollBar().setUnitIncrement(20);
    
 JScrollBar vertical = jScrollPane1.getVerticalScrollBar();
vertical.setValue( vertical.getMaximum() );
 

jPanel3.setLayout(null);


switch(PlayerFrame.numberOfPlayers)
{
    case 2:
        jLabel3.setVisible(false);
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        break;
    case 3:
        jLabel4.setVisible(false);
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        break;
    case 4:
        jLabel5.setVisible(false);
        jLabel6.setVisible(false);
        break;
    case 5:
                jLabel6.setVisible(false);

        break;
    case 6:
        break;
}
       HandScrollListener scrollListener = new HandScrollListener(jLabel);
jScrollPane1.getViewport().addMouseMotionListener(scrollListener);
jScrollPane1.getViewport().addMouseListener(scrollListener);
}
   

   
    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton blue10Button;
    private javax.swing.JLabel blue10label;
    private javax.swing.JButton blue1Button;
    private javax.swing.JLabel blue1label;
    private javax.swing.JButton blue2Button;
    private javax.swing.JLabel blue2label;
    private javax.swing.JButton blue3Button;
    private javax.swing.JLabel blue3label;
    private javax.swing.JButton blue4Button;
    private javax.swing.JLabel blue4label;
    private javax.swing.JButton blue5Button;
    private javax.swing.JLabel blue5label;
    private javax.swing.JButton blue6Button;
    private javax.swing.JLabel blue6label;
    private javax.swing.JButton blue7Button;
    private javax.swing.JLabel blue7label;
    private javax.swing.JButton blue8Button;
    private javax.swing.JLabel blue8label;
    private javax.swing.JButton blue9Button;
    private javax.swing.JLabel blue9label;
    private javax.swing.JButton green10Button;
    private javax.swing.JLabel green10label;
    private javax.swing.JButton green1Button;
    private javax.swing.JLabel green1label;
    private javax.swing.JButton green2Button;
    private javax.swing.JLabel green2label;
    private javax.swing.JButton green3Button;
    private javax.swing.JLabel green3label;
    private javax.swing.JButton green4Button;
    private javax.swing.JLabel green4label;
    private javax.swing.JButton green5Button;
    private javax.swing.JLabel green5label;
    private javax.swing.JButton green6Button;
    private javax.swing.JLabel green6label;
    private javax.swing.JButton green7Button;
    private javax.swing.JLabel green7label;
    private javax.swing.JButton green8Button;
    private javax.swing.JLabel green8label;
    private javax.swing.JButton green9Button;
    private javax.swing.JLabel green9label;
    private javax.swing.JButton healpkmnButton1;
    private javax.swing.JButton healpkmnButton2;
    private javax.swing.JLabel jLabel;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel2;
    public static javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton kartaantipalouButton;
    private javax.swing.JButton red1Button;
    private javax.swing.JLabel red1label;
    private javax.swing.JButton red2Button;
    private javax.swing.JLabel red2label;
    private javax.swing.JButton red3Button;
    private javax.swing.JLabel red3label;
    private javax.swing.JButton red4Button;
    private javax.swing.JLabel red4label;
    private javax.swing.JButton red5Button;
    private javax.swing.JLabel red5label;
    private javax.swing.JButton red6Button;
    private javax.swing.JLabel red6label;
    private javax.swing.JButton red7Button;
    private javax.swing.JLabel red7label;
    private javax.swing.JButton roz10Button;
    private javax.swing.JLabel roz10label;
    private javax.swing.JButton roz1Button;
    private javax.swing.JLabel roz1label;
    private javax.swing.JButton roz2Button;
    private javax.swing.JLabel roz2label;
    private javax.swing.JButton roz3Button;
    private javax.swing.JLabel roz3label;
    private javax.swing.JButton roz4Button;
    private javax.swing.JLabel roz4label;
    private javax.swing.JButton roz5Button;
    private javax.swing.JLabel roz5label;
    private javax.swing.JButton roz6Button;
    private javax.swing.JLabel roz6label;
    private javax.swing.JButton roz7Button;
    private javax.swing.JLabel roz7label;
    private javax.swing.JButton roz8Button;
    private javax.swing.JLabel roz8label;
    private javax.swing.JButton roz9Button;
    private javax.swing.JLabel roz9label;
    private javax.swing.JButton yellowButton;
    // End of variables declaration//GEN-END:variables

   
}
