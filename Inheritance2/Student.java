/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.inheritance2;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Student extends Inheritance2 {
    int id;
    String section;
    
    void display2(){
        System.out.println("Child class");
        doit();
        
    }
    
    //override
    
    void display1(){
        super.display1();
        System.out.println("Id:"+id);
        System.out.println("Section:"+section);
    }
    
}
