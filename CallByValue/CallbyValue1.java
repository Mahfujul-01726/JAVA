/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.callbyvalue;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class CallbyValue1 {
    public static void main(String[] args) {
        CallbyValue ob=new CallbyValue();
        int x =10;
        
        System.out.println("before call="+x);
        ob.change(x); // call by value
        System.out.println("after call="+x);
    
}
}
