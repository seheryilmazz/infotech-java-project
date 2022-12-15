package day03;

import java.util.Scanner;
import java.util.concurrent.locks.Condition;

public class C06_Ternary {
    public static void main(String[] args) {

       // if (Condition){Code 1} else {Code 2}
       // Condition? Code 1 : Code 2

        // Bir sayi giriniz. Sayi ciftse "Sayi CIFTTIR", sayi tekse "Sayi TEKTIR" yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("Bir sayi giriniz");
        long sayi = scan.nextLong();
        String sonuc = sayi%2 == 0 ? "Sayi CIFTTIR" : "Sayi TEKTIR" ;
        //               T         ise Sayi CIFTTIR                yazdirir
        //               F         ise                 Sayi TEKTIR yazdirir
        System.out.println("Sonuc= "+sonuc);

        int sonuc2 = (int) sayi%2 == 0 ? (int)sayi+10 : (int) sayi-10;
        System.out.println("int sonucumuz= "+sonuc2);



    }
}
