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
public class Hearts extends Card {

    public Hearts(int value) {
        super(value);
        ImageIcon imageIcon;
        if (value == 11) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Hearts/J.png")); // load the image to a imageIcon
        } else if (value == 12) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Hearts/Q.png")); // load the image to a imageIcon
        } else if (value == 13) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Hearts/K.png")); // load the image to a imageIcon
        } else if (value == 1) {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Hearts/A.png")); // load the image to a imageIcon
        } else {
            imageIcon = new ImageIcon(getClass().getResource("/res/Flat-Playing-Cards-Set/Flat Playing Cards Set/Hearts/" + this.value + ".png")); // load the image to a imageIcon
        }
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance(100, 149, java.awt.Image.SCALE_SMOOTH);
        imageIcon = new ImageIcon(newimg); // transform it back
        this.png = imageIcon;
    }

}
