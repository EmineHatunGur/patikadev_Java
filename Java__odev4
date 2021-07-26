/*Taksimetre Programı
Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.
*/

import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {

        int km,taksimetre=10;
        double kmtotal=2.20,total,ucret;
        Scanner input = new Scanner(System.in);
        System.out.println("km degerini giriniz: ");
        km = input.nextInt();

        total= kmtotal * km;
        ucret=total+taksimetre;
        System.out.println("ücret :" + ucret);

        if(ucret<20){
            System.out.println("en az 20 tl ödeyeceksiniz.");
        }
        else{
            System.out.println("normal ücret ne ise onu ödeyeceksiniz."+ ucret);
        }




    }
}
