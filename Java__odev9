/*Java koşullu ifadeler ile kullanıcı adı ve şifreyi kontrol eden program yapımı.

Ödev
Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu 
şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana "Şifre oluşturulamadı, 
lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
*/



import java.util.Scanner;
public class ornek {
    public static void main(String[] args) {

        String user="Java",pass="12345";
        String username,password;
        Scanner input=new Scanner(System.in);
        System.out.println("username değeri giriniz: ");
        username= input.nextLine();
        System.out.println("Password değeri giriniz:");
        password=input.nextLine();

        if (username.equals(user) && password.equals(pass )){
            System.out.println("Geçerli giriş: ");

        }
        else if(username.equals(user) && password!=pass){
            System.out.println("şifre yanlıştır.Yeni şifre oluşturun:");
            String yenisifre=input.nextLine();
            if (yenisifre != password || yenisifre != pass){
                System.out.println("Şifre oluşturulmadı,lütfen başka şifre giriniz:");

            }
            else{
                System.out.println("şifre oluşturuldu:"+ yenisifre);
            }
        }


    }
}
