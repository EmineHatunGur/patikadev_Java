/*Burç Bulan Program

Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.

*/



import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {

        int durum,day;
        Scanner input=new Scanner(System.in);
        System.out.println("bir durum belirleyin: ");
        durum=input.nextInt();
        System.out.println("burç için gün değeri giriniz:");
        day= input.nextInt();
        if (durum==1){
            if (day>=1 && day<=31){
                if(day<=21){
                    System.out.println("oğlak");
                }
                else{
                    System.out.println("kova");
                }
            }
            else{
                System.out.println("geçerli tarih girmediniz");
            }
        }
        else if (durum==2){
            if (day>=1 && day<=28){
                if(day<=19){
                    System.out.println("kova");
                }
                else{
                    System.out.println("balık");
                }
            }
            else{
                System.out.println("geçerli tarih girmediniz");
            }
        }
        else if(durum==3){
            if(day>=1 && day<=31){
                if(day<=20){
                    System.out.println("Balık");
                }
                else{
                    System.out.println("Koç");
                }
            }
            else{
                System.out.println("geçerli tarih girmediniz");
            }
        }
        else if(durum==4){
            if(day>=1 && day<=30){
                if(day<=20){
                    System.out.println("Koç");
                }
                else{
                    System.out.println("Boğa");
                }
            }
            else{
                System.out.println("geçerli tarih girmediniz");
            }
        }
        else if(durum==5){
            if(day>=1 && day<=31){
                if (day<=21){
                    System.out.println("Boğa");
                }
                else{
                    System.out.println("İkizler");
                }
            }
        }


    }
}
