package homework5;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        /*
        1)Kullanicidan e mail hesabini girmesini isteyiniz. Bu e mail’ i
        olusturacaginiz method' a arguman olarak gonderip asagidaki kurallara
        gore e mail kontrolu yapiniz.

        -@ isareti icermiyorsa “gecersiz email” yazdirin
        -@gmail icermiyorsa “lutfen gmail adresinizi girin” yazdirin
        -@gmail.com ile bitmiyorsa “Yazimda bir sorun var, maili kontrol ediniz”
        yazdirin.
         */

        eMailKontrol();


    }
    public static void eMailKontrol(){

        System.out.println("Lutfen e-mail hesabinizi giriniz.");

        while (true) {
            Scanner scan = new Scanner(System.in);
            String eMail = scan.nextLine();


            if (!eMail.contains("@")) {
                System.out.println("Gecersiz email");
                continue;
            }
            if (!eMail.contains("@gmail")) {
                System.out.println("lutfen gmail adresinizi girin");
                continue;
            }
            if (!eMail.endsWith("@gmail.com")) {
                System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
                continue;
            }
            System.out.println("E-Mail hesabinizi dogru girdiniz : " + eMail);
            break;
        }

    }
}
