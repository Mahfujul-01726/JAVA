/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.interface4;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
 interface Interface4 {

   void cleanVehicle();
   default void startVehicle(){
       System.out.println("Vehicle is starting");
   }
}
