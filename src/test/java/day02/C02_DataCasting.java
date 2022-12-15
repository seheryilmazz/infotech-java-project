package day02;

public class C02_DataCasting {

    public static void main(String[] args) {

        // Tip Donusumleri Kucukten Buyuge

        //Tip Donusumleri Buyukten Kucuge

        float ondalikliSayi1=(float)1.0;
        System.out.println(ondalikliSayi1);

        double ondalikliSayi2=2.0;

        long uzunSayi = 2147483647;

        double sayi = 4.5;
        int sayi1=(int)sayi;
        System.out.println(sayi1);
        System.out.println((int)6.5);

        //HEXADECIMAL ==>16'lik sistem web tasariminda renkleri tanimlamak icin kullaniliyor.

        System.out.println(0XFFFF);  //16'lik sistemde 65'e karsilik gelir

        char ch1='A';
        System.out.println(ch1);  //A verir

        char ch2 = 'A';
        System.out.println((int)ch2);  // 65 verir
        // A karakterinin ASCII tablosundaki degerini gosterir
        char ch3= '5';
        System.out.println(ch3);    // 5 verir.
        System.out.println((int)ch3);  // 53 ==> ASCII tablosunda 5'e karsilik gelen 53 degerini verir

        int z = '3'+'2';
        System.out.println(z);  // 101
        // ASCII tablosunda 3'3 karsilik gelen 51 ile 2'ye karsilik gelen 50 degerlerini topladi.

        int number = 15;
        number = 20;
        System.out.println(number);  //20
        sayi=25;
        System.out.println(sayi);

        final double piSayisi=3.14;
        System.out.println(piSayisi);
        // piSayisi=3; // final degeri degistiremeyiz. Bu ifadehata verir.

        //Matematisel islemler ve Modulus

        System.out.println(8+5+6-14);

        System.out.println(5/10);  // 0
        System.out.println((double)5/10); //0.5

        System.out.println(5.3 + 5);  //10.3

        System.out.println(4.5+6.2);  //10.7

        System.out.println(Math.pow(5, 3));
        System.out.println(Math.sqrt(49));

        int sayi2 = 5478;
        int birlerBasamagi = sayi2%10;  //8
        System.out.println(birlerBasamagi);
        int onlarBasamagi = (sayi2/10)%10;
        System.out.println(onlarBasamagi);
        int yuzlerBasamagi = (sayi2/100)%10;
        System.out.println(yuzlerBasamagi);
        int binlerBasamagi = (sayi2/1000)%10;
        System.out.println(binlerBasamagi);
        int toplam=birlerBasamagi+onlarBasamagi+yuzlerBasamagi+binlerBasamagi;
        System.out.println(toplam);
        System.out.println(birlerBasamagi);
        System.out.println(onlarBasamagi);

        int rakam = 5;
        int sonuc = rakam++ + 10;
        System.out.println(sonuc);

        System.out.println(rakam);
    }
}
