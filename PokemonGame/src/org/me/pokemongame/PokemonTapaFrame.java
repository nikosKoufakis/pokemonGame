/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.pokemongame;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author 
 */
public class PokemonTapaFrame extends javax.swing.JFrame {
   
    private String color;
     public static Pokemon p=null;
     public static boolean a;
     public static ArrayList<Pokemon> toBeCaught= new ArrayList<Pokemon>();
    /**
     * Creates new form PokemonTapaFrame
     */
    public PokemonTapaFrame(String acolor) {
        
        this.color=acolor;
        initComponents();
        myinitComponents(color);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(550, 650));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(550, 650));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    
    private void myinitComponents(String color) {
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
       
        Random r=new Random();
        int index=0;
        
        ImageIcon icon=null;
      
        
        
        switch (color) {
            case "pink":  
        
         index = r.nextInt(Pokemon.pinkArray.size());
         p = Pokemon.pinkArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
        toBeCaught.add(p);
        Pokemon.pinkArray.remove(p);
        this.setTitle(p.getName());

           
                     break;
                
            case "green":   
                
        index = r.nextInt(Pokemon.greenArray.size());
         p = Pokemon.greenArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
                toBeCaught.add(p);

        Pokemon.greenArray.remove(p);
        this.setTitle(p.getName());

                     break;
                
        case "blue":  
            
        index = r.nextInt(Pokemon.blueArray.size());
         p = Pokemon.blueArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
                toBeCaught.add(p);

        Pokemon.blueArray.remove(p);
        this.setTitle(p.getName());
        
                     break;
                
            case "red":  
                
        index = r.nextInt(Pokemon.redArray.size());
         p = Pokemon.redArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
                toBeCaught.add(p);

        Pokemon.redArray.remove(p);
        this.setTitle(p.getName());
        
                     break;
                
            case "yellow":  
                
        index = r.nextInt(Pokemon.yellowArray.size());
         p = Pokemon.yellowArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
        
        this.setTitle(p.getName());
        
                     break;
                
            case "starter": 
                
        index = r.nextInt(Pokemon.starterArray.size());
         p = Pokemon.starterArray.get(index);
         icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+p.getName()+".png"));
        jLabel1.setIcon(icon);
        Pokemon.starterArray.remove(p);
        this.setTitle(p.getName());
        
                     break;
            default:
                icon = new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/pokemon-tapes/"+color+".png"));
                jLabel1.setIcon(icon);
                this.setTitle(color);
                
                for(int i=0;i<toBeCaught.size();i++)
                {
                if(toBeCaught.get(i).getName()==color)
    p=toBeCaught.get(i);
       
    }
        }
    }

    /**
     * @param args the command line arguments
     */

   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
