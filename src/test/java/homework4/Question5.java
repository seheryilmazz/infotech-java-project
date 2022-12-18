package homework4;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*
        5) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari sagliyorsa “Sifre
        basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin”
        yazdirin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz.");
        String sifre = scan.nextLine();

        boolean kontrol=true;

        if (!(sifre.charAt(0)>='A' && sifre.charAt(0)<='Z')){
            System.out.println("Sifre buyuk harf ile baslamalidir.");
            kontrol=false;
        }

        if (!(sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z')){
            System.out.println("Sifre kucuk harf ile bitmelidir.");
            kontrol=false;
        }

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemelidir.");
            kontrol=false;
        }

        if (sifre.length()<8){
            System.out.println("Sifre uzunlugu en az 8 karakter olmalidir.");
            kontrol=false;
        }

        if (kontrol){
            System.out.println("Sifre basari ile tanimlandi.");
        } else {
            System.out.println("Islem basarisiz,lutfen yeni bir sifre girin");
        }
    }
}
