/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface2;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class HelloWorld {
    public static void main(String[] args) {
        FInterface2 in;
        in=(n1,n2)->
        {
            System.out.println("testing"+(n1+n2));
            return n1+n2;
        };
        FInterface2 in2;
        in2=(n1,n2)->
        {
            return n1*n2;
        };
        int c=in.method1(10,15);
        int d=in2.method1(10, 15);
        System.out.println("c="+c);
        System.out.println("d="+d);
    }
    
}
