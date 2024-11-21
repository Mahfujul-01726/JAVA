/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.variableexample;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class VariableExample {
    // Instance variable
    private int instanceVar;

    // Static variable
    private static int staticVar;

    public void methodWithLocalVariable() {
        // Local variable
        int localVar = 10;

        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariableExample obj1 = new VariableExample();
        VariableExample obj2 = new VariableExample();

        obj1.instanceVar = 5;
        obj2.instanceVar = 7;
        VariableExample.staticVar = 15;

        System.out.println("From obj1:");
        obj1.methodWithLocalVariable();

        System.out.println("From obj2:");
        obj2.methodWithLocalVariable();
    }
}

