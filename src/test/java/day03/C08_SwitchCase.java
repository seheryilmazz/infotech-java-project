package day03;

import java.util.Scanner;

public class C08_SwitchCase {

    public static void main(String[] args) {

        // double, float, boolean switch'te kullanilamaz? Neden? (Arastirma odevi)
        // En az bir case olmasi gerekir
        // Default yazilmasa da olur
        // Break kullanilmazsa uygun case den baslayip sonuna kadar yazdirir.

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir gun ismi giriniz?");
        String gunAdi = scan.nextLine();

        switch (gunAdi){

            case "pazartesi" :
                System.out.println("Gun Pazartesi");
                break;

            case "sali" :
                System.out.println("Gun Sali");
                break;

            case "carsamba" :
                System.out.println("Gun Carsamba");
                break;

            case "persembe" :
                System.out.println("Gun Persembe");
                break;

            case "cuma" :
                System.out.println("Gun Cuma");
                break;

            case "cumartesi" :
                System.out.println("Gun Cumartesi");
                break;

            case "pazar" :
                System.out.println("Gun Pazar");
                break;

            default:
                System.out.println("Hatali giris yaptiniz");
        }

    }
}
