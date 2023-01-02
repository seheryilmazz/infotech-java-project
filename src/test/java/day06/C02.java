package day06;

import java.util.Scanner;

public class C02 {

    static String product = "Bilgisayar";
    static int id = 1000;
    static int stokMiktari = 100;
    static String marka;
    String islemciTipi;
    String ekranBoyutu;
    String ramBilgisi;

    public static void main(String[] args) {
        System.out.println(product);
        System.out.println(id);
        //System.out.println(ekranBoyutu); hata verir.

        Scanner giris =new Scanner(System.in); // static olmayan variable'lari kullanmak icin obje uretmemiz lazim

        C02 object1 = new C02();
        System.out.println(object1.ekranBoyutu);
        System.out.println(object1.ramBilgisi);

    }

    public static void staticMethod(){
        System.out.println(stokMiktari);
        //System.out.println(ekranBoyutu); hata verir.


    }

    public static void staticOlmayanMethod(){
        System.out.println(product); // static olmayan methoddan static methoda ulasilabilir.
       //System.out.println(ekranBoyutu); //static olmayan variable'a static olmayan methoddan ulasamiyoruz.

    }

}
