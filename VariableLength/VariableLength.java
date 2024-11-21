/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.studyopedia.variablelength;

/**
 *
 * @author MD MAHFUJUL KARIM
 */
public class VariableLength {

    void add(int ...num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println("summation="+sum);
    }
}
