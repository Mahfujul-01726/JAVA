/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.encapsulation1;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Encapsulation1 {

    String name;
    private int weight;
    private double height;

    public Encapsulation1(String n, int w, double h) {
        name=n;
        weight=w;
        height=h;
        
    }
    
    public void setweight(int w){
        weight=w;
    }
    public int getw(){
        return weight;
    }
    public double getHeight(){
        return height;
    }
    
    void BMI(int w, double h){
        double bmi=w/(h*h);
        System.out.println("BMI="+bmi);
        System.out.println(String .format("BMI=%.3f", bmi));
    }
    
    
}
