/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author vluca
 */
public class Mavenproject3 {
    
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r>=l)
        {
            int mid = l + (r - l)/2;
 
            if (arr[mid] == x)
               return mid;
  
            if (arr[mid] > x)
               return binarySearch(arr, l, mid-1, x);
            else
               return binarySearch(arr, mid+1, r, x);
        }
  
        return -1;
    }
    
    public static void main(String args[])
    {
        Mavenproject3 ob = new Mavenproject3();
        int arr[] = {2,3,4,10,40};
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr,0,n-1,x);
        if (result == -1)
            System.out.println("Element not present.");
        else
            System.out.println("Element found at index " +
                                                 result + ".");
    }
       
}
