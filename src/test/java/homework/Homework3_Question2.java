package homework;

import java.util.Scanner;

public class Homework3_Question2 {

    public static void main(String[] args) {

        /*
        2-Kullanıcıdan bir gün girmesini isteyelim.
        a.  Eger girilen gun hafta sonu ise tekrar kontrol edelim
        Cumartesi ise Cumartesi ve hafta sonu, Pazar ise Pazar ve
        hafta sonu yazdıralım.
        b. Degil ise gün hafta ici yazdıralım.
        1. Note: equals ile karsilastiralim
        2. Nested ternary kullanalım...
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Sadece Ilk Harfi buyuk olmak uzere bir gun adi giriniz");
        String gunAdi = scan.nextLine();

        String str =gunAdi.equals("Cumartesi") || gunAdi.equals("Pazar") ?
                (gunAdi.equals("Cumartesi") ? "Cumartesi ve hafta sonu" : "Pazar ve hafta sonu")
                : "Hafta ici";
        System.out.println(str);




    }
}
