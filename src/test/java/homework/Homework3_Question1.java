package homework;

import java.util.Scanner;

public class Homework3_Question1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu yazalım.
        Not: if else kullanalım...
         */

        /* 1. YONTEM
        Scanner scan = new Scanner(System.in);
        System.out.println("1.tamsayiyi giriniz");
        int x=scan.nextInt();
        System.out.println("2.tamsayiyi giriniz");
        int y=scan.nextInt();
        System.out.println("3.tamsayiyi giriniz");
        int z=scan.nextInt();

        if(x>y && x>z) {
            System.out.println("Maksimum sayi : "+ x);
        } else if (y>x && y>z) {
            System.out.println("Maksimum sayi : "+ y);
        } else {
            System.out.println("Maksimum sayi : "+ z);}
            */

        //2.YONTEM
        /*Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, sayi3, enBuyuk;
        System.out.println("Ilk sayiyi giriniz : ");
        sayi1 = scan.nextInt();

        enBuyuk=sayi1;

        System.out.println("Ikinci sayiyi giriniz");
        sayi2 = scan.nextInt();

        if (sayi2>enBuyuk){enBuyuk=sayi2;}

        System.out.println("Ucuncu sayiyi giriniz");
        sayi3=scan.nextInt();

        if (sayi3>enBuyuk){enBuyuk=sayi3;}

        System.out.println("En buyuk sayi : "+enBuyuk);
        */

        Scanner scan = new Scanner(System.in);
        int sayi1, sayi2, sayi3, enBuyuk;
        System.out.println("Ilk sayiyi giriniz : ");
        sayi1 = scan.nextInt();

        System.out.println("Ikinci sayiyi giriniz");
        sayi2 = scan.nextInt();

        System.out.println("Ucuncu sayiyi giriniz");
        sayi3=scan.nextInt();

        enBuyuk=sayi1;

        if (sayi2>enBuyuk){
            enBuyuk = sayi2;
        } else if (sayi3>enBuyuk) {
            enBuyuk=sayi3;
        }else {
            System.out.println("En buyuk sayi : " + enBuyuk);
        }



        //if (sayi3>enBuyuk){sayi3=enBuyuk}

        //System.out.println("En buyuk sayi : "+enBuyuk);




    }
}
