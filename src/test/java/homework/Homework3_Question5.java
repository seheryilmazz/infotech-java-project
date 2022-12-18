package homework;

import java.util.Scanner;

public class Homework3_Question5 {

    public static void main(String[] args) {
        /*
        5-Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin.
         (D, d, 3, ~, @, !, ...) (ip ucu: ascii tablosu)
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        if ((karakter>=65 && karakter<=90) || (karakter>=97 && karakter<=122)){
            System.out.println("Girilen karakter bir harftir");
        } else {
            System.out.println("Girilen karakter bir harf degildir.");
        }
        int asciiDegeri=karakter;
        System.out.println(asciiDegeri);

    }
}
