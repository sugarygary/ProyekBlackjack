/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

/**
 *
 * @author Inghwe
 */
public class FrameAdmin extends javax.swing.JFrame {

    /**
     * Creates new form FrameAdmin
     */
    public FrameAdmin() {
        initComponents();
        this.setTitle("Menu Admin");

        //set width, height frame admin
        this.setSize(1100, 700);

        //set width, height background image frame admin
        this.getBackgroundImage().setSize(1100, 700);

        //set button frame admin
        this.getTopUpBtn().setBounds(450, 100, 150, 50);
        this.getCloseAccBtn().setBounds(450, 200, 150, 50);
        this.getLogoutBtn().setBounds(450, 300, 150, 50);
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

        jLabel1 = new javax.swing.JLabel();
        TopUpBtn = new javax.swing.JToggleButton();
        CloseAccBtn = new javax.swing.JToggleButton();
        logoutBtn = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Welcome, Admin!");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(157, 56, 94, 37);

        TopUpBtn.setText("Top-Up Saldo");
        TopUpBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TopUpBtnActionPerformed(evt);
            }
        });
        getContentPane().add(TopUpBtn);
        TopUpBtn.setBounds(124, 100, 162, 37);

        CloseAccBtn.setText("Tutup Akun");
        CloseAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CloseAccBtnActionPerformed(evt);
            }
        });
        getContentPane().add(CloseAccBtn);
        CloseAccBtn.setBounds(124, 150, 162, 44);

        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn);
        logoutBtn.setBounds(124, 207, 162, 46);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TopUpBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TopUpBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProyekPBONew.getFrameTopUp().setVisible(true);
    }//GEN-LAST:event_TopUpBtnActionPerformed

    private void CloseAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CloseAccBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProyekPBONew.getFrameClose().setVisible(true);

    }//GEN-LAST:event_CloseAccBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed

        this.setVisible(false);
        ProyekPBONew.getLogframe().setVisible(true);
    }//GEN-LAST:event_logoutBtnActionPerformed

    public JToggleButton getCloseAccBtn() {
        return CloseAccBtn;
    }

    public JToggleButton getTopUpBtn() {
        return TopUpBtn;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public JButton getLogoutBtn() {
        return logoutBtn;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton CloseAccBtn;
    private javax.swing.JToggleButton TopUpBtn;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
