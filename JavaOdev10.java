/*
Sınıfı Geçme Durumu

Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.*/



import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik,toplam=0,sayac=0;
        double ortalama;
        Scanner input =new Scanner(System.in);
        System.out.println("ders notunu giriniz: ");
        matematik=input.nextInt();
        System.out.println("ders notunu giriniz: ");
        fizik=input.nextInt();

        System.out.println("ders notunu giriniz: ");
        turkce=input.nextInt();

        System.out.println("ders notunu giriniz: ");
        kimya=input.nextInt();

        System.out.println("ders notunu giriniz: ");
        muzik=input.nextInt();

        if(matematik>=0  && matematik<=100) {
            toplam += matematik;
            sayac++;


        }
        if (fizik >= 0 && fizik <= 100) {
            toplam += fizik;
            sayac++;


        }
        if(turkce>=0 && turkce<=100){
            toplam+=turkce;
            sayac++;

        }
        if(kimya>=0 && kimya<=100){
            toplam+=kimya;
            sayac++;

        }
        if (muzik>=0 && muzik<=100){
            toplam+=muzik;
            sayac++;

        }

        System.out.println(toplam);
        ortalama=toplam/sayac;
        System.out.println(ortalama);
        if (ortalama>=55){
            System.out.println("Sınıfı geçtiniz: ");
        }
        else {
            System.out.println("geçmek için ortalamanız yeterli değil:");
        }


    }
}
