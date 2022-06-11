/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekpbonew;

import java.io.Serializable;
import javax.swing.ImageIcon;

/**
 *
 * @author Inghwe
 */
public abstract class Card implements Serializable {

    protected int value;
    protected ImageIcon png;

    public Card(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ImageIcon getPng() {
        return png;
    }

    public void setPng(ImageIcon png) {
        this.png = png;
    }

}
