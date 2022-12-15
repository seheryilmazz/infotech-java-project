package day03;

import java.util.Scanner;

public class C04_IfElseifElseStatement {

    public static void main(String[] args) {

       /* if () {} -----> Bu kosul saglanirsa sadece diger kosullara bakilmaz.

        else if () {}

        else if () {} .... istedigimiz kadar kosul ilave edebiliriz.

        else {} ----->Yukaridaki kosullar disindaki tum kosullar icin else blogu calisir.
        */

        /*
        Soru1:Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini
		yazdirin, sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi
		farkli isaretlere sahipse “farkli isaretlerde sayilarla islem yapamazsin” yazdirin,
		sayilardan sifira esit olan varsa “sifir carpmaya gore yutan elemandir”
		yazdirin.
		*/

        // durum1 ----> sayilar + + ise toplami
        // durum2 ----> sayilar - - ise carpimi
        // durum3 ----> sayilar + - ise “farkli isaretlerde sayilarla islem yapamazsin” yazdirin
        // duurm4 ----> sayilardan birisi=0 ise “sifir carpmaya gore yutan elemandir” yazdirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz?");
        int birinciSayi= scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz?");
        int ikinciSayi= scan.nextInt();

        if (birinciSayi>0 && ikinciSayi>0) {
            System.out.println("Sayilarin toplami= "+(birinciSayi+ikinciSayi));
        } else if (birinciSayi<0 && ikinciSayi<0) {
            System.out.println("Sayilarin carpimi= "+(birinciSayi*ikinciSayi));
        } else if (birinciSayi*ikinciSayi<0) {
            System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
        }else {
            System.out.println("sifir carpmaya gore yutan elemandir");
        }
    }
}
