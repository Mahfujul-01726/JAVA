/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.downcasting;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Down {
    public static void main(String[] args) {
        Downcasting d=new Child();
        d.name="Shubham";
        
        //performing 
        
        child c=(Child)p;
        
        c.age=18;
        System.out.println("c.name");
        System.out.println("c.age");
        c.showMessage();
    }
}
