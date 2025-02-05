/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.accessibility.AccessibleContext;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;

/**
 *
 * @author Gary
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public static void setFrameUser(FrameUser frameUser) {
        frameUser.setLocationRelativeTo(null);
        frameUser.setTitle("Menu User");

        //set width, height frame user
//        frameUser.setSize(1100,700);
//
//        //set width, height background image frame user
//        frameUser.getBackgroundImage().setSize(1100,700);
//
//        frameUser
//        //set x, y, width, height button
//        frameUser.getGameBtn().setBounds(450, 100, 150, 50);
//        frameUser.getMainBtn().setBounds(450, 200, 150, 50);
//        frameUser.getLeaderboardBtn().setBounds(450, 300, 150, 50);
    }

    public Login() {
        initComponents();
        this.setTitle("Login Page");
        this.setResizable(false);

        //set width, height frame login
        this.setSize(1100, 700);

        //set width, height background image login frame
        this.getBackgroundImage().setSize(1100, 700);

        //set x, y, width, height textfield
        this.getUsernameField().setBounds(450, 115, 150, 25);
        this.getPasswordField().setBounds(450, 215, 150, 25);

        //set x, y, width, height button
        this.getLoginBtn().setBounds(450, 300, 150, 50);
        this.getBackButton().setBounds(450, 400, 150, 50);

        //set x,y, tulisan username,password
        this.getLabelUsername().setBounds(345, 100, 150, 50);
        this.getLabelPassword().setBounds(350, 200, 150, 50);
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

        passwordField = new javax.swing.JPasswordField();
        usernameField = new javax.swing.JTextField();
        labelUsername = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(passwordField);
        passwordField.setBounds(166, 149, 132, 22);

        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });
        getContentPane().add(usernameField);
        usernameField.setBounds(165, 109, 132, 22);

        labelUsername.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelUsername.setForeground(java.awt.Color.lightGray);
        labelUsername.setText("Username :");
        getContentPane().add(labelUsername);
        labelUsername.setBounds(84, 112, 76, 25);

        labelPassword.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        labelPassword.setForeground(java.awt.Color.lightGray);
        labelPassword.setText("Password : ");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(84, 152, 70, 25);

        loginBtn.setText("Login");
        loginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginBtnMouseClicked(evt);
            }
        });
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(loginBtn);
        loginBtn.setBounds(155, 205, 63, 25);

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });
        getContentPane().add(backButton);
        backButton.setBounds(155, 248, 57, 25);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_usernameFieldActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_loginBtnActionPerformed

    private void loginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginBtnMouseClicked
        // TODO add your handling code here:
         ProyekPBONew.setFileClick(new File("src/res/Click.wav"));
        try {
            ProyekPBONew.setAudioClick(AudioSystem.getAudioInputStream(ProyekPBONew.getFileClick()));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ProyekPBONew.setClick(AudioSystem.getClip());
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ProyekPBONew.getClick().open(ProyekPBONew.getAudioClick());
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProyekPBONew.getClick().start();
        String username = this.getUsernameField().getText();
        String password = this.getPasswordField().getText();

        boolean loginSuccess = false;
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            this.setVisible(false);
            ProyekPBONew.getFrameAdmin().setVisible(true);
        } else {
            for (int i = 0; i < ProyekPBONew.getUserList().size(); i++) {
                if (username.equals(ProyekPBONew.getUserList().get(i).getUsername())
                        && password.equals(ProyekPBONew.getUserList().get(i).getPassword())) {
                    loginSuccess = true;
                    ProyekPBONew.setLoggedUser(ProyekPBONew.getUserList().get(i));
                }
            }
            if (password.equals("") || username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid input", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (loginSuccess) {
                    this.setVisible(false);
                    ProyekPBONew.reInstanceFrameUser();
                    ProyekPBONew.getFrameUser().setVisible(true);
                    
                } else {
                    JOptionPane.showMessageDialog(this, "Login Failed", "Warning", JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_loginBtnMouseClicked

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
//        MainFrame logframe = new MainFrame();
//        logframe.setVisible(true);
//        logframe.setLocationRelativeTo(null);
//        logframe.setTitle("Blekjek");
//        logframe.setResizable(false);
        ProyekPBONew.setFileClick(new File("src/res/Click.wav"));
        try {
            ProyekPBONew.setAudioClick(AudioSystem.getAudioInputStream(ProyekPBONew.getFileClick()));
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            ProyekPBONew.setClick(AudioSystem.getClip());
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ProyekPBONew.getClick().open(ProyekPBONew.getAudioClick());
        } catch (LineUnavailableException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ProyekPBONew.getClick().start();
        ProyekPBONew.getLogframe().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelUsername;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabel1() {
        return labelUsername;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.labelUsername = jLabel1;
    }

    public JLabel getjLabel2() {
        return labelPassword;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.labelPassword = jLabel2;
    }

    public JButton getLoginBtn() {
        return loginBtn;
    }

    public void setLoginBtn(JButton loginBtn) {
        this.loginBtn = loginBtn;
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

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
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

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

}
