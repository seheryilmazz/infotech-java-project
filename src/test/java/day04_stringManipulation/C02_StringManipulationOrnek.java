package day04_stringManipulation;

import java.util.Scanner;

public class C02_StringManipulationOrnek {
    public static void main(String[] args) {

        //Kullanicidan bir cumle ve metin girmesini isteyin. Cumlenin icindeki metne gore
        //1.cumle metni icermiyor
        //2. cumlede metin 1 kez varsa 1 kez iceriyor yazsin
        //3. fazla varsa birden fazla iceriyor yazdirsin

    /*Algoritma;
    1. Kullanicidan veri girisi yapilacak
    2. metin e cumleyi karsilastir
    3.yoksa yok yaz
    4.birtane varsa 1 kez yaz
     */
        //cumle : bugun

        Scanner scan = new Scanner(System.in);
        System.out.println("Cumle giriniz");
        String cumle = scan.nextLine();
        System.out.println("metin giriniz");
        String metin = scan.next();

        if (!cumle.contains(metin)){
            System.out.println("Cumle girilen metni icermiyor");
        } else {
            int ilkIndex = cumle.indexOf(metin);
            int ikinciIndex = cumle.indexOf(metin, ilkIndex + 1);

            if (ikinciIndex == (-1)) {
                System.out.println("Metin cumlede sadece 1 defa geciyor");
            } else {
                System.out.println("Metin cumlede 1'den fazla gecmektedir.");
            }
        }

        // 2. YONTEM

        int ilkIndex1 = cumle.indexOf(metin);
        int sonIndex1 = cumle.lastIndexOf(metin);

        if(ilkIndex1==(-1)){
            System.out.println("Metin cumle icinde yoktur");
        } else if (ilkIndex1==sonIndex1) {
            System.out.println("Metin cumle icinde 1 defa vardir");
        }else {
            System.out.println("Birden fazla metin vardir");
        }

    }

}
