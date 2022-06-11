/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Calvin
 */
public class FrameCloseAcc extends javax.swing.JFrame {

    /**
     * Creates new form FrameCloseAcc
     */
    public FrameCloseAcc() {
        initComponents();
        this.setTitle("Close Account");
        this.getTitleCA().setBounds(400, 70, 250, 50);
        //set width, height frame top up
        this.setSize(1100, 700);

        this.getUserCA().setBounds(340, 200, 200, 50);

        //set width, height background image top up frame
        this.getBackgroundImage().setSize(1100, 700);

        //set text field username
        this.getUsernameField().setBounds(450, 215, 150, 25);

        //set button
        this.getConfBtn().setBounds(450, 300, 150, 50);
        this.getBackBtn().setBounds(450, 400, 150, 50);
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TitleCA = new javax.swing.JLabel();
        UserCA = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        ConfBtn = new javax.swing.JToggleButton();
        BackBtn = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        TitleCA.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TitleCA.setForeground(java.awt.Color.lightGray);
        TitleCA.setText("Close Account");
        getContentPane().add(TitleCA);
        TitleCA.setBounds(155, 35, 238, 26);

        UserCA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserCA.setForeground(java.awt.Color.lightGray);
        UserCA.setText("Username :");
        getContentPane().add(UserCA);
        UserCA.setBounds(47, 103, 66, 25);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(118, 104, 160, 22);

        ConfBtn.setText("Confirm");
        ConfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ConfBtn);
        ConfBtn.setBounds(139, 156, 111, 30);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(139, 204, 111, 30);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfBtnActionPerformed
        // TODO add your handling code here:
        ProyekPBONew.clickSound();
        String username = this.getUsernameField().getText();
        boolean checkUser = false;
        int tempDel = 0;
        int i;
        for (i = 0; i < ProyekPBONew.getUserList().size(); i++) {
            if (username.equals(ProyekPBONew.getUserList().get(i).getUsername())) {
                tempDel = i;
                checkUser = true;
            }
        }
        if (username.equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid Input", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            if (checkUser) {
                ProyekPBONew.getUserList().remove(tempDel);
                JOptionPane.showMessageDialog(this, "Account Deleted!", "Success", JOptionPane.PLAIN_MESSAGE);
                ProyekPBONew.save();
            } else {
                JOptionPane.showMessageDialog(this, "User not found!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }

    }//GEN-LAST:event_ConfBtnActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        ProyekPBONew.clickSound();
        this.setVisible(false);
        FrameAdmin frameAdmin = new FrameAdmin();
        frameAdmin.setVisible(true);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.setTitle("Menu Admin");
    }//GEN-LAST:event_BackBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JToggleButton ConfBtn;
    private javax.swing.JLabel TitleCA;
    private javax.swing.JLabel UserCA;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    public JToggleButton getConfBtn() {
        return ConfBtn;
    }

    public void setConfBtn(JToggleButton ConfBtn) {
        this.ConfBtn = ConfBtn;
    }

    public JLabel getTitleCA() {
        return TitleCA;
    }

    public void setTitleCA(JLabel TitleCA) {
        this.TitleCA = TitleCA;
    }

    public JLabel getUserCA() {
        return UserCA;
    }

    public void setUserCA(JLabel UserCA) {
        this.UserCA = UserCA;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JButton getBackBtn() {
        return BackBtn;
    }

    public void setBackBtn(JButton BackBtn) {
        this.BackBtn = BackBtn;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

}
