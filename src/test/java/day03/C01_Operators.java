package day03;

public class C01_Operators {

    public static void main(String[] args) {

        //Relational operators(Karsilastirma operatorleri

        // ==  ----> Esit midir. Ifadenin sag ve sol tarafinin esit olup olmadigini karsilastirir.

        boolean sonuc1 = 5+2 == 7;
        System.out.println(sonuc1);  // True doner.(Sonuc bize boolean doner. Bir atama degildir.)

        boolean sonuc2 = 5*2== 7;
        System.out.println(sonuc2);  // False doner

        // != esit degildir.

        boolean sonuc3 = 5+2 != 7;   //  5+2 != 7 ----> 7, 7'ye esit degildir anlamina gelir.
        System.out.println(sonuc3);  // False doner.

        boolean sonuc4 = 5*2== 7;    // True doner.
        System.out.println(sonuc4);

        boolean sonuc5 = "Ahmet" != "Ahmet";
        System.out.println(sonuc5);   // false doner

        // > ve >=

        boolean sonuc6 = 5+2 >= 7;
        System.out.println(sonuc6);  // True

        boolean sonuc7 = 5+2 >= 7;
        System.out.println(sonuc7);  // False

        // < ve <=

        boolean sonuc8 = 5+2 <= 7;
        System.out.println(sonuc8); //True

        boolean sonuc9 = 5+2 < 7;
        System.out.println(sonuc9); // False

        //===========================================================

        // Conditional Operatorler (Sart operatorleri)

        // && VE

        boolean sonuc10 = (5+2 == 7) && (4+3 != 5); // --->Sartlarin tamami True ise output true doner.
        //                   T       &&     T  ----------->  True doner.

        boolean sonuc11 = (5+2 == 7) && (4+3 != 5) && (9 == 4+6);
        //                   T       &&     T      &&    F  ----> False doner.

        //  ||  OR ---> Sartlarin tamami false ise false doner. Bir tanesi bile true ise true doner.

        boolean sonuc12 = (5+2 == 8) || (4+3 != 5) || (9 == 4+6);
        //                   F       ||     T      ||    F  ----> True doner.

        boolean sonuc13 = (5+2 == 8) || (4+3 != 7) || (9 == 4+6);
        //                   F       ||     F      ||    F  ----> False doner.

        // & VE  ----> Ilk kosul false olsa bile diger tum sartlari da sirasiyla kontrol eder.
        // && VE ----> Ilk kosul false ise diger sartlari kontrol etmez. Dolayisiyla daha hizli calisir.
        // Her ikisinde de tum sartlarin true olmasi lazimki true donsun.

        // | OR ----> Ilk kosul true olsa bile diger tum sartlari da sirasiyla kontrol eder.
        // || OR ----> Ilk kosul true ise diger sartlari kontrol etmez. Dolayisiyla daha hizli calisir.
        // Her ikisinde de sadece bir sartin true olmasi, output'un true donmesi icin yeterlidir.










    }
}
