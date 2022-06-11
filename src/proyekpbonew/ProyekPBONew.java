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
    private static User LoggedUser;
    private static Game frameGame = new Game();
    private static Clip BGM;
    private static File fileClick;
    private static Clip Click;
    private static AudioInputStream audioClick;
    
    public static void setFrameGame(Game frameGame) {
        ProyekPBONew.frameGame = frameGame;
    }

    public static Game getFrameGame() {
        return frameGame;
    }

    public ProyekPBONew() {
//        frameGame.setVisible(true);
    }

    public static User getLoggedUser() {
        return LoggedUser;
    }

    public static void setLoggedUser(User LoggedUser) {
        ProyekPBONew.LoggedUser = LoggedUser;
    }

    public static void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        new ProyekPBONew();
        logframe.setVisible(true);
        File file = new File("src/res/BGM.wav");
        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        BGM = AudioSystem.getClip();
        BGM.open(audioStream);
        BGM.start();
        BGM.loop(BGM.LOOP_CONTINUOUSLY);
        FloatControl volume = (FloatControl) BGM.getControl(FloatControl.Type.MASTER_GAIN);
        double percent = 0.3;   
        float dB = (float) (Math.log(percent) / Math.log(10.0) * 20.0);
        volume.setValue(dB);
        
        //sound effect
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

    public static Clip getBGM() {
        return BGM;
    }

    public static Clip getClick() {
        return Click;
    }

    public static File getFileClick() {
        return fileClick;
    }

    public static AudioInputStream getAudioClick() {
        return audioClick;
    }

    public static void setBGM(Clip BGM) {
        ProyekPBONew.BGM = BGM;
    }

    public static void setFileClick(File fileClick) {
        ProyekPBONew.fileClick = fileClick;
    }

    public static void setClick(Clip Click) {
        ProyekPBONew.Click = Click;
    }

    public static void setAudioClick(AudioInputStream audioClick) {
        ProyekPBONew.audioClick = audioClick;
    }
    
    
}
