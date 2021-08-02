/*Not Ortalaması Hesaplayan Program


Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

Not : If ve Else kullanılmayacak...*/

import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
        int Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik;
        Scanner sc =new Scanner(System.in);
        System.out.println("Matematik notunu giriniz: ");
        Matematik = sc.nextInt();

        System.out.println("Fizik notunu giriniz:");
        Fizik= sc.nextInt();

        System.out.println("Kimya notunu giriniz: ");
        Kimya = sc.nextInt();

        System.out.println(" Türkçe notunu giriniz: ");
        Türkçe = sc.nextInt();

        System.out.println("Tarih notunu giriniz: ");
        Tarih= sc.nextInt();

        System.out.println("Müzik notunu giriniz: ");
        Müzik = sc.nextInt();


        int toplam = Matematik+Fizik+Kimya+Türkçe+Tarih+Müzik;
        double ortalama= toplam/6;
        System.out.println("ortalama:"+ ortalama);

        boolean deger = ortalama >= 60 ;
        System.out.println("sınıfı geçti:" + deger);
        boolean deger2 = ortalama < 60 ;
        System.out.println("sınıfta kaldı: " + deger2);
    }

}
