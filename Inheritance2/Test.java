/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.inheritance2;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Mahfujul";
        s1.age=18;
        s1.id=101;
        s1.section="4B";
        s1.weight=60;
        
        s1.display2();
        System.out.println("-----------------");
        s1.display1();
        System.out.println("-----------------");
        s1.doit();
        
    }
    
}
