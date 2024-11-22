/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface3;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class HelloWorld {
     public static void main(String[] args) {
        FInterface3 in;
        in=(n1)->
        {
            int fact=1;
            for(int j=1;j<=n1;j++)
            {
                fact *=j;
            }
            return fact;
        };
        int c=in.method1(4);
         System.out.println("c="+c);
    }
}
