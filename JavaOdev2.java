/*KDV Tutarı Hesaplayan Program
Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
(Not : KDV tutarını 18% olarak alın)
KDV'siz Fiyat = 10;
KDV'li Fiyat = 11.8;
KDV tutarı = 1.8;
Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/


import java.util.Scanner;

public class ornek {
    public static void main(String[] args) {
      double Fiyat, Kdvoranı,kdvFiyat,KDV=0.18,KDV1=0.08;
     Scanner sc =new Scanner(System.in);
        System.out.println("fiyat giriniz: ");
        Fiyat=sc.nextDouble();
        if(Fiyat > 0 || Fiyat <= 1000){
          KDV=0.18;
            Kdvoranı = KDV * Fiyat;
            kdvFiyat=Kdvoranı+Fiyat;
            System.out.println("KDV ORANI: " + Kdvoranı);
            System.out.println("Kdv fiyat: " + kdvFiyat);
        }
        else if(Fiyat > 1000){
            KDV1=0.08;
            Kdvoranı = KDV1 * Fiyat;
            kdvFiyat=Kdvoranı+Fiyat;
            System.out.println("KDV ORANI: " + Kdvoranı);
            System.out.println("Kdv fiyat: " + kdvFiyat);
        }
        else{
            System.out.println("Hatalı değer giridiniz: ");
        }

    }
}
