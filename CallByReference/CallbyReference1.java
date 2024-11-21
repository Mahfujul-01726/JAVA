/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.callbyreference;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class CallbyReference1 {
    public static void main(String[] args) {
        CallbyReference r1=new CallbyReference();
        r1.name="Zim";
        System.out.println(r1.name);
        r1.change(r1);
        System.out.println(r1.name);
    }
    
}
