/*

Ödev

Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
Dizi : {15,12,788,1,-1,-778,2,0}
Girilen Sayı : 5
Girilen sayıdan küçük en yakın sayı : 2
Girilen sayıdan büyük en yakın sayı : 12
*/

import java.util.Arrays;                                                                  
import java.util.Scanner;                                                                 
                                                                                          
public class Main {                                                                       
                                                                                          
    public static void main(String[] args) {                                              
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};                                    
        Scanner scan = new Scanner(System.in);                                            
        System.out.println("Bir sayi giriniz: ");                                         
        int deger = scan.nextInt();                                                       
        int min = Arrays.stream(list).min().orElse(deger);                                
        int max = Arrays.stream(list).max().orElse(deger);                                
                                                                                          
        for (int i = 0; i < list.length; i++) {                                           
            if (deger < list[i]) {                                                        
                if (list[i] < max) {                                                      
                    max = list[i];                                                        
                }                                                                         
            }                                                                             
                                                                                          
            if (deger > list[i]) {                                                        
                if (list[i] > min) {                                                      
                    min = list[i];                                                        
                }                                                                         
            }                                                                             
        }                                                                                 
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);                
        System.out.println("Girilen sayıdan büyük en yakın sayı:" + max);                 
                                                                                          
    }                                                                                     
}                                                                                         
