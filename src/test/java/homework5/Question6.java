package homework5;

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*
        6) Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve toplam kac
        tane olduklarini ekranda yazdirin.(while dongusu ile)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = scan.nextInt();

        int bolen = 1;
        int tamBolenSayisi=0;


        while (bolen<=sayi){
            if (sayi%bolen==0){
                System.out.println(sayi+" sayisi " + bolen +"'e"+ " tam bolunur." );
                tamBolenSayisi++;
            }
            bolen++;
        }
        System.out.println("Bolen sayisi : "+tamBolenSayisi);
    }
}
