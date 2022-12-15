package day03;

import java.util.Scanner;

public class C05_NestedIfStatement {
    public static void main(String[] args) {

        /*
    Kullanicidan kadin icin 'K' yada erkek icin 'E' seceneklerinden birisini girmesini isteyiniz.
    Kadin<60--->Emekli olamaz
    Kadin>=60--->Emekli olabilir
    Erkek<65---->Emekli olamaz
    Erkek>=65---->Emekli olabilir
    yazdirin.
    */

        //NESTED IF (ic ice if)

        Scanner scan=new Scanner(System.in);

        System.out.println("Cinsiyeti giriniz");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Yasinizi giriniz");
        short yas = scan.nextShort();

        if(cinsiyet=='K'){
            if (yas>=60){System.out.println("Kadin emekli olabilir");}
            else {System.out.println("Kadin emekli OLAMAZ");}
        }
        else {
            if(yas>=65){System.out.println("Erkek emekli olabilir");}
            else {System.out.println("Erkek emekli OLAMAZ");}
        }
    }
}
