/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekpbonew;

import java.util.Comparator;

/**
 *
 * @author Inghwe
 */
public class Compare implements Comparator<User>{

    @Override
    public int compare(User user1, User user2) {
        if (user1.getTotalWin() > user2.getTotalWin()) {
            return -1;
        }
        else{
            return 1;
        }
    }
    
}
