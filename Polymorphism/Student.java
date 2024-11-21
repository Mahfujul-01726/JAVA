/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.polymorphism;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Student extends Polymorphism {
    int id;
    String section;
    Student(String n, int a, int w, int i, String s ){
        super(n,a,w);
        id=i;
        section=s;
    }
    @Override
    void display1(){
        super.display1();
        System.out.println("Id:"+id);
        System.out.println("Section:"+section);
    }
    
}
