/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.encapsulation1;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class App {
    public static void main(String[] args) {    
        Encapsulation1 p1=new Encapsulation1("Zenia", 65, 1.72);
        
        p1.BMI(p1.getw(),p1.getHeight());
        System.out.println("Name:"+p1.name);
        p1.name="Zim";
        p1.setweight(95);
        p1.BMI(p1.getw(),p1.getHeight());
        System.out.println("Name:"+p1.name);
        
    }
    
}
