/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.interface3;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class TestInterface3 implements Interface3,Showable {
    @Override
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        TestInterface3 obj= new TestInterface3();
        obj.print();
    }
}
