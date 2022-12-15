package homework;

import java.util.Scanner;

public class Homework3_Question6 {
    public static void main(String[] args) {
        /*
        6-Kullanicidan 100 uzerinden notunu isteyin.Not’u harf sistemine cevirip yazdirin.
        50’den kucukse “D”,
        50-60 arasi “C”,
        60-80 arasi “B”,
        80’nin uzerinde ise “A”.
        (If, else if, else kullanalim)
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("100 uzerinden bir not giriniz");
        int not=scan.nextInt();

        if (not<50){
            System.out.println("Notunuz : D");
        } else if (not<60) {
            System.out.println("Notunuz : C");
        } else if (not<80) {
            System.out.println("Notunuz : B");
        } else if (not<=100){
            System.out.println("Notunuz : A");
        } else {
            System.out.println("Gecerli not giriniz");
        }
    }
}
