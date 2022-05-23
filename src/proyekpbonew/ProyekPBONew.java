/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyekpbonew;

import java.util.ArrayList;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.*;
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
    private static Leaderboard LB = new Leaderboard();

    public ProyekPBONew() {

    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new ProyekPBONew();
        logframe.setVisible(true);
        File file  = new File("BGM.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        Clip clip = AudioSystem.getClip();
        clip.open(audioStream);
        
        clip.start();
        clip.loop(clip.LOOP_CONTINUOUSLY);
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

    public static void reInstanceLogin() {
        loginFrame = new Login();
    }

    public static void reInstanceRegister() {
        registerFrame = new Register();
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

    public static Leaderboard getLB() {
        return LB;
    }

    public static void setLB(Leaderboard LB) {
        ProyekPBONew.LB = LB;
    }
    

}
