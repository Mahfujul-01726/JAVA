/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface4;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class HelloWorld {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        FInterface4 in;
        A a = new A();
        B b = new B();

        in = a;
        in.method1();
        in.method2(20, 30);
        in.method3(10, 15);

        System.out.println("\n");

        in = (FInterface4) b;
        in.method1();
        in.method2(20, 30);
        in.method3(10, 15);
    }
}
