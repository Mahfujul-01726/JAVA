/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.encapsulation;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class App {
    public static void main(String[] args) {
        Encapsulation p1=new Encapsulation(65, 1.72);
        Encapsulation p2=new Encapsulation(60,1.62);
        Encapsulation p3=new Encapsulation(55,1.52);
        
        p1.setName("Zarin");
        p2.setName("Sadia");
        p3.setName("Zim");
        p1.setName("Sakib");
        
        System.out.println("Name="+p1.getName());
        p1.BMI(p1.getWeight(),p1.getHeight() );
        
        System.out.println("Name="+p2.getName());
        p1.BMI(p2.getWeight(),p2.getHeight() );
        
        System.out.println("Name="+p3.getName());
        p3.BMI(p3.getWeight(),p3.getHeight() );
        
    }
    
}
