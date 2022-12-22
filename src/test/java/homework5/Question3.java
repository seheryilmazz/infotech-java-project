package homework5;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        /*
        3) Kullanicidan uslu sayi hesabi icin iki adet integer sayi isteyin. integer
        donus tipli, iki argumanli bir uslu sayi hesaplama methodu olusturun.
        Argumanlardan birini taban sayisi icin digerini ise ussu icin kullanin.
        Islemin sonucunu main method’ dan verilen komutla yazdirin.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("1. int sayi'yi giriniz");
        int sayi1=scan.nextInt();
        System.out.println("2. int sayi'yi giriniz");
        int sayi2=scan.nextInt();

        int sonuc = usluSayiHesaplama(sayi1,sayi2);
        System.out.println(sayi1 + "^" + sayi2 + " = " + sonuc);



    }
    public static int usluSayiHesaplama(int sayi1, int sayi2){

        int sonuc = (int)Math.pow(sayi1, sayi2);
        return sonuc;

    }
}
