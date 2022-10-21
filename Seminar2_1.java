/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar2_1;
import java.util.Hashtable;

/**
 *
 * @author vluca
 */
public class Seminar2_1 {

    public static void main(String[] args) {
        Hashtable<String, Boolean> ht2
            = new Hashtable<String, Boolean>(); 

        ht2.put("Mihai", true);
        ht2.put("Andrei", false);
        ht2.put("Tomozei", true);
 
        System.out.println("Mappings of ht2 : " + ht2);
    }
}
