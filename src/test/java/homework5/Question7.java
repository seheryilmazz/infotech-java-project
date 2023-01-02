package homework5;

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        /*
        7) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin
        0’a basmasini soyleyin.
        Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini ve girdigi pozitif
        sayilarin toplaminin kac oldugunu yazdirin.(do while dongusu ile)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplama islemi icin pozitif bir tamsayi giriniz.\nIslemi bitirmek icin 0'a basiniz.");
        int sayi=0;
        int toplam = 0;
        int sayac=0;

        do{
            sayi=scan.nextInt();
            if(sayi<0){
                System.out.println("Negatif tamsayi girilemez. Tekrar bir pozitif tamsayi giriniz.");
                continue;
            }
            sayac++;
            toplam+=sayi;

        }while (sayi!=0);


        System.out.println("Girilen pozitif tamsayilarin toplami : "+toplam);
        System.out.println("Girilen sayi adedi : "+ (sayac-=1));

    }
}
