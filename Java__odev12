/*
Sayıları Büyükten Küçüğe Sıralayan Program
Java koşullu ifadeler ile girilen 3 sayıyı büyükten küçüğe sıralayan program yapımı.

Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/



import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
       int a,b,c;
       Scanner input=new Scanner(System.in);
        System.out.println("a sayısını giriniz: ");
        a=input.nextInt();
        System.out.println("b sayısını giriniz: ");
        b= input.nextInt();
        System.out.println("c sayısını giriniz: ");
        c= input.nextInt();

        if (a<b && a<c){
            if(b<c){
                System.out.println("a<b<c");
            }
            else {
                System.out.println("a<c<b");
            }
        }
        else if (b<a && b<c){
            if (a<c){
                System.out.println("b<a<c");
            }
            else {
                System.out.println("b<c<a");
            }

        }
        else {
            if (a<b){
                System.out.println("c<a<b");
            }
            else {
                System.out.println("c<b<a");
            }
        }


    }
}
