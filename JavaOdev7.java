/*
Manav Kasa Programı

Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram 
değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

Meyveler ve KG Fiyatları
Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL
Örnek Çıktı
Armut Kaç Kilo ? :0
Elma Kaç Kilo ? :1
Domates Kaç Kilo ? :1
Muz Kaç Kilo ? :2
Patlıcan Kaç Kilo ? :3
Toplam Tutar : 21.68 TL
*/

import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
       double armutfiyat=2.14, elmafiyat=3.67,domatesfiyat=1.11,muzfiyat=0.95,patlıcanfiyat=5.00;
       double armut,elma,domates,muz,patlıcan,toplamfiyat;
       Scanner input = new Scanner(System.in);
       System.out.println("armut için kilo giriniz: " );
       armut= input.nextDouble();
       armutfiyat=armutfiyat*armut;
       System.out.println("elma için kilo girriniz: " );
       elma= input.nextDouble();
       elmafiyat=elma*elmafiyat;
       System.out.println("Domates için kilo giriniz: ");
       domates= input.nextDouble();
       domatesfiyat=domates*domatesfiyat;
       System.out.println("muz için kilo giriniz: ");
       muz= input.nextDouble();
       muzfiyat=muz*muzfiyat;
       System.out.println("patlıcan için kilo giriniz: ");
       patlıcan= input.nextDouble();
       patlıcanfiyat=patlıcan*patlıcanfiyat;
       toplamfiyat= armutfiyat+elmafiyat+domatesfiyat+muzfiyat+patlıcanfiyat;
       System.out.println("toplam fiyat: "+ toplamfiyat + "TL");

    }
}
