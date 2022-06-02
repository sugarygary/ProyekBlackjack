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
public class Diamonds extends Card {

    public Diamonds(int value) {
        super(value);
        ImageIcon imageIcon;
        if (value == 11) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Diamonds/J.png")); // load the image to a imageIcon
        } else if (value == 12) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Diamonds/Q.png")); // load the image to a imageIcon
        } else if (value == 13) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Diamonds/K.png")); // load the image to a imageIcon
        } else if (value == 1) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Diamonds/A.png")); // load the image to a imageIcon
        } else {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Diamonds/" + this.value + ".png")); // load the image to a imageIcon
        }
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(150, 224, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); // transform it back
        this.png = imageIcon;
    }

}
