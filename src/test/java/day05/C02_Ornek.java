package day05;

import java.util.Scanner;

public class C02_Ornek {
    public static void main(String[] args) {

        /*
        Kullanicidan bir sayi aliniz.
        - Bu sayinin tek mi cift mi oldugunu,
        - Sifirdan buyuk mu kucuk mu oldugunu, ayrica ve
        - 100'den buyukse birler, onlar ve yuzler basamagindaki rakamlarin toplamini,
        - 100'den kucukse sadece 1'ler basamagini yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        soru1(sayi);

    }

    public static void soru1(int sayi){

        if (sayi%2==0){

            System.out.println("Sayi CIFTTIR.");
        } else {
            System.out.println("Sayi TEKTIR.");
        }

    }
}
