/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyekpbonew;

import java.util.ArrayList;

/**
 *
 * @author Inghwe
 */
public class stack<T> {
    private ArrayList<T> A = new ArrayList<T>();
    private int top = -1;
    
    public void push(T X){
        A.add(X);
        top++;
    }
    
    T pop(){
        int temp = top;
        top--;
        return A.get(temp);        
    }
    
    public ArrayList<T> getA() {
        return A;
    }
}
