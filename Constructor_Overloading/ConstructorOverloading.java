/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.constructoroverloading;

/**
 *
 * @author MD MAHFUJUL KARIM
 * 
 * class name same just parameter difference
 */
public class ConstructorOverloading {

   String name, gender;
   int age, weight;

    public ConstructorOverloading() {
        System.out.println("Default Constructor");
    }

     ConstructorOverloading(String n , String g , int a) {
        name = n;
        gender = g;
        age = a;
        
    }

     ConstructorOverloading(String n, String g, int a, int w) {
        name = n;
        gender = g;
        age = a;
        weight = w;
    }
     
    
    
    
   
   
}
