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
    private static Login loginFrame = new Login();
    private static Register registerFrame = new Register();
    private static FrameAdmin frameAdmin = new FrameAdmin();
    private static FrameUser frameUser = new FrameUser();
    private static FrameCloseAcc frameClose = new FrameCloseAcc();
    private static TopUp frameTopUp = new TopUp();
    

    public ProyekPBONew() {

    }

    public static void main(String[] args) {
        new ProyekPBONew();
        logframe.setVisible(true);
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

    public static Login getLoginFrame() {
        return loginFrame;
    }

    public static Register getRegisterFrame() {
        return registerFrame;
    }

    public static FrameAdmin getFrameAdmin() {
        return frameAdmin;
    }

    public static FrameUser getFrameUser() {
        return frameUser;
    }

    public static FrameCloseAcc getFrameClose() {
        return frameClose;
    }

    public static TopUp getFrameTopUp() {
        return frameTopUp;
    }

    

}
