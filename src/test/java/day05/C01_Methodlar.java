package day05;

public class C01_Methodlar {

    public static void main(String[] args) {
        myFirstMethod(); //Method call

        int maindekiSonuc =method2(2,3);
        System.out.println(maindekiSonuc);

        method2(3,"hava");
        method2("hava",3);

        //System.out.println(method2("gunesli","hava"));

    }
    // access Modifier: public / protected / default / private
    //Method signature=method adi, methodun arguman sayisi ve arguman cesidi.

    public static void myFirstMethod(){ //Return Type'i donussuz void
        //
        System.out.println("First method calisti");

    }

    public static int method2(int sayi1, int sayi2){ //() icine argumanlari yaziyoruz.

        int sonuc = sayi1 + sayi2;

        return sonuc;

    }

    public static int method2(int sayi1, String str){ //() icine argumanlari yaziyoruz.

        int sonuc = sayi1;

        return sonuc;

    }
    public static int method2(String str, int sayi1){ //() icine argumanlari yaziyoruz.

        int sonuc = sayi1;

        return sonuc;

    }
    /*public static int method2(String str, int sayi1){ //() icine argumanlari yaziyoruz.

        int sonuc = sayi1;

        return sonuc;
    } */
    /*public static String method2(String str1, String str2){ //() icine argumanlari yaziyoruz.

        String kelimeBirlestirme=str2.concat(str1);

        return sonuc;
    } */

}
