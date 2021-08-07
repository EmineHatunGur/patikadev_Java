/* 0 ile 100 sayıları arasında random bir sayi belirlenecek.
5 tahmin hakkı verilecek ve gizli sayıya yakınlığı belirtilecek.Büyüktür ve küçüktür.*/


/*--------------------------------------------------------------------------------------*/


package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int random= (int) (Math.random()*100);
        int hak=5;
        System.out.println("Girdiğiniz değer 0-100 arasın da olmalıdır...");

        while(hak>0){

            Scanner deger=new Scanner(System.in);
            System.out.println("sayi giriniz: ");
            int sayi= deger.nextInt();

            if(sayi>0 && sayi<100){

                if(sayi==random){
                    System.out.println("Tebrikler bildiniz...");
                    break;
                }
                else if (sayi>random){
                    System.out.println("girdiğiniz değer gizli sayıdan büyüktür...");
                }
                else{
                    System.out.println("girdiğiniz değer gizli sayıdan küçüktür...");
                }
                System.out.println("Kalan hak..."+ hak);


            }
            else{
                System.out.println("Sayi 0 ve 100 arasın da bir değer değil");
            }
            hak--;




        }
        if (hak==0){
            System.out.println("hakkınız kalmadı..");

        }


    }
}




