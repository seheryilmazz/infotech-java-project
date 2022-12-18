package homework;

import java.util.Scanner;

public class Homework3_Question3 {

    public static void main(String[] args) {

        /*
        3-Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle
        baslayan gun isimlerini yazdirin.
        Ornek ilkHarf=P output = “Pazar, Pazartesi veya Persembe”
        ilkHarf=S output = “Sali”  (switch case default ile yapalim)
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir gun seciniz ve sectiginiz gunun ilk harfini buyuk harf olarak giriniz");
        char gununilkHarfi = scan.next().charAt(0);

        switch (gununilkHarfi){

            case 'P' :
                System.out.println("Pazar, Pazartesi, Persembe");
                break;

            case 'S' :
                System.out.println("Sali");
                break;

            case 'C' :
                System.out.println("Carsamba, Cuma, Cumartesi");
                break;

            default:
                System.out.println("Hatali giris yaptiniz");
        }
    }
}
