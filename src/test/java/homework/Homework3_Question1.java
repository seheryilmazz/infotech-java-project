package homework;

import java.util.Scanner;

public class Homework3_Question1 {
    public static void main(String[] args) {

        /*
        Kullanıcıdan uc tane tam sayı alalım ve maksimum sayıyı bulan java kodunu yazalım.
        Not: if else kullanalım...
         */

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

    }
}
