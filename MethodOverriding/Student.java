/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.methodoverriding;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Student extends MethodOverriding {
    int id;
    String section;
    
    
    
    @Override
    void doit(){
       System.out.println("Doing nothing");
       
       System.out.println("Doing something");
        
    }
    @Override
    void display1(){
        super.display1();
        System.out.println("Id:"+id);
        System.out.println("Section:"+section);
    }
    
}
