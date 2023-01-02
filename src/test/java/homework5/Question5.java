package homework5;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        /*
        5) Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis
        degeri dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir baslangic degeri giriniz");
        int baslangicDegeri = scan.nextInt();
        System.out.println("Bir bitis degeri giriniz");
        int bitisDegeri = scan.nextInt();
        //int sayi=baslangicDegeri;

        while (baslangicDegeri<=bitisDegeri){

            if (baslangicDegeri % 2 == 0) {
                System.out.print(baslangicDegeri + " ");
            }
            baslangicDegeri++;
        }

        /*Scanner input= new Scanner(System.in);

        System.out.println("Başlangıç değerini giriniz!");
        int baslangıc = input.nextInt();

        System.out.println("Bitiş değerini giriniz!");
        int bitis = input.nextInt();

        while(!(baslangıc==bitis+1)) {
            if(baslangıc%2==0)
                System.out.println(baslangıc);

            baslangıc++;
        }*/

    }
}
