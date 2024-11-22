/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface6;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class A {
    
    void m1(int n) {
        FInterface6 i = (x) -> {
            int y = 0;
            if (x > 100) {
                y = n - 5;
            }
            return y;
        };
        m12(n, i);
    }

    void m2(int n) {
        FInterface6 i = (x) -> {
            int y = 0;
            if (x < 50) {
                y = n + 5;
            }
            return y;
        };
        m12(n, i);
    }

void m12(int n, FInterface6 j) {
    int sum = 0;
    int m = 0;
    for (int i = 1; i <= n; i++) {
        sum += i;
    }
    int l = j.doit(sum);

    sum = 0;
    for (int i = 1; i <= l; i++) {
        sum += i * i;
    }
    System.out.println("\nSum of squares up to " + l + " is " + sum);
}

}
