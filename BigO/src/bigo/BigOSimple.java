/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bigo;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author int320
 */
public class BigOSimple{
    private static  int N = 1000;
    private static Random r =new Random();
     public static void main(String[] args) {
        Integer[]a1 = new Integer[N];
        Integer[]a2 = new Integer[N];
        Integer[]a3 = new Integer[N];
        intial(a1);
        System.arraycopy(a1,0,a2,0,a1.length);
        System.arraycopy(a1,0,a3,0,a1.length);
        
        System.out.println("ArraySort");
        long begin = System.currentTimeMillis();
        Arrays.sort(a1);
        System.out.println("Duration:" +(System.currentTimeMillis()-begin)+"millseconds");
        System.out.println(printArray(a1));
        System.out.println("------------------------------------------------------");
        
        System.out.println("InsertionSort");
        begin = System.currentTimeMillis();
        InsertionSort(a2);
        System.out.println("Duration:" +(System.currentTimeMillis()-begin)+"millseconds");
        System.out.println(printArray(a1));
        System.out.println("------------------------------------------------------");
        
        
 
        
       
    }
    private static void intial(Integer[] a1){
        for (int i = 0; i < a1.length; i++) {
            a1[i] = r.nextInt(N);
        }
    }
    
    public static void InsertionSort(Integer[] a) 
    { 
        int n = a.length; 
        for (int i = 1; i < n; ++i) { 
            int key = a[i]; 
            int j = i - 1; 
  
            while (j >= 0 && a[j] > key) { 
                a[j + 1] = a[j]; 
                j = j - 1; 
            } 
            a[j + 1] = key; 
        } 
    } 
  
    static Arrays printArray(Integer[] arr) 
    {
    if(arr!=null){
        int n = arr.length; 
        for (int i = 0; i < n; ++i) 
            System.out.print(arr[i] + " "); 
        
    }
        return null;
  
    } 

}