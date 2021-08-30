/*Basit Hesap Makinesi Yapımı

Java koşullu ifadeler ile basit hesap makinesi yapımı.

Ödev

Videodaki hesap makinesini switch-case kullanarak yapınız.
*/



import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {

        int sayi1,sayi2;
        double islem;
        Scanner input=new Scanner(System.in);
        System.out.println("sayı 1 değeri giriniz: ");
        sayi1= input.nextInt();
        System.out.println("sayi 2 değri giriniz:");
        sayi2=input.nextInt();

        System.out.println("bir işlem için 1=toplama ,2=çarpma,3=çıkarma ile 4=bölme arasın da rakam giriniz: ");

        int deger= input.nextInt();

        switch (deger){
            case 1:
                islem=sayi1+sayi2;
                System.out.println("toplama "+ islem);
                break;
            case 2:
                islem=sayi1*sayi2;
                System.out.println("çarpma"+ islem);
                break;
            case 3:
                islem=sayi1-sayi2;
                System.out.println("çıkarma"+ islem);
                break;
            case 4:
                if (sayi2 != 0){
                    islem=sayi1 / sayi2;
                    System.out.println("bolme"+ islem);
                }
                else {
                    System.out.println("sayı2 değeri 0 dan farklı olmalıdır...");
                }
                break;
            default:
                System.out.println("yanlış değer giridiniz:");
        }

    }
}
