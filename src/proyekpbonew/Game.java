/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Gary
 */
public class Game extends javax.swing.JFrame {

    /**
     * Creates new form Game
     */
    private ArrayList<Card> playerDeck = new ArrayList<>();
    private ArrayList<Card> dealerDeck = new ArrayList<>();
    private stack<Card> Deck = new stack<>();

    public Game() {
        initComponents();
        this.setSize(1920, 1080);
        this.getBetField().setBounds(925, 262, 350, 30);
        this.getBetLabel().setBounds(750, 250, 350, 50);
        this.getBetConfirm().setBounds(840, 500, 350, 50);
        this.getCurSaldo().setBounds(925, 200, 350, 50);
        this.getSaldoLabel().setBounds(790, 200, 350, 50);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/res/background.jpg")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(1920, 1080, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        BackgroundImage.setIcon(imageIcon);
        BackgroundImage.setBounds(0, 0, 1920, 1080);
        this.setLocationRelativeTo(null);
        this.dealerCard1.setVisible(false);
        this.dealerCard2.setVisible(false);
        this.dealerCard3.setVisible(false);
        this.dealerCard4.setVisible(false);
        this.dealerCard5.setVisible(false);
        this.dealerCard6.setVisible(false);
        this.playerCard1.setVisible(false);
        this.playerCard2.setVisible(false);
        this.playerCard3.setVisible(false);
        this.playerCard4.setVisible(false);
        this.playerCard5.setVisible(false);
        this.playerCard6.setVisible(false);
        this.COVERDEALER.setVisible(false);
        this.getHitBtn().setVisible(false);
        this.getStandBtn().setVisible(false);
        this.playerVal.setVisible(false);
        this.dealerVal.setVisible(false);
    }

    public JLabel getSaldoLabel() {
        return SaldoLabel;
    }

    public JButton getBetConfirm() {
        return BetConfirm;
    }

    public JLabel getCurSaldo() {
        return CurSaldo;
    }

    public JTextField getBetField() {
        return BetField;
    }

    public JLabel getBetLabel() {
        return BetLabel;
    }

    public JLabel getBackgroundImage() {
        return BackgroundImage;
    }

    public void setBackgroundImage(JLabel BackgroundImage) {
        this.BackgroundImage = BackgroundImage;
    }

    public JButton getHitBtn() {
        return HitBtn;
    }

    public void setHitBtn(JButton HitBtn) {
        this.HitBtn = HitBtn;
    }

    public JButton getStandBtn() {
        return StandBtn;
    }

    public void setStandBtn(JButton StandBtn) {
        this.StandBtn = StandBtn;
    }

    private void StartGame() {
        //game
        ProyekPBONew.save();
        this.getBetField().setVisible(false);
        this.getBetLabel().setVisible(false);
        this.getBetConfirm().setVisible(false);
        this.getCurSaldo().setVisible(false);
        this.getSaldoLabel().setVisible(false);
        this.getHitBtn().setVisible(true);
        this.getStandBtn().setVisible(true);
        this.dealerCard1.setVisible(true);
        this.dealerCard2.setVisible(true);
        this.playerCard1.setVisible(true);
        this.playerCard2.setVisible(true);
        this.COVERDEALER.setVisible(true);
        this.playerVal.setVisible(true);
        this.dealerVal.setVisible(true);
        this.playerVal.setBounds(100, 760, 150, 40);
        this.dealerVal.setBounds(100, 50, 150, 40);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(150, 224, java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        COVERDEALER.setIcon(imageIcon);
        dealerCard1.setBounds(100, 100, 150, 224);
        COVERDEALER.setBounds(100, 100, 150, 224);
        dealerCard2.setBounds(300, 100, 150, 224);
        dealerCard3.setBounds(500, 100, 150, 224);
        dealerCard4.setBounds(700, 100, 150, 224);
        dealerCard5.setBounds(900, 100, 150, 224);
        dealerCard6.setBounds(1100, 100, 150, 224);
        playerCard1.setBounds(100, 400, 150, 224);
        playerCard2.setBounds(300, 400, 150, 224);
        playerCard3.setBounds(500, 400, 150, 224);
        playerCard4.setBounds(700, 400, 150, 224);
        playerCard5.setBounds(900, 400, 150, 224);
        playerCard6.setBounds(1100, 400, 150, 224);
        this.getHitBtn().setBounds(750, 750, 150, 40);
        this.getStandBtn().setBounds(1000, 750, 150, 40);

        for (int i = 1; i <= 13; i++) {
            Deck.push(new Clubs(i));
        }
        for (int i = 1; i <= 13; i++) {
            Deck.push(new Spades(i));
        }
        for (int i = 1; i <= 13; i++) {
            Deck.push(new Diamonds(i));
        }
        for (int i = 1; i <= 13; i++) {
            Deck.push(new Hearts(i));
        }
        Collections.shuffle(Deck.getA());
        Collections.shuffle(Deck.getA());
        dealerDeck.add(Deck.pop());
        dealerDeck.add(Deck.pop());
        playerDeck.add(Deck.pop());
        playerDeck.add(Deck.pop());
        playerCard1.setIcon(playerDeck.get(0).getPng());
        playerCard2.setIcon(playerDeck.get(1).getPng());
        dealerCard1.setIcon(dealerDeck.get(0).getPng());
        dealerCard2.setIcon(dealerDeck.get(1).getPng());
        this.playerVal.setText("Player : " + getValue(playerDeck));
        this.dealerVal.setText("Dealer : ?");
        if (getValue(playerDeck) == 21) {
            this.HitBtn.setVisible(false);
            this.StandBtn.setVisible(false);
            this.dealerVal.setText("Dealer : " + getValue(dealerDeck));
            this.COVERDEALER.setVisible(false);
            if (getValue(dealerDeck) == 21) {
                JOptionPane.showMessageDialog(this, "Draw!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.save();
            } else {
                ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() + Integer.parseInt(this.BetField.getText()));
                JOptionPane.showMessageDialog(this, "You Won!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.getLoggedUser().setTotalWin(ProyekPBONew.getLoggedUser().getTotalWin() + Integer.parseInt(this.BetField.getText()));
                ProyekPBONew.save();
            }
        }
        if (getValue(dealerDeck) == 21) {
            this.HitBtn.setVisible(false);
            this.StandBtn.setVisible(false);
            this.dealerVal.setText("Dealer : " + getValue(dealerDeck));
            this.COVERDEALER.setVisible(false);
            if (getValue(playerDeck) == 21) {
                JOptionPane.showMessageDialog(this, "Draw!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.save();

            } else {
                ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() - Integer.parseInt(this.BetField.getText()));
                JOptionPane.showMessageDialog(this, "You Lost!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.save();
            }
        }
    }

    public int getValue(ArrayList<Card> deck) {
        int total = 0;
        int asCtr = 0;
        for (int i = 0; i < deck.size(); i++) {
            if (deck.get(i).getValue() == 1) {
                asCtr++;
                total += 11;
            } else if (deck.get(i).getValue() > 10) {
                total += 10;
            } else {
                total += deck.get(i).getValue();
            }
        }
        if (total > 21) {
            total -= asCtr * 10;
        }
        return total;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BetLabel = new javax.swing.JLabel();
        BetField = new javax.swing.JTextField();
        BetConfirm = new javax.swing.JButton();
        CurSaldo = new javax.swing.JLabel();
        SaldoLabel = new javax.swing.JLabel();
        COVERDEALER = new javax.swing.JLabel();
        dealerCard1 = new javax.swing.JLabel();
        dealerCard2 = new javax.swing.JLabel();
        playerCard1 = new javax.swing.JLabel();
        playerCard2 = new javax.swing.JLabel();
        HitBtn = new javax.swing.JButton();
        StandBtn = new javax.swing.JButton();
        playerCard3 = new javax.swing.JLabel();
        playerVal = new javax.swing.JLabel();
        dealerVal = new javax.swing.JLabel();
        playerCard4 = new javax.swing.JLabel();
        playerCard5 = new javax.swing.JLabel();
        playerCard6 = new javax.swing.JLabel();
        dealerCard3 = new javax.swing.JLabel();
        dealerCard4 = new javax.swing.JLabel();
        dealerCard5 = new javax.swing.JLabel();
        dealerCard6 = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        BetLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        BetLabel.setForeground(java.awt.Color.lightGray);
        BetLabel.setText("Input Bet :");
        getContentPane().add(BetLabel);
        BetLabel.setBounds(93, 107, 65, 32);

        BetField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        BetField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetFieldActionPerformed(evt);
            }
        });
        getContentPane().add(BetField);
        BetField.setBounds(180, 110, 103, 20);

        BetConfirm.setText("OK");
        BetConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BetConfirmActionPerformed(evt);
            }
        });
        getContentPane().add(BetConfirm);
        BetConfirm.setBounds(140, 150, 72, 22);

        CurSaldo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        CurSaldo.setForeground(java.awt.Color.lightGray);
        getContentPane().add(CurSaldo);
        CurSaldo.setBounds(140, 80, 37, 0);

        SaldoLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        SaldoLabel.setForeground(java.awt.Color.lightGray);
        SaldoLabel.setText("Saldo :");
        getContentPane().add(SaldoLabel);
        SaldoLabel.setBounds(90, 80, 37, 32);

        COVERDEALER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        COVERDEALER.setText("tes");
        getContentPane().add(COVERDEALER);
        COVERDEALER.setBounds(670, 390, 110, 90);

        dealerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard1.setText("tes");
        getContentPane().add(dealerCard1);
        dealerCard1.setBounds(10, 360, 110, 90);

        dealerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard2.setText("tes");
        getContentPane().add(dealerCard2);
        dealerCard2.setBounds(140, 360, 110, 90);

        playerCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        playerCard1.setText("tes");
        getContentPane().add(playerCard1);
        playerCard1.setBounds(10, 530, 110, 90);

        playerCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        playerCard2.setText("tes");
        getContentPane().add(playerCard2);
        playerCard2.setBounds(160, 530, 110, 90);

        HitBtn.setText("Hit");
        HitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(HitBtn);
        HitBtn.setBounds(480, 420, 75, 22);

        StandBtn.setText("Stand");
        StandBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StandBtnActionPerformed(evt);
            }
        });
        getContentPane().add(StandBtn);
        StandBtn.setBounds(590, 420, 72, 22);
        getContentPane().add(playerCard3);
        playerCard3.setBounds(350, 450, 0, 0);

        playerVal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerVal.setForeground(java.awt.Color.lightGray);
        playerVal.setText("Player : ");
        getContentPane().add(playerVal);
        playerVal.setBounds(570, 30, 140, 16);

        dealerVal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dealerVal.setForeground(java.awt.Color.lightGray);
        dealerVal.setText("Dealer :");
        getContentPane().add(dealerVal);
        dealerVal.setBounds(570, 80, 140, 16);

        playerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        playerCard4.setText("tes");
        getContentPane().add(playerCard4);
        playerCard4.setBounds(280, 530, 110, 90);

        playerCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        playerCard5.setText("tes");
        getContentPane().add(playerCard5);
        playerCard5.setBounds(400, 530, 110, 90);

        playerCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        playerCard6.setText("tes");
        getContentPane().add(playerCard6);
        playerCard6.setBounds(530, 530, 110, 90);

        dealerCard3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard3.setText("tes");
        getContentPane().add(dealerCard3);
        dealerCard3.setBounds(260, 360, 110, 90);

        dealerCard4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard4.setText("tes");
        getContentPane().add(dealerCard4);
        dealerCard4.setBounds(380, 360, 110, 90);

        dealerCard5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard5.setText("tes");
        getContentPane().add(dealerCard5);
        dealerCard5.setBounds(490, 360, 110, 90);

        dealerCard6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Back Covers/Pomegranate.png"))); // NOI18N
        dealerCard6.setText("tes");
        getContentPane().add(dealerCard6);
        dealerCard6.setBounds(590, 360, 110, 90);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 630, 430);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BetConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetConfirmActionPerformed
        // TODO add your handling code here
        ProyekPBONew.clickSound();
        if (ProyekPBONew.getLoggedUser().getSaldo() >= Integer.parseInt(BetField.getText())) {
            StartGame();
        } else {
            JOptionPane.showMessageDialog(this, "Invalid Input", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_BetConfirmActionPerformed

    private void BetFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BetFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BetFieldActionPerformed

    private void HitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HitBtnActionPerformed
        // TODO add your handling code here:
        ProyekPBONew.clickSound();

        playerDeck.add(Deck.pop());
        int ctr = playerDeck.size();
        if (ctr == 3) {
            playerCard3.setIcon(playerDeck.get(2).getPng());
            playerCard3.setVisible(true);
        } else if (ctr == 4) {
            playerCard4.setIcon(playerDeck.get(3).getPng());
            playerCard4.setVisible(true);
        } else if (ctr == 5) {
            playerCard5.setIcon(playerDeck.get(4).getPng());
            playerCard5.setVisible(true);
        } else if (ctr == 6) {
            playerCard6.setIcon(playerDeck.get(5).getPng());
            playerCard6.setVisible(true);
        }
        this.playerVal.setText("Player : " + getValue(playerDeck));

        if (getValue(playerDeck) > 21) {
            ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() - Integer.parseInt(this.BetField.getText()));
            JOptionPane.showMessageDialog(this, "You Lost", "Game", JOptionPane.PLAIN_MESSAGE);
            ProyekPBONew.setFrameGame(new Game());
            this.setVisible(false);
            ProyekPBONew.getFrameUser().setVisible(true);
            ProyekPBONew.save();
        }
    }//GEN-LAST:event_HitBtnActionPerformed

    private void StandBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StandBtnActionPerformed
        // TODO add your handling code here:
        ProyekPBONew.clickSound();

        COVERDEALER.setVisible(false);
        this.HitBtn.setVisible(false);
        this.dealerVal.setText("Dealer : " + getValue(dealerDeck));
        while (getValue(dealerDeck) < 19) {
            DealerHit();
        }
        if (getValue(dealerDeck) > 21) {
            ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() + Integer.parseInt(this.BetField.getText()));
            JOptionPane.showMessageDialog(this, "You Won!", "Game", JOptionPane.PLAIN_MESSAGE);
            ProyekPBONew.setFrameGame(new Game());
            this.setVisible(false);
            ProyekPBONew.getFrameUser().setVisible(true);
            ProyekPBONew.getLoggedUser().setTotalWin(ProyekPBONew.getLoggedUser().getTotalWin() + Integer.parseInt(this.BetField.getText()));
            ProyekPBONew.save();
        } else {
            if (getValue(playerDeck) > getValue(dealerDeck)) {
                ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() + Integer.parseInt(this.BetField.getText()));
                JOptionPane.showMessageDialog(this, "You Won!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.getLoggedUser().setTotalWin(ProyekPBONew.getLoggedUser().getTotalWin() + Integer.parseInt(this.BetField.getText()));
                ProyekPBONew.save();
            } else if (getValue(playerDeck) < getValue(dealerDeck)) {
                ProyekPBONew.getLoggedUser().setSaldo(ProyekPBONew.getLoggedUser().getSaldo() - Integer.parseInt(this.BetField.getText()));
                ProyekPBONew.save();
                JOptionPane.showMessageDialog(this, "You Lost!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.save();
            } else {
                JOptionPane.showMessageDialog(this, "Draw!", "Game", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.setFrameGame(new Game());
                this.setVisible(false);
                ProyekPBONew.getFrameUser().setVisible(true);
                ProyekPBONew.save();
            }
        }

    }//GEN-LAST:event_StandBtnActionPerformed

    private void DealerHit() {

        dealerDeck.add(Deck.pop());
        int ctr = dealerDeck.size();
        if (ctr == 3) {
            dealerCard3.setIcon(dealerDeck.get(2).getPng());
            dealerCard3.setVisible(true);
        } else if (ctr == 4) {
            dealerCard4.setIcon(dealerDeck.get(3).getPng());
            dealerCard4.setVisible(true);
        } else if (ctr == 5) {
            dealerCard5.setIcon(dealerDeck.get(4).getPng());
            dealerCard5.setVisible(true);
        } else if (ctr == 6) {
            dealerCard6.setIcon(dealerDeck.get(5).getPng());
            dealerCard6.setVisible(true);
        }
        this.dealerVal.setText("Dealer : " + getValue(dealerDeck));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JButton BetConfirm;
    private javax.swing.JTextField BetField;
    private javax.swing.JLabel BetLabel;
    private javax.swing.JLabel COVERDEALER;
    private javax.swing.JLabel CurSaldo;
    private javax.swing.JButton HitBtn;
    private javax.swing.JLabel SaldoLabel;
    private javax.swing.JButton StandBtn;
    private javax.swing.JLabel dealerCard1;
    private javax.swing.JLabel dealerCard2;
    private javax.swing.JLabel dealerCard3;
    private javax.swing.JLabel dealerCard4;
    private javax.swing.JLabel dealerCard5;
    private javax.swing.JLabel dealerCard6;
    private javax.swing.JLabel dealerVal;
    private javax.swing.JLabel playerCard1;
    private javax.swing.JLabel playerCard2;
    private javax.swing.JLabel playerCard3;
    private javax.swing.JLabel playerCard4;
    private javax.swing.JLabel playerCard5;
    private javax.swing.JLabel playerCard6;
    private javax.swing.JLabel playerVal;
    // End of variables declaration//GEN-END:variables
}
