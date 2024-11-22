/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.studyopedia.interface4;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class Car implements Interface4 {
    @Override
    public void cleanVehicle(){
        System.out.println("Cleaning the vehicle");
    }
     public static void main(String[] args) {
        Car car = new Car();
        car.cleanVehicle();
        car.startVehicle();
    }
}
