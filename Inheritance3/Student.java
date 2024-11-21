/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.inheritance3;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Student extends Inheritance3 {
    int id;
    String section;
    Student(String n, int a, int w, int i, String s){
        super(n,a,w);
        id=i;
        section=s;
    }
    Student(){
        super();
        System.out.println("Default Constructor2");
        
    }
    
    @Override
    void display1(){
    super.display1();
    System.out.println("Id:"+id);
    System.out.println("Section:"+section);
    
}
}

