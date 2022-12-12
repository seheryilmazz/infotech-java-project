package homework;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

       /* /*1- Java’da kacis karakterlerini (Escape) arastiriniz.
             Grup calismasinda bununla ilgili ornekler yaziniz.

             Escape Charecters:

             \b --> Önceki karakteri silmeye yarar
             \t --> Tab
             \r --> Satır başı yapar
             \n --> Satır atlar
             \f -->
             \' --> Tek tirnak
             \" --> Çift tırnak
             \\ --> /
             */
        System.out.println("xyz\b degiskeni");     //xy degiskeni
        System.out.println("Ali\tmerhaba");       //Ali	merhaba
        System.out.println("abcde\rMerhaba");     //Merhaba
        System.out.println("Ali merhaba\nAyse merhaba");  //Ali merhaba
                                                          //Ayse merhaba
        System.out.println("Java\fJava");   //JavaJava
        System.out.println("Kodlama icin \'Java\' ogrenilmelidir."); //Kodlama icin 'Java' ogrenilmelidir.
        System.out.println("Kodlama icin \"Java\" ogrenilmelidir."); //Kodlama icin "Java" ogrenilmelidir.
        System.out.println("C:\\Users\\alosy\\OneDrive\\Desktop\\githubEclipse");

       // ===================================================================
        /*
        2- Create three String variables, first is for your first name; second is for your lastname;
            third is for your address. Print them on the console like; the first and the last name will be in
            the first line, and the address will be in the second line.
         */
        String myName="Seher";
        String mySurname="Yilmaz";
        String myAddress="Kemaloz Mah. 1.Cigdem Sokak No:18/10 USAK";
        System.out.println(myName+" "+mySurname+"\n"+myAddress);

        //=========================================================================
        /*
        3- Type a program which converts the mile to kilometer. Mile value will be entered by user. (Use double)
        Hint 1: km = mile x 1.6
        Hint 2: To get double, use nextDouble()
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir \'Mile value\' degeri giriniz.");
        double mileValue= scan.nextDouble();
        double kmValue=mileValue*1.6;
        System.out.println(mileValue+" mile "+kmValue+" km'dir.");

        //=================================================================================
        /*
        4- Type a program which converts the hours to seconds. Hours value will be entered by user. (Use long)
        Hint 1: second = hour x 60 x 60
        Hint 2: To get long, use nextLong()
         */
        System.out.println("Lutfen bir \'Hours value\' degeri giriniz.");
        long hoursValue= scan.nextLong();
        long secondValue=hoursValue*60*60;
        System.out.println(hoursValue+" saat "+secondValue+" saniye'dir.");
        //====================================================================================
        /*
        5- Kullanicidan karenin bir kenar uzunlugunu alin ve
        karenin cevresini ve alanini hesaplayip yazdirin.
         */
        System.out.println("Karenin kenar uzunlugunu giriniz");
        double kareninKenarUzunlugu=scan.nextDouble();
        double kareninCevresi=kareninKenarUzunlugu*4;
        System.out.println("Karenin Cevre Uzunlugu : "+kareninCevresi);
        double kareninAlani=kareninKenarUzunlugu*kareninKenarUzunlugu;
        System.out.println("Karenin Alani : "+kareninAlani);
        //======================================================================================
        /*
        6- Kullanicidan dikdortgenler prizmasinin uzun, kisa kenarlarini
        ve yuksekligini isteyip prizmanin hacmini hesaplayip yazdirin.
         */
        System.out.println("Dikdortgenler prizmasinin uzun kenarini giriniz");
        double uzunKenar=scan.nextDouble();
        System.out.println("Dikdortgenler prizmasinin kisa kenarini giriniz");
        double kisaKenar=scan.nextDouble();
        System.out.println("Dikdortgenler prizmasinin yuksekligini giriniz");
        double yukseklik=scan.nextDouble();
        double hacim = uzunKenar*kisaKenar*yukseklik;
        System.out.println("Dikdortgenler prizmasinin hacmi : "+hacim);
        //==============================================================================
        /*
        7- Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin.
        Isminiz : Okan
        Soyisminiz : Kaplan
        Kursumuza katiliminiz alinmistir, tesekkur ederiz
         */

        System.out.println("Adinizi giriniz");
        String ad= scan.next();
        System.out.println("Soyadinizi giriniz");
        String soyAd= scan.next();
        System.out.println("Isminiz : "+ad+"\nSoyisminiz : "+soyAd+
                "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
    }
}
