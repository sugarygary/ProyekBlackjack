/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekpbonew;

import java.util.ArrayList;

/**
 *
 * @author Gary
 */
public class ProyekPBONew {

    private static ArrayList<User> userList = new ArrayList<>();
    private static MainFrame logframe = new MainFrame();

    public static void setFrame(MainFrame logframe) {
        logframe.setVisible(true);
        logframe.setTitle("Blekjek");
        logframe.setResizable(false);

        //set width, height main frame
        logframe.setSize(1100, 700);
        //set width, height background image
        logframe.getBackgroundImage().setSize(1100, 700);

        //set x, y, width, height button
        logframe.getLoginBtn().setBounds(450, 100, 175, 75);
        logframe.getRegisterBtn().setBounds(450, 200, 175, 75);
        logframe.getLeaderboardBtn().setBounds(450, 300, 175, 75);
        logframe.setLocationRelativeTo(null);
    }

    public ProyekPBONew() {
        setFrame(logframe);

    }

    public static void main(String[] args) {
        new ProyekPBONew();

    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

    public static MainFrame getLogframe() {
        return logframe;
    }

    public static void setLogframe(MainFrame logframe) {
        ProyekPBONew.logframe = logframe;
    }

}
