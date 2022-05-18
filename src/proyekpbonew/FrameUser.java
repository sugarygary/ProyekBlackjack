/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyekpbonew;

/**
 *
 * @author Inghwe
 */
public class FrameUser extends javax.swing.JFrame {

    /**
     * Creates new form FrameUser
     */
    public FrameUser() {
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

        jLabel1 = new javax.swing.JLabel();
        GameBtn = new javax.swing.JToggleButton();
        MainBtn = new javax.swing.JToggleButton();
        LeaderboardBtn = new javax.swing.JToggleButton();
        logoutBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USER");

        GameBtn.setText("GAME");
        GameBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GameBtnActionPerformed(evt);
            }
        });

        MainBtn.setText("MAIN");
        MainBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainBtnActionPerformed(evt);
            }
        });

        LeaderboardBtn.setText("LEADERBOARD");
        LeaderboardBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LeaderboardBtnActionPerformed(evt);
            }
        });

        logoutBtn.setText("LOGOUT");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MainBtn)
                            .addComponent(GameBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(LeaderboardBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(logoutBtn)))
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(GameBtn)
                .addGap(18, 18, 18)
                .addComponent(MainBtn)
                .addGap(18, 18, 18)
                .addComponent(LeaderboardBtn)
                .addGap(28, 28, 28)
                .addComponent(logoutBtn)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GameBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GameBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GameBtnActionPerformed

    private void MainBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainBtnActionPerformed

    private void LeaderboardBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LeaderboardBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LeaderboardBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        ProyekPBONew.setFrame(ProyekPBONew.getLogframe());
    }//GEN-LAST:event_logoutBtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton GameBtn;
    private javax.swing.JToggleButton LeaderboardBtn;
    private javax.swing.JToggleButton MainBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton logoutBtn;
    // End of variables declaration//GEN-END:variables
}
