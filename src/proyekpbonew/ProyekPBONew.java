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

    public ProyekPBONew() {
        MainFrame logframe = new MainFrame();
        logframe.setVisible(true);
        logframe.setLocationRelativeTo(null);
        logframe.setTitle("Blekjek");
        logframe.setResizable(false);
    }

    public static void main(String[] args) {
        new ProyekPBONew();
    }

    public static ArrayList<User> getUserList() {
        return userList;
    }

}
