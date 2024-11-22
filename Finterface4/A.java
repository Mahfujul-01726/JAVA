/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.finterface4;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class A implements FInterface4{
    @Override
    public void method1(){
        System.out.println("A.method1");
    }
    @Override
    public void method2(int a, int b){
        System.out.println("A.method2"+(a+b));
    }
    @Override
    public void method3(int a, int b){
        System.out.println("override summation="+(a+b+2));
    }
}
