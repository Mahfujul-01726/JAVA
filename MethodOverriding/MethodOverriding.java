/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.methodoverriding;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class MethodOverriding {
    String name;
    int age;
    int weight;
    void display1(){
        System.out.println("Parent class");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
    }
    
    void doit(){
        System.out.println("Doing nothing");
    }

}
