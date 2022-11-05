/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.seminar4;
import java.util.Scanner;

/**
 *
 * @author vluca
 */
public class Seminar4 {

    public static StringBuffer encrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
        for(int i=0;i<text.length();i++)
        {
            if(Character.isUpperCase(text.charAt(i)))
            {
                char ch=(char)(((int)text.charAt(i)+s-65)%26+65);
                result.append(ch);
            }
            else
            if(Character.isLowerCase(text.charAt(i)))    
            {
                char ch=(char)(((int)text.charAt(i)+s-97)%26+97);
                result.append(ch);
            }
            else
            result.append(text.charAt(i));
        }
        return result;
    }
    public static StringBuffer decrypt(String text, int s)
    {
        StringBuffer result= new StringBuffer();
        for(int i=0;i<text.length();i++)
        {
            if(Character.isUpperCase(text.charAt(i)))
            {
                char ch=(char)(((int)text.charAt(i)-s+65)%26+65);
                result.append(ch);
            }
            else
            if(Character.isLowerCase(text.charAt(i)))    
            {
                char ch=(char)(((int)text.charAt(i)-s+97)%26+97);
                result.append(ch);
            }
            else
            result.append(text.charAt(i));
        }
        return result;
    }
        public static void main(String[] args)
        {
            String text = "ANA ARE MERE";
            int s=4;
            System.out.println("Text : "+text);
            System.out.println("Shift : "+s);
            String encrypted = encrypt(text,s).toString();
            System.out.println("Cipher : " +encrypted);
            String decrypted = decrypt(encrypted,s).toString();
            System.out.println("Decrypted : " +decrypted);
            
        }
    
}
