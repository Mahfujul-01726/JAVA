/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.finterface8;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class FInterface8 {
    // Interface FInterface8 declaration
    interface FIn1 {
        int doit(int a, int b);
    }

    // Interface FInterface81 declaration
    interface FIn2 {
        int doit2(int a);
    }

    void m1(int n1, int n2) {
        FIn1 i = (x, y) -> x + y;
        FIn2 j = (x) -> x - 1;
        m12(n1, n2, i, j);
    }

    void m2(int n1, int n2) {
        FIn1 i = (x, y) -> x - y;
        FIn2 j = (x) -> x + 1;
        m12(n1, n2, i, j);
    }

    void m12(int n1, int n2, FIn1 i, FIn2 j) {
        int c = 0;
        c = i.doit(n1, n2);
        System.out.println(c);
        c = j.doit2(c);
        System.out.println(c);
    }

    // Main method for testing
    public static void main(String[] args) {
        FInterface8 fInterface8 = new FInterface8();
        fInterface8.m1(3, 4);
        fInterface8.m2(4, 5);
    }
}
