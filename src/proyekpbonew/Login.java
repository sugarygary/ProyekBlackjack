/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import javax.accessibility.AccessibleContext;
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
    public Login() {
        initComponents();
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

        labelUsername.setText("Username :");
        getContentPane().add(labelUsername);
        labelUsername.setBounds(84, 112, 76, 16);

        labelPassword.setText("Password : ");
        getContentPane().add(labelPassword);
        labelPassword.setBounds(84, 152, 70, 16);

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

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyekpbonew/background.jpg"))); // NOI18N
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
        String username = this.getUsernameField().getText();
        String password = this.getPasswordField().getText();

        boolean loginSuccess = false;
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("admin")) {
            this.setVisible(false);
            FrameAdmin frameAdmin = new FrameAdmin();
            frameAdmin.setLocationRelativeTo(null);
            frameAdmin.setTitle("Menu Admin");
            frameAdmin.setVisible(true);
        } else {
            for (int i = 0; i < ProyekPBONew.getUserList().size(); i++) {
                if (username.equals(ProyekPBONew.getUserList().get(i).getUsername())
                        && password.equals(ProyekPBONew.getUserList().get(i).getPassword())) {
                    loginSuccess = true;
                }
            }
            if (password.equals("") || username.equals("")) {
                JOptionPane.showMessageDialog(this, "Invalid input", "Warning", JOptionPane.WARNING_MESSAGE);
            } else {
                if (loginSuccess) {
                    this.setVisible(false);
                    FrameUser frameUser = new FrameUser();
                    frameUser.setLocationRelativeTo(null);
                    frameUser.setTitle("Menu User");
                    frameUser.setVisible(true);
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
        ProyekPBONew.setFrame(ProyekPBONew.getLogframe());
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
