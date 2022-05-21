/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

/**
 *
 * @author Gary
 */
public class TopUp extends javax.swing.JFrame {

    /**
     * Creates new form TopUp
     */
    public TopUp() {
        initComponents();
        this.setTitle("Close Account");

        //set width, height frame top up
        this.setSize(1100, 700);
        this.getTitleTU().setBounds(390, 70, 300, 50);
        
        //set width, height background image top up frame
        this.getBackgroundImage().setSize(1100, 700);

        //set text field frame top up
        this.getUsernameField().setBounds(450, 200, 150, 50);
        this.getTopUpValue().setBounds(450, 300, 150, 50);

        //set button frame top up
        this.getConfBtn().setBounds(450, 400, 150, 50);
        this.getBackBtn().setBounds(450, 500, 150, 50);
        this.setLocationRelativeTo(null);
        
        //set x, y user saldo
        this.getUserTU().setBounds(340, 200, 150, 50);
        this.getSaldoTU().setBounds(380, 300, 150, 50);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ConfBtn = new javax.swing.JToggleButton();
        BackBtn = new javax.swing.JButton();
        usernameField = new javax.swing.JTextField();
        UserTU = new javax.swing.JLabel();
        TitleTU = new javax.swing.JLabel();
        SaldoTU = new javax.swing.JLabel();
        topUpValue = new javax.swing.JTextField();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        ConfBtn.setText("Confirm");
        ConfBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfBtnActionPerformed(evt);
            }
        });
        getContentPane().add(ConfBtn);
        ConfBtn.setBounds(137, 176, 111, 30);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(137, 224, 111, 30);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(118, 104, 160, 22);

        UserTU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserTU.setForeground(java.awt.Color.lightGray);
        UserTU.setText("Username :");
        getContentPane().add(UserTU);
        UserTU.setBounds(47, 103, 66, 25);

        TitleTU.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TitleTU.setForeground(java.awt.Color.lightGray);
        TitleTU.setText("Top Up Account");
        getContentPane().add(TitleTU);
        TitleTU.setBounds(155, 35, 272, 26);

        SaldoTU.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        SaldoTU.setForeground(java.awt.Color.lightGray);
        SaldoTU.setText("Saldo :");
        getContentPane().add(SaldoTU);
        SaldoTU.setBounds(47, 149, 58, 25);
        getContentPane().add(topUpValue);
        topUpValue.setBounds(117, 146, 161, 22);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConfBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfBtnActionPerformed
        // TODO add your handling code here:
        String username = this.getUsernameField().getText();
        boolean checkUser = false;
        int tempTopUp = 0;
        int i;
        for (i = 0; i < ProyekPBONew.getUserList().size(); i++) {
            if (username.equals(ProyekPBONew.getUserList().get(i).getUsername())) {
                tempTopUp = i;
                checkUser = true;
            }
        }
        if (username.equals("") || topUpValue.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Invalid Input", "Warning", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                Integer.parseInt(topUpValue.getText());
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Invalid Input", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            if (checkUser) {
                ProyekPBONew.getUserList().get(tempTopUp).setSaldo(ProyekPBONew.getUserList().get(tempTopUp).getSaldo() + Integer.parseInt(this.topUpValue.getText()));
                JOptionPane.showMessageDialog(this, "Top Up Success!", "Success", JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "User not found!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_ConfBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        FrameAdmin frameAdmin = new FrameAdmin();
        frameAdmin.setVisible(true);
        frameAdmin.setLocationRelativeTo(null);
        frameAdmin.setTitle("Menu Admin");
    }//GEN-LAST:event_BackBtnActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JButton getBackBtn() {
        return BackBtn;
    }

    public void setBackBtn(JButton BackBtn) {
        this.BackBtn = BackBtn;
    }

    public JToggleButton getConfBtn() {
        return ConfBtn;
    }

    public void setConfBtn(JToggleButton ConfBtn) {
        this.ConfBtn = ConfBtn;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public JTextField getTopUpValue() {
        return topUpValue;
    }

    public void setTopUpValue(JTextField topUpValue) {
        this.topUpValue = topUpValue;
    }

    public JLabel getSaldoTU() {
        return SaldoTU;
    }

    public void setSaldoTU(JLabel SaldoTU) {
        this.SaldoTU = SaldoTU;
    }

    public JLabel getTitleTU() {
        return TitleTU;
    }

    public void setTitleTU(JLabel TitleTU) {
        this.TitleTU = TitleTU;
    }

    public JLabel getUserTU() {
        return UserTU;
    }

    public void setUserTU(JLabel UserTU) {
        this.UserTU = UserTU;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JToggleButton ConfBtn;
    private javax.swing.JLabel SaldoTU;
    private javax.swing.JLabel TitleTU;
    private javax.swing.JLabel UserTU;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTextField topUpValue;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
