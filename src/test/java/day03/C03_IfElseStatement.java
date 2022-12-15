package day03;

import java.util.Scanner;

public class C03_IfElseStatement {

    public static void main(String[] args) {

        // if (sart) {if kod blogu}  ----> Sart true ise if in kod blogu calisir
        // else {else kod blogu} -----> Sart false ise else in kod blogu calisir

        int a=2;
        int b=3;

        if (a<=b){
            System.out.println("a degeri b degerinden kucuk veya esittir");
        } else {
            System.out.println("a degeri b degerinden buyuktur.");
        }  // -----> Sart true oldugu icin if blogu calisir.

        if (a<=b){
            System.out.println("if blogu calisir");
        } else {
            System.out.println("else blogu");
        }  // -----> Sart true oldugu icin if blogu calisir.


        if (a>=b){
            System.out.println("a degeri b degerinden buyuk veya esittir");
        } else {
            System.out.println("a degeri b degerinden kucuktur.");
        }  // -----> Sart false oldugu icin else blogu calisir.

        if (a<=b){
            System.out.println("if blogu");
        } else {
            System.out.println("else blogu calisir");
        }  // -----> Sart true oldugu icin if blogu calisir.

        //SORU1-Kullanicidan yasini sorunuz. Yasi 18'den buyuk ve esit ise satisi yapiniz, degilse yapmayiniz.

        Scanner scan=new Scanner(System.in);

        System.out.println("Yasinizi giriniz?");
        int yas= scan.nextInt();

        if (yas>=18) {
            System.out.println("Sigara ve alkol satisi serbesttir.");
        } else {
            System.out.println("Sigara ve alkol satisi yasaktir.");
        }

        //SORU2-Kullanicidan bir ucgenin uc kenar uzunlugunu aliniz. Kenarlari esitse eskenar ucgen, degilse
        // eskenar ucgen degildir yazdiriniz.

        System.out.println("Ucgenin 1. kenar uzunlugunu giriniz?");
        int kenar1= scan.nextInt();

        System.out.println("Ucgenin 2. kenar uzunlugunu giriniz?");
        int kenar2= scan.nextInt();

        System.out.println("Ucgenin 3. kenar uzunlugunu giriniz?");
        int kenar3= scan.nextInt();

        if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Ucgenimiz ESKENAR ucgendir.");
        }else {
            System.out.println("Ucgenimiz ESKENAR ucgen degildir.");
        }




    }
}
