/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Gary
 */
public class Register extends javax.swing.JFrame {

    /**
     * Creates new form Register
     */
    public Register() {
        initComponents();
        this.setTitle("Register Page");
        this.setResizable(false);
        //set width, height frame login
        this.setSize(1100, 700);

        //set width, height background image login frame
        this.getBackgroundImage().setSize(1100, 700);

        //set x, y, width, height textfield
        this.getUsernameField().setBounds(450, 100, 150, 50);
        this.getPasswordField().setBounds(450, 200, 150, 50);
        this.getConfirmPassword().setBounds(450, 300, 150, 50);

        //set x, y, width, height button
        this.getRegisterBtn().setBounds(450, 400, 150, 50);
        this.getBackButton().setBounds(450, 500, 150, 50);

        //set x,y, tulisan username,password
        this.getLabelUsername().setBounds(340, 100, 150, 50);
        this.getLabelPassword().setBounds(345, 200, 150, 50);
        this.getLabelConfirm().setBounds(273, 300, 175, 50);
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

        registerBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        labelConfirm = new javax.swing.JLabel();
        confirmPassword = new javax.swing.JPasswordField();
        backButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        registerBtn.setText("Register");
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });
        getContentPane().add(registerBtn);
        registerBtn.setBounds(157, 209, 75, 25);
        getContentPane().add(passwordField);
        passwordField.setBounds(192, 121, 132, 22);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(192, 81, 132, 22);

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsername.setForeground(java.awt.Color.lightGray);
        labelUsername.setText("Username :");
        getContentPane().add(labelUsername);
        labelUsername.setBounds(83, 84, 76, 25);

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPassword.setForeground(java.awt.Color.lightGray);
        labelPassword.setText("Password : ");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(83, 124, 70, 25);

        labelConfirm.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelConfirm.setForeground(java.awt.Color.lightGray);
        labelConfirm.setText("Confirm Password :");
        getContentPane().add(labelConfirm);
        labelConfirm.setBounds(83, 161, 163, 22);

        confirmPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(confirmPassword);
        confirmPassword.setBounds(189, 161, 135, 22);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(157, 241, 73, 25);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        // TODO add your handling code here:
        String uname = this.usernameField.getText();
        String pass = this.passwordField.getText();
        String conpass = this.confirmPassword.getText();
        boolean usernameKembar = false;

        for (int i = 0; i < ProyekPBONew.getUserList().size(); i++) {
            if (uname.equals(ProyekPBONew.getUserList().get(i).getUsername())) {
                usernameKembar = true;
                break;
            }
        }
        if (!usernameKembar) {
            if (pass.equals("") || uname.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid input", "Warning", JOptionPane.WARNING_MESSAGE);
            } else if (!pass.equals(conpass)) {
                JOptionPane.showMessageDialog(this, "Confirm password doesn't match!", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                ProyekPBONew.getUserList().add(new User(uname, pass));
                this.setVisible(false);
                JOptionPane.showMessageDialog(this, "Succesfully registered", "Success", JOptionPane.PLAIN_MESSAGE);

                ProyekPBONew.getLogframe().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Username already exists", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked

    }//GEN-LAST:event_registerBtnMouseClicked

    private void confirmPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmPasswordActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed

        ProyekPBONew.getLogframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    public JPasswordField getjPasswordField1() {
        return confirmPassword;
    }

    public void setjPasswordField1(JPasswordField jPasswordField1) {
        this.confirmPassword = jPasswordField1;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(JPasswordField passwordField) {
        this.passwordField = passwordField;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public void setUsernameField(JTextField usernameField) {
        this.usernameField = usernameField;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    public JPasswordField getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(JPasswordField confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public JButton getRegisterBtn() {
        return registerBtn;
    }

    public void setRegisterBtn(JButton registerBtn) {
        this.registerBtn = registerBtn;
    }

    public JLabel getLabelConfirm() {
        return labelConfirm;
    }

    public void setLabelConfirm(JLabel labelConfirm) {
        this.labelConfirm = labelConfirm;
    }

    public JLabel getLabelPassword() {
        return labelPassword;
    }

    public void setLabelPassword(JLabel labelPassword) {
        this.labelPassword = labelPassword;
    }

    public JLabel getLabelUsername() {
        return labelUsername;
    }

    public void setLabelUsername(JLabel labelUsername) {
        this.labelUsername = labelUsername;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel labelConfirm;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
