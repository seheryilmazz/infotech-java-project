package homework5;

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {

        /*
    9 Kullanicidan pozitif bir rakam girmesini isteyin ve girilen rakama gore
    carpim tablosu olusturun. Ornek,kullanici 3 girerse,
    1 2 3
    2 4 6
    3 6 9
    (ic ice for ile) [Zor seviye – Yapamazsaniz onemli deil.]
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir rakam giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi; i++) {
            for (int j = 1; j <=sayi ; j++) {
                System.out.print(j + "*" + i + "=" + (j * i) + "\t"+"\t");
                //System.out.print((j*i)+ " ");
            }
            System.out.println();
        }
    }
}
