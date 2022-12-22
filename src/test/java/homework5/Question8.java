package homework5;

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        /*
        8) Kullanicidan toplamak icin sayi isteyin ve sayilarin toplami 500’e
        ulasincaya kadar sayi istemeye devam edin. Toplam 500’e ulastiginda
        veya gectiginde sayilarin toplami ve kac sayi girildigini yazdirin.(do while
        dongusu ile)
         */
        Scanner scan= new Scanner(System.in);

        int sayi=0;
        int toplam=0;
        int sayac=0;

        do {
            System.out.println("Toplanmak uzere bir sayi giriniz");
            sayi= scan.nextInt();
            toplam+=sayi;
            sayac++;
        }while (toplam<=500);

        System.out.println("Girilen sayilarin toplami : "+toplam);
        System.out.println(("Girilen sayilarin adedi : "+sayac));


    }
}
