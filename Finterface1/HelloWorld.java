/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface1;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class HelloWorld {
    
      public static void main(String[] args) {
        System.out.println("Hello, World!");  
    
        FInterface1 in;
        in=( var n1, var n2)->
        {
            System.out.println("testing"+(n1+n2));
            return n1+n2;
        };
        int c=in.method1(10,15);
          System.out.println("c="+c);
    }
}

/*
lambda expression is used to implement a interface
The lambda expression demonstrates the use of functional interfaces and lambda expressions in Java.
*/
