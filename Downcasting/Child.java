/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.downcasting;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Child extends Parent{
    int age;
    
    //Performing overriding
    @Override
    void showMessage(){
        System.out.println("Child method is called");
    }
    
}
