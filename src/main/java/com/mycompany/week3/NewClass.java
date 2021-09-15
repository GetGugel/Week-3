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
    
    int sumArr(int[] arr ){
        int sm = 0;
        for (int i = 0; i < arr.length; i++) {
            sm+=arr[i];
        }
        
        
        return sm;
    }
    
    public static void main(String[] args) {
        NewClass nc = new NewClass();
        NewClass nc2 = new NewClass();
        String word= "Brett";
        
        int [] Arr= {1,2,3};
        
        
        
        
        int z = nc.getStrLngth(word);
        int c = nc2.sumArr(sm);
        System.out.println("Word is: "+z);
        System.out.println("Word is: "+c);
        
        
        
    }
    
}
