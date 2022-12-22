package homework5;

import java.util.Scanner;

public class Question1_3 {
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
        emailKontrol(true,true,true);
        boolean mainsonuc=true;
        System.out.println(mainsonuc);
    }

    public static boolean emailKontrol(boolean sart1,boolean sart2, boolean sart3) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen e-mail hesabinizi giriniz");
        String email = scan.nextLine();
        sart1 = email.contains("@");
        sart2 = email.contains("gmail");
        sart3 = email.endsWith("@gmail.com");

        if (!sart1) {
            System.out.println("gecersiz email");
        }
        if (!sart2) {
            System.out.println("lutfen gmail adresinizi girin");
        }
        if (!sart3) {
            System.out.println("Yazimda bir sorun var, maili kontrol ediniz");
        }
        if (sart1 && sart2 && sart3) {
            System.out.println("Email adresinizi dogru girdiniz ");
        }
        boolean sonuc = false;
        return sonuc;
    }





}
