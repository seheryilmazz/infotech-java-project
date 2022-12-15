package homework;

import java.util.Scanner;

public class Homework3_Question7 {
    public static void main(String[] args) {
        /*
        7-Kullanıcıdan 4 basamakli birsayi girmesini isteyin.
        Girdiği sayi 5’e bölünüyorsa son rakamını control edin.
        Sonrakamı 0 ise ekrana “5’e bölünen çift sayı” yazdırın.
        Sonrakamı 0 değilise “5’e bölünen tek sayı” yazdırın.
        Girdiği password 5’e bölünmüyorsa ekrana “Tekrar deneyin” yazdırın.
        (Nested Ternary kullanalim)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir sayi giriniz");
        short sayi=scan.nextShort();

        String password=sayi%5==0 ? (sayi%10==0 ? "5'e bolunen cift sayi" : "5'e bolunen tek sayi") : "Tekrar deneyin";
        System.out.println(password);
    }
}
