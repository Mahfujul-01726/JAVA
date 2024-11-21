/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.encapsulation;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Encapsulation {
       private String name;
       private int weight;
       private double height;
       Encapsulation(int w, double h){
           weight=w;
           height=h;
       }
       public void setName(String n){
           name=n;
       }
       public String getName(){
           return name;
       }
       public int getWeight(){
           return weight;
       }
       public double getHeight(){
           return height;
       }
       
       void BMI(int w, double h){
           double bmi=w/(h*h);
           System.out.println("BMI="+bmi);
       }
    
}

