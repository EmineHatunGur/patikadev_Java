/* Ödev
Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

Formül
Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
𝑢 = (a+b+c) / 2
Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)*/


import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {

        int a,b,c;
         double u,alan;

        Scanner input = new Scanner(System.in);
        System.out.println("a degerini giriniz: ");
        a = input.nextInt();
        System.out.println("b degerini giriniz: ");
        b= input.nextInt();
        System.out.println("c değeri giriniz: ");
        c= input.nextInt();
        u= (a+b+c) / 2;
        System.out.println(u);
        alan  = Math.sqrt( u * (u- a) * (u - b) * (u - c));
        System.out.println("alan: "+ alan);
    }
}
