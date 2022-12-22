package homework5;

import java.util.Scanner;

public class Question1_2 {
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

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail hesabinizi giriniz.");
        String eMail = scan.nextLine();
        boolean kontrol=true;


        if (!eMail.contains("@")) {
            System.out.println("Gecersiz email");
            kontrol=false;

        }
        if (!eMail.contains("@gmail")) {
            System.out.println("lutfen gmail adresinizi girin");
            kontrol=false;

        }
        if (!eMail.endsWith("@gmail.com")) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
            kontrol=false;

        }
        if (kontrol){
            System.out.println("E-Mail hesabinizi dogru girdiniz : " + eMail);

        } else {
            System.out.println("E-Mail hesabinizi tekrar giriniz");
        }



    }


    }






