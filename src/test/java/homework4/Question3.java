package homework4;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir isim giriniz.");
        String isim = scan.nextLine();
        System.out.println("Bir soyisim giriniz");
        String soyIsim = scan.nextLine();

        if (isim.length()>soyIsim.length()){
            System.out.println("Isim soyisimden daha uzun");
        } else {
            System.out.println("Soyisim isimden daha uzun");
        }

    }
}
