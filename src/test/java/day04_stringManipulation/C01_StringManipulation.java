package day04_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C01_StringManipulation {

    public static void main(String[] args) {

        //Concatination

        String name = "Ali";
        String soyIsim = "Can";
        System.out.println(name+soyIsim); //AliCan
        System.out.println(name+" "+soyIsim);  //Ali Can
        System.out.println(name.concat(" ").concat(soyIsim)); //Ali Can

        String ifade="computer";
        int sayi = 20;
        double sayi1 = 3.14;
        boolean isTrue = true;

        System.out.println(ifade+sayi); //computer20
        System.out.println(ifade+isTrue);  //computertrue
        //System.out.println(sayi+isTrue);  //CTE hatasi verir

        //CharAt

        String str = "Bugun hava cok guzel";
        System.out.println(str.charAt(6));  // h
        char yeniString = str.charAt(2);
        System.out.println(yeniString);     // g

        String ifade1 = "" ;
        String ifade2 = null;
        System.out.println(ifade1);
        System.out.println(ifade2);  //null

        //ToLowerCase_ToUpperCase

        String isim = "InfoTech Academy";
        String buyukIsim = isim.toUpperCase();
        System.out.println(buyukIsim);  // INFOTECH ACADEMY
        System.out.println(buyukIsim.toLowerCase()); //infotechacademy

        String str1 = "Ince Mehmet" ;
        System.out.println(str1.toLowerCase(Locale.forLanguageTag("Tr")));
        System.out.println(str1.toLowerCase(Locale.FRANCE));
        //Diller'deki alfabeyi alabilmesi icin Locale.FRANCE yapiyoruz
        // Turkce karakterler icin Turkce listede olmadidigi icin Locale.forLanguageTag("Tr") olarak giriyoruz.

        String ifade3 = "UZUM";
        System.out.println(ifade3.toLowerCase(Locale.forLanguageTag("Tr")));  //uzum
        String ifade4 = "Ozan";
        System.out.println(ifade4.toLowerCase(Locale.forLanguageTag("Tr")));

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Ifade giriniz");
        //String str3 = scan.next().toLowerCase();
        //System.out.println(str3);

        // Equals

        String str2 ="Ali";
        String str4 ="ali";
        String str5 = new String("Ali");
        String str6 = "Ali";
        String str7 = new String("Ali");

        System.out.println(str2==str4);  //false
        System.out.println(str2==str5);  //false
        System.out.println(str2==str6);  //true

        System.out.println(str2.equals(str5));
        System.out.println(str2.equals(str4.toUpperCase()));
        System.out.println(str5 == str7);  //false

        //==  ----->Referans adresine ve icerisindeki degerlerin esit olup olmadigina bakiyor.
        // equals ----> Sadece icerisindeki degerlerin esit olup olmadigina bakiyor.

        //EqualsIgnoreCase

        String a = "Ali";
        String b = "ali";
        String c = new String("Ali");
        String d = "Ali";

        System.out.println(a.equalsIgnoreCase(b)); //true

        // length

        String e = "Bugun hava cok guzel";
        System.out.println(e.length());  //20
        System.out.println(e.charAt(19));
        System.out.println(e.charAt(e.length()-1));
        System.out.println(e.charAt(e.length()-3));

        // IndexOf

        String cumle = "Calisirsaniz java ogrenmek cok kolay";
        System.out.println(cumle.indexOf('a'));
        System.out.println(cumle.indexOf("a"));
        System.out.println(cumle.indexOf("J"));
        System.out.println(cumle.indexOf("java"));
        System.out.println(cumle.indexOf("java",20));
        System.out.println(cumle.indexOf("java",5));

        // LastIndexOf

        System.out.println(cumle.length());
        System.out.println((cumle.lastIndexOf("o")));
        System.out.println();
        System.out.println(cumle.indexOf("o",32));

        //Contains

        System.out.println(cumle.contains("g"));

        //StartsWith

        //Verilen String'in istenen karakterle baslayip baslamadigini kontrol eder. T/F doner.

        String ifade5 = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(ifade5.startsWith("Calis")); //True
        System.out.println(ifade5.indexOf("J"));
        System.out.println(ifade5.startsWith("Java", 14));

        //EndsWith

        //Verilen String'in istenen karakterle bitip bitmedigini kontrol eder. T/F doner.

        String ifade6="Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(str.endsWith("kolay"));
        System.out.println(str.endsWith(ifade6));

        // isEmpty

        String aa = "Calisirsaniz, Java ogrenmek cok kolay";
        System.out.println(aa.isEmpty());
        String aaa = " ";
        System.out.println(aaa.isEmpty());

        //isBlank

        System.out.println(aaa.isBlank());

        //Replace

        String str8 = "Java ogrenmek cok kolay";
        System.out.println(str8.replace('a','x'));
        System.out.println(str8.replace("Java", "C#"));
        System.out.println(str8.replace("o","a"));

        //ReplaceAll
        //regex'leri replaceAll'da kullanabiliyoruz.
        System.out.println(str8.replaceAll("_","a"));

        /*String regex="";
        String mesaj = "Merhabalar";
        mesaj=mesaj.replaceAll(regex,"_");
        System.out.println(mesaj); */

        String str9 = "Java ogrenmek cok kolay";
        System.out.println(str.replaceAll(" ", "_"));

        //ReplaceFirst

        String str10 = "Java ogrenmek cok kolay";
        System.out.println(str10.replaceFirst("a","e"));

        //Substring

        String str11="Java ogrenmek cok kolay";
        System.out.println(str11.substring(14));
        System.out.println(str11.substring(14,20));

        //trim

        String str12="    Merhaba Java   ";
        System.out.println(str12.trim());  //Bastaki ve sondaki bosluklari kirpar
















    }
}
