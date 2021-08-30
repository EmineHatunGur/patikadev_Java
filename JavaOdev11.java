/*
Hava Sıcaklığına Göre Etkinlik Önerme
Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.
Koşullar :
Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
*/


import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {
       int sicaklik;
       Scanner input=new Scanner(System.in);
        System.out.println("sıcaklık değri giriniz.");
        sicaklik=input.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak yapmaya gidebilirsiniz...");
        }
        else if (sicaklik>=5 && sicaklik<=15){
            System.out.println("Sinemaya gidebilirsiniz...");
        }
        else if (sicaklik>15 && sicaklik<=25){
            System.out.println("Piknik yapabilirsiniz...");
        }
        else if (sicaklik>25){
            System.out.println("Yüzmeye gidebilirsiniz...");
        }
        else{
            System.out.println("Sizin için etkinlik bulamadık...");
        }



    }
}

