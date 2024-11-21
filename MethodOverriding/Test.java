/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.methodoverriding;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Test {
    public static void main(String[] args) {
        Student s=new Student();
        Student s1=new Student();
        s1.name="Mahfujul";
        s1.age=23;
        s1.id=735;
        s1.section="4B";
        s1.weight=75;
        s1.display1();
        s1.doit();
    }
    
}
