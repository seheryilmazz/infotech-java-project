package homework4;

import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {

        /*
        Soru 4) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin.

        isim-soyisim : O*** K*****
        kart no : **** **** **** 1234
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Isminizi giriniz.");
        String ad = scan.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyad = scan.nextLine();
        System.out.println("Kredi kart numaranizi giriniz");
        String krediKartNo = scan.nextLine();

        ad = ad.substring(0,1).toUpperCase()+ad.substring(1,ad.length()).replaceAll("\\w","*");
        soyad = soyad.substring(0,1).toUpperCase()+soyad.substring(1,soyad.length()).replaceAll("\\w","*");
        krediKartNo = "****"+" "+"****"+" "+"****"+" "+krediKartNo.substring(12,krediKartNo.length());

        System.out.println("isim-soyisim : "+ad+" "+soyad+"\n"+"kart no : "+krediKartNo);

        //String cardNumber = inpt2.substring(0, inpt2.length() - 4).replaceAll("\\d", "*");
        //String cardNumber2 = inpt2.substring(inpt2.length() - 4, inpt2.length());

        //System.out.println("\n" + inptName2 + " " + inptSurname2);
        //System.out.println("\n" + cardNumber + cardNumber2);

        //System.out.println(ad);
        //System.out.println(soyad);
        //System.out.println(krediKartNo);






    }
}
