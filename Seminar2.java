/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar2;

/**
 *
 * @author vluca
 */
public class Seminar2 {

    public static void main(String[] args){
        double[] payments = {3.35, 12.07, 122.76, 7.33, 6.04, 6.25, 3.45, 0.52};
        
        double searchkey = 7.33;
        
        System.out.println("Search key found at: " + sequentialSearch( payments, searchkey ));
    }
    
    public static double sequentialSearch(double[] arr, double key){
        int arraySize = arr.length;
        for(int i=0;i<arraySize; i++){
            if(arr[i] == key){
                return i;
                
            }
        }
        return -1;
    }
}
