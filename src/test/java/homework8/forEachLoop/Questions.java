package homework8.forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Questions {
    public static void main(String[] args) {
        /*
        Soru 1:
        Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Soru 2:
        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
        Soru 3:
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
        bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
        Soru 4:
        Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz.
        ipucu: split()
         */

        /*
        Soru 1:
        Bir integer array olusturunuz ve bu array’deki tum sayilarin carpimini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */

        int[] numbers = {1, 3, 5, 7, 9};
        int carpim = 1;

        for (int number : numbers) {
            carpim *= number;
        }
        System.out.println(carpim);

        /*
        Soru 2:
        Bir integer list olusturunuz ve bu list’deki tum sayilarin karesinin toplamini For-each loop
        kullanarak bulunuz. Sonucu ekrana yazdiriniz.
         */

        int[] sayilar = {2, 3, 4, 5};

        int toplam = 0;

        for (int sayi : sayilar) {
            toplam += sayi * sayi;
        }
        System.out.println(toplam);

        /*Soru 3:
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For-each loop kullanarak
        bulunuz. Sonucu ekrana yazdiriniz.
        Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz.
         */

        String[] sehirler1 = {"Izmir", "Usak", "Erzurum", "Adana", "Ankara", "Istanbul"};
        String[] sehirler2 = {"Malatya", "Trabzon", "Istanbul", "Afyon", "Usak", "Bartin"};

        List<String> ortakElemanlar = new ArrayList<>();

        for (String sehir1 : sehirler1) {
            for (String sehir2 : sehirler2) {
                if (sehir1 == sehir2) {
                    ortakElemanlar.add(sehir1);
                }
            }
        }
        System.out.println(ortakElemanlar);
        if (ortakElemanlar.isEmpty()) {
            System.out.println("Ortak Eleman Yok");
        }
        /*
        Soru 4:
        Bir String olusturunuz, bu String’deki character’leri for-each loop kullanarak yazdiriniz.
        ipucu: split()
         */
        String cumle = "Yeni Yiliniz Kutlu Olsun";
        String[] karakterler = cumle.replace(" ","").split("");
        for (String karakter : karakterler) {
            System.out.print(karakter+"\t");
        }
    }
}
