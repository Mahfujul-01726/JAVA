/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.mainmethodoverloading;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class MainMethodOverloading {

    public static void main(String[] args) {
        System.out.println("main with String[]");
    }
    public static void main(String args)
    {
        System.out.println("main with String");
    }
    public static void main()
    {
        System.out.println("main wihtout args");
    }
}
