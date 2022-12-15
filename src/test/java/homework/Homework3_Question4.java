package homework;

import java.util.Scanner;

public class Homework3_Question4 {

    public static void main(String[] args) {
        /*
        4-Kullanicidan bir gun alin. Eger gun;
         “Cuma” ise ekrana “Muslumanlar icin kutsal gun” yazdirin.
         “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin.
         “Pazar” ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin.
         (switch case default ile yapalim)
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir gun giriniz");
        String gun= scan.nextLine();

        switch (gun){
            case "Cuma":
                System.out.println("Muslumanlar icin kutsal gun");
                break;
            case "Cumartesi":
                System.out.println("Yahudiler icin kutsal gun");
                break;
            case "Pazar":
                System.out.println("Hristiyanlar icin kutsal gun");
                break;
            default:
                System.out.println("Semavi dinler icin kutsal gun degil");
        }
    }
}
