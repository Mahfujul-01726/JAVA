/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.polymorphism;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Test {
    public static void main(String[] args) {
        Student s1=new Student("Mahfujul",23,75,735,"4B");
        s1.display1();
        System.out.println("-----------------");
        Polymorphism p1=new Student("Nazia",16,55,111,"4B");
        Polymorphism p2=new Polymorphism("Radia",16,55);
        
        p1.display1();
        System.out.println("--------------");
        p2.display1();
      
    }
    
}
