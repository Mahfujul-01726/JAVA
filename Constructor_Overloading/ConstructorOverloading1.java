/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.constructoroverloading;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class ConstructorOverloading1 {
    public static void main(String[] args) {
        ConstructorOverloading e1=new ConstructorOverloading("mahfuj","Male",23);
        ConstructorOverloading e2=new ConstructorOverloading("mahfuj", "Male", 23, 70);
        ConstructorOverloading e3=new ConstructorOverloading();
        
        System.out.println("\nname:"+e1.name+"\nGender:"+e1.gender+"\nAge:"+e1.age);
        System.out.println("\nname:"+e2.name+"\nGender:"+e2.gender+"\nAge:"+e2.age+"\nWeight:"+e2.weight);
    }
    
}
