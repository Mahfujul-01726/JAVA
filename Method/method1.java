/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.method;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class method1 { 
    public static void main(String[] args) {
        Method a = new Method();
        int add=a.sum(30, 20);
        int s = a.sub(30,20);
        int m = a.mul(30, 20);
        
        System.out.println("Addition="+add);
        System.out.println("Subtraction="+s);
        System.out.println("Multiplication="+m);
        
        a.div(30, 20);
    }
    
}
