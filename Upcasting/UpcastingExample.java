/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.upcasting;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class UpcastingExample {

    public static void main(String[] args) {
        Upcasting obj1 = new Child();
        Upcasting obj2 = new Child(); // Corrected: 'child' should be 'Child' (capitalized class name)
        obj1.PrintData();
        obj2.PrintData();

        // Downcasting obj1 and obj2 to Child
        Child child1 = (Child) obj1;
        Child child2 = (Child) obj2;

        // Now you can access methods or fields specific to Child
        child1.PrintData();
        child2.PrintData();
    }
}