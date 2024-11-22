/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.finterface4;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public interface FInterface4 {
    void method1();
    void method2(int a, int b);
    default void method3(int a, int b) {
        System.out.println("\nthe default summation=" + (a + b));
    }
}
