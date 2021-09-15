/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.week3;


public class NewClass {
            
    //Lab 
    int getStrLngth(String word){
        
        int x = word.length();
        
        return x;
    }
        
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        String word= "Hello";
        
        
        
        int z = nc.getStrLngth(word);
        System.out.println("Word is: "+z);
        
        
        
    }
    
}
