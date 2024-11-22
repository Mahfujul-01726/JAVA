/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.finterface7;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class FInterface7 {

    // Method to add two integers and print the result
    public void method1(int a, int b) {
        // Step C-0:
        int c = a + b; // Add 'a' and 'b' and assign the result to 'c'
        System.out.println(c); // Print the value of 'c'
        c=c-1;
        System.out.println(c); // Print the value of 'c' again
    }

    // Method to subtract 'b' from 'a' and print the result, then increment it by 1 and print it again
    public void method2(int a, int b) {
        int c = 0; // Initialize 'c' to 0
        c = a - b; // Subtract 'b' from 'a' and assign the result to 'c'
        System.out.println(c); // Print the value of 'c'
        c = c + 1; // Increment 'c' by 1
        System.out.println(c); // Print the updated value of 'c'
    }

    // Main method for testing
    public static void main(String[] args) {
        FInterface7 obj = new FInterface7(); // Create an instance of class A
        obj.method1(10, 5); // Call method1 with arguments 10 and 5
        obj.method2(10, 5); // Call method2 with arguments 10 and 5
    }
}

