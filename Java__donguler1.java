/*Ödev
Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.*/




import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {


        int deger,toplam=0,sayac=0;
        double ortalama;
        Scanner input=new Scanner(System.in);
        System.out.println(" değeri giriniz: ");
        deger= input.nextInt();

        for (int i=0;i<=deger;i++){
            if (i%3 ==0 && i% 4==0){
                sayac++;
               toplam+=i;

                ortalama=toplam/sayac;
                System.out.println("toplam:" + toplam);
                System.out.println("ortalama:"+ ortalama);

            }

            else{
                System.out.println("3 ile 4 e  tam bölünmüyor");
            }
        }


    }
}
