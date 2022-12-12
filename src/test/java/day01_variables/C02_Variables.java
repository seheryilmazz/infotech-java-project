package day01_variables;

public class C02_Variables {

    public static void main(String[] args) {

        //Primitive Data Types
        //Primitive data turleri kucuk harfle baslar.
        //byte < short < int < long < float < double ===> Kucukte buyuge siralama

        // char / boolean

        boolean isTrue= true; //Hafiza'da 1 bit'lik yer kaplar.
        //boolean isTrue= false;
        boolean isCold= true;

        char ilkHarf='a'; // character 'a','A','1','8',' ','%','$','+', space(bosluk).
        // a ile A ayni karakter degildir.
        char tekRakam= '7';
        char ozelKarakter='$';
        char ozelKarakter1= '\'';
        System.out.println(ozelKarakter1);   // output '
        char space= ' ';

        int toplama = tekRakam +3;
        System.out.println(toplama);   // 55+3 = 58 yazdirir.
        // tekRakam = '7'; ===> '7' nin ascii tablosundaki degeri 55'dir.
        // her char karakterinin ascii tablosunda bir sayisal deger karsili vardir.

        // \ ===> sola yatik slash onundeki tek tirnagin karakter oldugunu belirtir.

        byte age = 73;  //Hafizada 8 bit alan kapsar.

        byte limitUstDeger = 127;   // -128>= byte <= 127

        byte ustDeger = Byte.MAX_VALUE;
        System.out.println(ustDeger);   // output >127

        byte altDeger = Byte.MIN_VALUE;
        System.out.println(altDeger);   // output >-128

        short ilceNufusu = 27432;  // Hafizada 16 bit alan kapsar.  max value = +32767, min value= -32768
        System.out.println(ilceNufusu);
        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);

        // Short ==> Class   , ctrl'ye basip mouse'a sol click yaparsak class aciliyor.
        // short ==> Data turu

        int maas =    2000000000   ;   // integer, 32 bit alan kapsar.
        // Value'nun saginda ve solunda bosluk birakilabilir.
        long dataType = 3500000000000000000L;
        // integer sayisiyla karismasin diye sayinin sonuna l veya L harfi konur.

        System.out.println(Long.MIN_VALUE);  // -9223372036854775808
        System.out.println(Long.MAX_VALUE);  //  9223372036854775807

        float reelSayi = 2.123456789012345F;  // double sayisiyla karismsin diye sayinin sonuna f veya F konur.
        System.out.println(reelSayi);  // 2.1234567

        // noktadan sonra 7 basamak hassasiyetle calisir. 32 bit.

        float reelSayi1 = 0.123456789012345F;
        System.out.println(reelSayi1);  // 0.12345679

        double dbl = -2.12345678901234567890;
        System.out.println(dbl);  //

        double dbl1 = 0.12345678901234567890;  // noktadan sonra 17 basamak hassasitetle calisir. 64 bit.
        System.out.println(dbl1);  //

        // Non-primitive data type

        String adres = "Yildiz Koleji, 10 numara, Cankaya Ankara #";
        String telNo = "5324748899";
        String telNo1 = "F";  // Bu artik bir char degildir. String deger'dir. Dolayisiyla ascii tablosunda karsiligi yoktur.

        // String bir class'dir. Non-primitie bir datadir. Char'la karistirmayin.

        byte money;  // "money", "Money", "MONEY" ucu de farklidir. Java case sensitive'dir.

        float hisse;
        // variable isimleri kucuk harfle baslar, kelime grubu olusturulacaksa camel case kullanilir.
        // ageJohn, firstName vb.
        // Harflerin yaninda  $, _ , Rakam eklenebilir.
        // Rakamda bir istisnamiz ar, rakam variable name'in ilk karakteri olamaz.
        // Variable ismi olarak Java'ya ozel terimler kullanilamaz.

        // Stack ==>small , Heap ==> huge
        // primitive ==> value , non-primitive ==> value + method icerir.
        // Primitive data turleri stack (small) memory'de value(2'lik sistemde 0 1 olarak) olarak saklanir.
        // Non-primitive data turlerinin referanslari stack memory'de, value'lari heap memory'de (huge)saklanir.
    }
}
