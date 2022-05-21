/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.border.Border;

/**
 *
 * @author Gary
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public MainFrame() {
        initComponents();
        this.setTitle("Blekjek");
        this.setResizable(false);

        //set width, height main frame
        this.setSize(1100, 700);
        //set width, height background image
        this.getBackgroundImage().setSize(1100, 700);

        //set x, y, width, height button
        this.getLoginBtn().setBounds(450, 250, 175, 75);
        this.getRegisterBtn().setBounds(450, 350, 175, 75);
        this.getLeaderboardBtn().setBounds(450, 450, 175, 75);
        this.getLogo().setBounds(300, 50, 450, 176);
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

        LoginBtn = new javax.swing.JButton();
        RegisterBtn = new javax.swing.JButton();
        LeaderboardBtn = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        LoginBtn.setBackground(new java.awt.Color(235, 103, 8));
        LoginBtn.setText("Login");
        LoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginBtnMouseClicked(evt);
            }
        });
        LoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginBtnActionPerformed(evt);
            }
        });
        getContentPane().add(LoginBtn);
        LoginBtn.setBounds(134, 76, 128, 47);

        RegisterBtn.setText("Sign Up");
        RegisterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegisterBtnMouseClicked(evt);
            }
        });
        getContentPane().add(RegisterBtn);
        RegisterBtn.setBounds(134, 141, 128, 47);

        LeaderboardBtn.setText("Leaderboard");
        getContentPane().add(LeaderboardBtn);
        LeaderboardBtn.setBounds(134, 206, 128, 47);

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/output-onlinepngtools_1 (2).png"))); // NOI18N
        logo.setText("jLabel1");
        getContentPane().add(logo);
        logo.setBounds(-50, 20, 610, 140);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(0, 0, 400, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LoginBtnActionPerformed

    private void LoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginBtnMouseClicked
        ProyekPBONew.getLogframe().setVisible(false);
        ProyekPBONew.reInstanceLogin();
        ProyekPBONew.getLoginFrame().setVisible(true);
    }//GEN-LAST:event_LoginBtnMouseClicked

    private void RegisterBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegisterBtnMouseClicked
        ProyekPBONew.getLogframe().setVisible(false);
        ProyekPBONew.reInstanceRegister();
        ProyekPBONew.getRegisterFrame().setVisible(true);
    }//GEN-LAST:event_RegisterBtnMouseClicked

    public JButton getLeaderboardBtn() {
        return LeaderboardBtn;
    }

    public void setLeaderboardBtn(JButton LeaderboardBtn) {
        this.LeaderboardBtn = LeaderboardBtn;
    }

    public JLabel getLogo() {
        return logo;
    }

    public JButton getLoginBtn() {
        return LoginBtn;
    }

    public void setLoginBtn(JButton LoginBtn) {
        this.LoginBtn = LoginBtn;
    }

    public JButton getjButton1() {
        return RegisterBtn;
    }

    public void setjButton1(JButton jButton1) {
        this.RegisterBtn = jButton1;
    }

    public JButton getRegisterBtn() {
        return RegisterBtn;
    }

    public void setRegisterBtn(JButton RegisterBtn) {
        this.RegisterBtn = RegisterBtn;
    }

    public JLabel getBackgroundImage() {
        return backgroundImage;
    }

    public void setBackgroundImage(JLabel backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LeaderboardBtn;
    private javax.swing.JButton LoginBtn;
    private javax.swing.JButton RegisterBtn;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
