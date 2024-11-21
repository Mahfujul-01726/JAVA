/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.polymorphism;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Polymorphism {

    String name;
    int age;
    int weight;

    Polymorphism(String n, int a, int w) {
        name=n;
        age=a;
        weight=w;
    }
    void display1(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weight:"+weight);
    }
    
}
