/*Dizideki Elemanları Sıralama
Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.
Senaryo
Dizinin boyutu n : 5
Dizinin elemanlarını giriniz :
1. Elemanı : 99
2. Elemanı : -2
3. Elemanı : -2121
4. Elemanı : 1
5. Elemanı : 0
Sıralama : -2121 -2 0 1 99 */



package com.company;                                              
                                                                  
import java.util.Arrays;                                          
import java.util.Scanner;                                         
                                                                  
public class Main {                                               
                                                                  
    public static void main(String[] args) {                      
                                                                  
        int[] arr = new int[5];                                   
        System.out.println("Dizinin boyutu: "+arr.length);        
        Scanner scan=new Scanner(System.in);                      
                                                                  
        for (int i = 0; i < arr.length; i++) {                    
             System.out.println("Dizi elemanını giriniz :");      
             int list=scan.nextInt();                             
            System.out.println(i+". Elemanı: "+list);             
        }                                                         
                                                                  
        for (int m=0;m<arr.length;m++){                           
            Arrays.sort(arr);                                     
            System.out.println(Arrays.toString(arr));             
        }                                                         
                                                                  
    }}                                                            
