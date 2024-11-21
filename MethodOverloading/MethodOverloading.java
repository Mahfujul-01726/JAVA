/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.methodoverloading;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class MethodOverloading {

    void square(int l){
        System.out.println("Square="+(l*l));
    }
    
    void square(double w){
        double sq=w*w;
        System.out.println("Square="+sq);
    }
    
    void square(int w, int h){
        int area=w*h;
        System.out.println("area="+area);
    }
}
