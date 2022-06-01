/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekpbonew;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Gary
 */
public class Clubs extends Card {

    public Clubs(int value) {
        super(value);
        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Clubs/" + this.value + ".png")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 149, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); // transform it back
        this.png = imageIcon;
    }

}
