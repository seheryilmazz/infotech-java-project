package homework5;

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        /*
        4) Kullanıcıdan aldıgınız 5 basamaklı sayının rakamlarının toplamını
        yazdıran programi for döngüsü ile yazınız.
         */

            Scanner scan =new Scanner(System.in);
            System.out.println("5 basamakli bir sayi giriniz.");
            int sayi = scan.nextInt();

            int toplam = 0;

        if (sayi>9999 && sayi<100000){

            for (int i = 1; i < 6; i++) {
                int kalan = sayi % 10;
                toplam+=kalan;
                sayi = sayi/10;
            }
            System.out.println("Girilen 5 basamakli sayinin rakamlari toplami : " + toplam);
        } else {
            System.out.println("Hatali giris yaptiniz. Yeniden 5 basamakli bir sayi giriniz. ");
        }

        /* int toplam = 0 ;

        Scanner scan =new Scanner(System.in);
        System.out.println("5 basamakli bir sayi giriniz.");
        int sayi = scan.nextInt();

        while(sayi<10000 || sayi>99999){

            System.out.println("Hatali giris yaptiniz. Yeniden 5 basamakli bir sayi giriniz. ");
            sayi = scan.nextInt();

        }
        for (int i = 1; i < 6; i++) {
            int kalan = sayi % 10;
            toplam+=kalan;
            sayi = sayi/10;
        }
        System.out.println("Girilen 5 basamakli sayinin rakamlari toplami : " + toplam);

         */

    }
}
