/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface5;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class A {
    void m1(int a, int b, int c) {
        FInterface5 i = (x, y) -> {
            return x + y;
        };
        m12(a, b, c, i);
    }

    void m2(int a, int b, int c) {
        FInterface5 i = (x, y) -> {
            return x * y;
        };
        m12(a, b, c, i);
    }

    void m12(int x, int y, int z, FInterface5 i) {
        int s = i.doit(x, y);

        if (s > z)
            System.out.println("Greater than z");
        else
            System.out.println("Not greater than z");
    }

}

