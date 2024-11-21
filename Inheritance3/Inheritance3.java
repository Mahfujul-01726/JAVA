/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.inheritance3;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Inheritance3 {
     String name;
     int age;
     int weight;
     Inheritance3(String n, int a, int w){
         name=n;
         age=a;
         weight=w;
     }
     Inheritance3(){
         System.out.println("Default constructor1");
     }
     void display1(){
         System.out.println("Name:"+name);
         System.out.println("Age:"+age);
         System.out.println("Weight:"+weight);
     }
}
