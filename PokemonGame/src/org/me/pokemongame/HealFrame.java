/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.me.pokemongame;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.Random;
import javax.swing.JOptionPane;
import static org.me.pokemongame.PlayerFrame.Cardcombobox1;
import static org.me.pokemongame.PlayerFrame.Cardcombobox2;
import static org.me.pokemongame.PlayerFrame.Cardcombobox3;
import static org.me.pokemongame.PlayerFrame.Cardcombobox4;
import static org.me.pokemongame.PlayerFrame.Cardcombobox5;
import static org.me.pokemongame.PlayerFrame.Cardcombobox6;
import static org.me.pokemongame.PlayerFrame.caughtPokemon1;
import static org.me.pokemongame.PlayerFrame.numberOfPlayers;
import static org.me.pokemongame.PlayerFrame.objectCard1;
import static org.me.pokemongame.PlayerFrame.objectCard2;
import static org.me.pokemongame.PlayerFrame.objectCard3;
import static org.me.pokemongame.PlayerFrame.objectCard4;
import static org.me.pokemongame.PlayerFrame.objectCard5;
import static org.me.pokemongame.PlayerFrame.objectCard6;
import static org.me.pokemongame.PokemonTapaFrame.p;

/**
 *
 * @author nikos
 */
public class HealFrame extends javax.swing.JFrame {
private int numberOfPlayer;
    /**
     * Creates new form HealFrame
     */
    public HealFrame() {
        
        initComponents();
        myinitComponents();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        p1 = new javax.swing.JRadioButton();
        p4 = new javax.swing.JRadioButton();
        p5 = new javax.swing.JRadioButton();
        p2 = new javax.swing.JRadioButton();
        p3 = new javax.swing.JRadioButton();
        p6 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new java.awt.GridBagLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Choose your Player:");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(260, 10, 320, 50);

        buttonGroup1.add(p1);
        p1.setText("p1");
        p1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p1ActionPerformed(evt);
            }
        });
        jPanel2.add(p1);
        p1.setBounds(270, 70, 60, 23);

        buttonGroup1.add(p4);
        p4.setText("p4");
        p4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p4ActionPerformed(evt);
            }
        });
        jPanel2.add(p4);
        p4.setBounds(270, 110, 60, 23);

        buttonGroup1.add(p5);
        p5.setText("p5");
        p5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p5ActionPerformed(evt);
            }
        });
        jPanel2.add(p5);
        p5.setBounds(340, 110, 60, 23);

        buttonGroup1.add(p2);
        p2.setText("p2");
        p2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p2ActionPerformed(evt);
            }
        });
        jPanel2.add(p2);
        p2.setBounds(340, 70, 60, 23);

        buttonGroup1.add(p3);
        p3.setText("p3");
        p3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p3ActionPerformed(evt);
            }
        });
        jPanel2.add(p3);
        p3.setBounds(410, 70, 60, 23);

        buttonGroup1.add(p6);
        p6.setText("p6");
        p6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p6ActionPerformed(evt);
            }
        });
        jPanel2.add(p6);
        p6.setBounds(410, 110, 60, 23);

        jButton1.setText("Heal one Pokemon");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(270, 220, 200, 23);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(jComboBox1);
        jComboBox1.setBounds(270, 170, 200, 20);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/dice.svg.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(270, 300, 50, 50);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Roll to heal all");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(270, 260, 110, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel4);
        jLabel4.setBounds(330, 300, 60, 50);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("OR");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(280, 250, 130, 20);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jPanel2, gridBagConstraints);
        jPanel2.getAccessibleContext().setAccessibleName("");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/me/pokemongame/1632041-joy.jpg"))); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jLabel1, gridBagConstraints);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void p2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p2ActionPerformed
numberOfPlayer=2;
        jComboBox1.removeAllItems();
        for(int j=0; j<PlayerFrame.caughtPokemon2.size(); j++){
            if(!PlayerFrame.caughtPokemon2.get(j).isAlive())
            jComboBox1.addItem(PlayerFrame.caughtPokemon2.get(j).getName());
            }    }//GEN-LAST:event_p2ActionPerformed

    private void p3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p3ActionPerformed

        numberOfPlayer=3;
jComboBox1.removeAllItems();
        for(int j=0; j<PlayerFrame.caughtPokemon3.size(); j++){
            if(!PlayerFrame.caughtPokemon3.get(j).isAlive())
            jComboBox1.addItem(PlayerFrame.caughtPokemon3.get(j).getName());
            }    }//GEN-LAST:event_p3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
Random diceRoller = new Random();
       int roll = diceRoller.nextInt(6) + 1;

 String zaria = Integer.toString(roll);
 jLabel4.setText(zaria);
 
 boolean timeFlag=false;
 
 for(int i=0; i< PlayerFrame.objectCard1.size(); i++){
    if( PlayerFrame.objectCard1.get(i).getName()=="TimeMachine"){        
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 1 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
     PlayerFrame.objectCard1.remove(i);
     PlayerFrame.Cardcombobox1.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }

for(int i=0; i< PlayerFrame.objectCard2.size(); i++){
    if( PlayerFrame.objectCard2.get(i).getName()=="TimeMachine"){
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 2 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
    PlayerFrame.objectCard2.remove(i);
     PlayerFrame.Cardcombobox2.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }
if( PlayerFrame.numberOfPlayers>=3){
for(int i=0; i< PlayerFrame.objectCard3.size(); i++){
    if( PlayerFrame.objectCard3.get(i).getName()=="TimeMachine"){
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 3 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
     PlayerFrame.objectCard3.remove(i);
     PlayerFrame.Cardcombobox3.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }}

if( PlayerFrame.numberOfPlayers>=4){
for(int i=0; i< PlayerFrame.objectCard4.size(); i++){
    if( PlayerFrame.objectCard4.get(i).getName()=="TimeMachine"){
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 4 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
     PlayerFrame.objectCard4.remove(i);
     PlayerFrame.Cardcombobox4.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }}

if( PlayerFrame.numberOfPlayers>=5){
for(int i=0; i< PlayerFrame.objectCard5.size(); i++){
    if( PlayerFrame.objectCard5.get(i).getName()=="TimeMachine"){
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 5 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
     PlayerFrame.objectCard5.remove(i);
     PlayerFrame.Cardcombobox5.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }}

if( PlayerFrame.numberOfPlayers>=6){
for(int i=0; i< PlayerFrame.objectCard6.size(); i++){
    if( PlayerFrame.objectCard6.get(i).getName()=="TimeMachine"){
        int dialogResult = JOptionPane.showConfirmDialog(this, "Will Player 6 use his TimeMachine Card??");
if(dialogResult == JOptionPane.YES_OPTION){
    timeFlag=true;
    PlayerFrame.objectCard6.remove(i);
     PlayerFrame.Cardcombobox6.removeItem("TimeMachine");
    JOptionPane.showMessageDialog(rootPane, "TimeMachine card has been used. Please roll again!", null, WIDTH);
}
       
}
    }}

 
 
 
 
 if(!timeFlag){
 if(roll==1|| roll==6){
     switch(numberOfPlayer){
         case 1:for(int i=0; i<PlayerFrame.caughtPokemon1.size(); i++)
                PlayerFrame.caughtPokemon1.get(i).setAlive(true);
             break;
             case 2:for(int i=0; i<PlayerFrame.caughtPokemon2.size(); i++)
                PlayerFrame.caughtPokemon2.get(i).setAlive(true);
             break;
                 case 3:for(int i=0; i<PlayerFrame.caughtPokemon3.size(); i++)
                PlayerFrame.caughtPokemon3.get(i).setAlive(true);
             break;
                     case 4:for(int i=0; i<PlayerFrame.caughtPokemon4.size(); i++)
                PlayerFrame.caughtPokemon4.get(i).setAlive(true);
             break;
                         case 5:for(int i=0; i<PlayerFrame.caughtPokemon5.size(); i++)
                PlayerFrame.caughtPokemon5.get(i).setAlive(true);
             break;
                             case 6:for(int i=0; i<PlayerFrame.caughtPokemon6.size(); i++)
                PlayerFrame.caughtPokemon6.get(i).setAlive(true);
             break;
                             
     }
                                                     JOptionPane.showMessageDialog(rootPane, "All your Pokemon are healed!", ":D ", WIDTH);
                                                     dispose();

     
 }
 else{
                                                          JOptionPane.showMessageDialog(rootPane, "You have failed!", ":( ", WIDTH);
                                                     dispose();

 }
 }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void p1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p1ActionPerformed
jComboBox1.removeAllItems();
numberOfPlayer=1;
        for(int j=0; j<PlayerFrame.caughtPokemon1.size(); j++){
            if(!PlayerFrame.caughtPokemon1.get(j).isAlive())

               jComboBox1.addItem(PlayerFrame.caughtPokemon1.get(j).getName());
            }    }//GEN-LAST:event_p1ActionPerformed

    private void p4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p4ActionPerformed

        numberOfPlayer=4;
jComboBox1.removeAllItems();
        for(int j=0; j<PlayerFrame.caughtPokemon4.size(); j++){
            if(!PlayerFrame.caughtPokemon4.get(j).isAlive())
            jComboBox1.addItem(PlayerFrame.caughtPokemon4.get(j).getName());
            }    }//GEN-LAST:event_p4ActionPerformed

    private void p5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p5ActionPerformed

        numberOfPlayer=5;
jComboBox1.removeAllItems();
        for(int j=0; j<PlayerFrame.caughtPokemon5.size(); j++){
            if(!PlayerFrame.caughtPokemon5.get(j).isAlive())
            jComboBox1.addItem(PlayerFrame.caughtPokemon5.get(j).getName());
            }    }//GEN-LAST:event_p5ActionPerformed

    private void p6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p6ActionPerformed

        numberOfPlayer=6;
jComboBox1.removeAllItems();
        for(int j=0; j<PlayerFrame.caughtPokemon6.size(); j++){
            if(!PlayerFrame.caughtPokemon6.get(j).isAlive())
            jComboBox1.addItem(PlayerFrame.caughtPokemon6.get(j).getName());
            }    }//GEN-LAST:event_p6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(numberOfPlayer==1){
    
            for(int i=0; i<PlayerFrame.caughtPokemon1.size(); i++){
                if(PlayerFrame.caughtPokemon1.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon1.get(i).setAlive(true);
            }
        }
        }
        else if(numberOfPlayer==2){
            for(int i=0; i<PlayerFrame.caughtPokemon2.size(); i++){
                if(PlayerFrame.caughtPokemon2.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon2.get(i).setAlive(true);
            }
        }}
            
         else if(numberOfPlayer==3){
            for(int i=0; i<PlayerFrame.caughtPokemon3.size(); i++){
               if(PlayerFrame.caughtPokemon3.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon3.get(i).setAlive(true);
            }
        }}
         else if(numberOfPlayer==4){
            for(int i=0; i<PlayerFrame.caughtPokemon4.size(); i++){
                if(PlayerFrame.caughtPokemon4.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon4.get(i).setAlive(true);
            }
            }
    }
         else if(numberOfPlayer==5){
            for(int i=0; i<PlayerFrame.caughtPokemon5.size(); i++){
                if(PlayerFrame.caughtPokemon5.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon5.get(i).setAlive(true);
            }
        
    }}
         else if(numberOfPlayer==6){
            for(int i=0; i<PlayerFrame.caughtPokemon6.size(); i++){
                if(PlayerFrame.caughtPokemon6.get(i).getName()==jComboBox1.getSelectedItem()){
                    PlayerFrame.caughtPokemon6.get(i).setAlive(true);
            }
                 
    }}
                                                             JOptionPane.showMessageDialog(rootPane, "Your "+jComboBox1.getSelectedItem()+" is healed!", ":D ", WIDTH);

        dispose();
         }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton p1;
    private javax.swing.JRadioButton p2;
    private javax.swing.JRadioButton p3;
    private javax.swing.JRadioButton p4;
    private javax.swing.JRadioButton p5;
    private javax.swing.JRadioButton p6;
    // End of variables declaration//GEN-END:variables

    private void myinitComponents() {
        
        jComboBox1.removeAllItems();
        
        switch(PlayerFrame.numberOfPlayers){
            case 2:  p3.setVisible(false);
                p4.setVisible(false);
                p5.setVisible(false);
                p6.setVisible(false);
                
                
                
                break;
        
        case 3: p4.setVisible(false);p5.setVisible(false);
                p6.setVisible(false);
                

                break;
        case 4: p5.setVisible(false);p6.setVisible(false);

                break;
        case 5: p6.setVisible(false);
        

                break;
        default:
                break;
    }
        
        
    }
}
