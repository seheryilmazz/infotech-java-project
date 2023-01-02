package day06;

public class C01 {

    String name = "Okan";
    int sayi = 10;

    //Static olmayan bir variable static bir methodun icinde kullanilamaz.
    //Class da ilk static variable'lar calismaya baslar.

    static String str = "Java";
    static int number = 55;

    public static void main(String[] args) {

        System.out.println(str); //static variable'lari static main methoddan cagirabiliyoruz.
        System.out.println(number);

        //System.out.println(name);//Hata veriyor.Static olmayan bir variable static bir methodun icinde kullanilamaz.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //System.out.println(i); // for parantezi icinde olmadigi icin i variable'ini burada kullanmayiz.
                               // Hata verir.
        double pi;
        // System.out.println(pi); //Hata verir. Cunku pi'ye deger atanmadi.
    }
    //public class class1{}

}


