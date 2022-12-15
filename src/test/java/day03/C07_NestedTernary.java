package day03;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {

        // Condition ?     (Kod 1)                  :        (Kod 2) ;
        //            Condition ? (Kod 1):(Kod 2)  :  Condition ? (Kod 1):(Kod 2)

        // NESTED TERNARY

        /*
    Kullanicidan kadin icin 'k' yada erkek icin 'e' seceneklerinden birisini girmesini isteyiniz.
    Kadin<60--->Emekli olamaz
    Kadin>=60--->Emekli olabilir
    Erkek<65---->Emekli olamaz
    Erkek>=65---->Emekli olabilir
    yazdirin.
    */

        Scanner scan=new Scanner(System.in);

        System.out.println("Cinsiyeti giriniz e/k?");
        char cinsiyet = scan.next().charAt(0);

        System.out.println("Yasinizi giriniz?");
        short yas = scan.nextShort();

        // 1. YONTEM

        //String durum = cinsiyet == 'k' ? (yas>=60 ? "Kadin emekli olabilir." : "Kadin emekli OLAMAZ.")
        //                               : (yas>=65 ? "Erkek emekli olabilir" : "Erkek emekli OLAMAZ");

        //System.out.println("Son durum nedir?"+durum);

        // 2. YONTEM

        System.out.println(cinsiyet == 'k' ? (yas>=60 ? "Kadin emekli olabilir." : "Kadin emekli OLAMAZ.")
                                           : (yas>=65 ? "Erkek emekli olabilir" : "Erkek emekli OLAMAZ"));

        scan.close();
    }
}
