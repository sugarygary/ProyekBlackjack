/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

import java.util.Collections;
import java.util.Comparator;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 *
 * @author 62812
 */
public class Leaderboard extends javax.swing.JFrame {

    /**
     * Creates new form Leaderboard
     */
    public Leaderboard() {
        initComponents();

        this.setTitle("Leaderboard");
        this.getTitleLB().setBounds(420, 50, 250, 50);
        //set width, height frame admin
        this.setSize(1100, 700);

        //set width, height background image frame admin
        this.getBackgroundImage().setSize(1100, 700);

        //set button frame admin
        this.getBackBtn().setBounds(450, 550, 150, 50);
        this.setLocationRelativeTo(null);

        this.getUser1().setBounds(375, 150, 100, 100);
        this.getWin1().setBounds(575, 150, 100, 100);
        this.getUser2().setBounds(375, 225, 100, 100);
        this.getWin2().setBounds(575, 225, 100, 100);
        this.getUser3().setBounds(375, 300, 100, 100);
        this.getWin3().setBounds(575, 300, 100, 100);
        this.getUser4().setBounds(375, 375, 100, 100);
        this.getWin4().setBounds(575, 375, 100, 100);
        this.getUser5().setBounds(375, 450, 100, 100);
        this.getWin5().setBounds(575, 450, 100, 100);
        this.getLabelUser().setBounds(375, 100, 200, 100);
        this.getLabelWin().setBounds(550, 100, 100, 100);
        if (ProyekPBONew.getUserList().size() > 0) {
            this.getUser1().setText("1.  " + ProyekPBONew.getUserList().get(0).getUsername());
            this.getWin1().setText("$" + ProyekPBONew.getUserList().get(0).getTotalWin() + "");
        } else {
            this.getUser1().setText("1.  -");
            this.getWin5().setText("-");
        }

        if (ProyekPBONew.getUserList().size() > 1) {
            this.getUser2().setText("2.  " + ProyekPBONew.getUserList().get(1).getUsername());
            this.getWin2().setText("$" + ProyekPBONew.getUserList().get(1).getTotalWin() + "");
        } else {
            this.getUser2().setText("2.  -");
            this.getWin5().setText("-");
        }

        if (ProyekPBONew.getUserList().size() > 2) {
            this.getUser3().setText("3.  " + ProyekPBONew.getUserList().get(2).getUsername());
            this.getWin3().setText("$" + ProyekPBONew.getUserList().get(2).getTotalWin() + "");

        } else {
            this.getUser3().setText("3.  -");
            this.getWin5().setText("-");
        }

        if (ProyekPBONew.getUserList().size() > 3) {
            this.getUser4().setText("4.  " + ProyekPBONew.getUserList().get(3).getUsername());
            this.getWin4().setText("$" + ProyekPBONew.getUserList().get(3).getTotalWin() + "");
        } else {
            this.getUser4().setText("4.  -");
            this.getWin5().setText("-");
        }

        if (ProyekPBONew.getUserList().size() > 4) {
            this.getUser5().setText("5.  " + ProyekPBONew.getUserList().get(4).getUsername());
            this.getWin5().setText("$" + ProyekPBONew.getUserList().get(4).getTotalWin() + "");

        } else {
            this.getUser5().setText("5.  -");
            this.getWin5().setText("-");
        }

    }

    public JLabel getLabelUser() {
        return labelUser;
    }

    public JLabel getLabelWin() {
        return labelWin;
    }

    public JLabel getWin1() {
        return win1;
    }

    public void setWin1(JLabel win1) {
        this.win1 = win1;
    }

    public JLabel getWin2() {
        return win2;
    }

    public void setWin2(JLabel win2) {
        this.win2 = win2;
    }

    public JLabel getWin3() {
        return win3;
    }

    public void setWin3(JLabel win3) {
        this.win3 = win3;
    }

    public JLabel getWin4() {
        return win4;
    }

    public void setWin4(JLabel win4) {
        this.win4 = win4;
    }

    public JLabel getWin5() {
        return win5;
    }

    public void setWin5(JLabel win5) {
        this.win5 = win5;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user1 = new javax.swing.JLabel();
        TitleLB = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        user2 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();
        user5 = new javax.swing.JLabel();
        win1 = new javax.swing.JLabel();
        win2 = new javax.swing.JLabel();
        win3 = new javax.swing.JLabel();
        win4 = new javax.swing.JLabel();
        win5 = new javax.swing.JLabel();
        labelUser = new javax.swing.JLabel();
        labelWin = new javax.swing.JLabel();
        BackgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        user1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user1.setForeground(java.awt.Color.lightGray);
        getContentPane().add(user1);
        user1.setBounds(110, 90, 180, 40);

        TitleLB.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        TitleLB.setText("Leaderboard");
        getContentPane().add(TitleLB);
        TitleLB.setBounds(90, 20, 210, 26);

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(160, 230, 66, 22);

        user2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user2.setForeground(java.awt.Color.lightGray);
        getContentPane().add(user2);
        user2.setBounds(160, 140, 0, 0);

        user3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user3.setForeground(java.awt.Color.lightGray);
        getContentPane().add(user3);
        user3.setBounds(310, 130, 0, 0);

        user4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user4.setForeground(java.awt.Color.lightGray);
        getContentPane().add(user4);
        user4.setBounds(320, 220, 0, 0);

        user5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        user5.setForeground(java.awt.Color.lightGray);
        getContentPane().add(user5);
        user5.setBounds(60, 200, 0, 0);

        win1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        win1.setForeground(java.awt.Color.lightGray);
        getContentPane().add(win1);
        win1.setBounds(250, 130, 37, 0);

        win2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        win2.setForeground(java.awt.Color.lightGray);
        getContentPane().add(win2);
        win2.setBounds(310, 140, 37, 0);

        win3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        win3.setForeground(java.awt.Color.lightGray);
        getContentPane().add(win3);
        win3.setBounds(240, 150, 37, 0);

        win4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        win4.setForeground(java.awt.Color.lightGray);
        getContentPane().add(win4);
        win4.setBounds(230, 170, 37, 0);

        win5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        win5.setForeground(java.awt.Color.lightGray);
        getContentPane().add(win5);
        win5.setBounds(250, 200, 37, 0);

        labelUser.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelUser.setForeground(java.awt.Color.lightGray);
        labelUser.setText("Username");
        getContentPane().add(labelUser);
        labelUser.setBounds(100, 80, 120, 32);

        labelWin.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        labelWin.setForeground(java.awt.Color.lightGray);
        labelWin.setText("Earnings");
        getContentPane().add(labelWin);
        labelWin.setBounds(350, 270, 45, 16);

        BackgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/background.jpg"))); // NOI18N
        getContentPane().add(BackgroundImage);
        BackgroundImage.setBounds(0, 0, 400, 310);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        ProyekPBONew.clickSound();
        this.setVisible(false);
        MainFrame mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }//GEN-LAST:event_BackBtnActionPerformed

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
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Leaderboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Leaderboard().setVisible(true);
            }
        });
    }

    public JButton getBackBtn() {
        return BackBtn;
    }

    public void setBackBtn(JButton BackBtn) {
        this.BackBtn = BackBtn;
    }

    public JLabel getBackgroundImage() {
        return BackgroundImage;
    }

    public void setBackgroundImage(JLabel BackgroundImage) {
        this.BackgroundImage = BackgroundImage;
    }

    public JLabel getTitleLB() {
        return TitleLB;
    }

    public void setTitleLB(JLabel TitleLB) {
        this.TitleLB = TitleLB;
    }

    public JLabel getUser1() {
        return user1;
    }

    public JLabel getUser2() {
        return user2;
    }

    public JLabel getUser3() {
        return user3;
    }

    public JLabel getUser4() {
        return user4;
    }

    public JLabel getUser5() {
        return user5;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel BackgroundImage;
    private javax.swing.JLabel TitleLB;
    private javax.swing.JLabel labelUser;
    private javax.swing.JLabel labelWin;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    private javax.swing.JLabel win1;
    private javax.swing.JLabel win2;
    private javax.swing.JLabel win3;
    private javax.swing.JLabel win4;
    private javax.swing.JLabel win5;
    // End of variables declaration//GEN-END:variables
}
