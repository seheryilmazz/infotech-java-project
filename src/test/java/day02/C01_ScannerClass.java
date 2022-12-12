package day02;

import java.util.Scanner;

public class C01_ScannerClass {

    public static void main(String[] args) {

        System.out.println("Hello World");

        Scanner scan=new Scanner(System.in);
        System.out.println("Byte degerinde bir tane sayi giriniz : ");
        int byteSayisi = scan.nextByte();
        System.out.println("byteSayisi");

        System.out.println("Integer degerinde bir tane sayi giriniz : ");
        int tamSayi = scan.nextInt();
        System.out.println("tamSayi");

        System.out.println("String bir ifade giriniz : ");
        String ifade2 = scan.nextLine();
        System.out.println(ifade2);

        //System.out.println("String bir ifade giriniz : ");
        //String ifade1 = scan.next();
        //System.out.println(ifade1);

        System.out.println("True mu False mu");
        boolean isTrue = scan.nextBoolean();
        System.out.println(isTrue);

		/*boolean dogru;
		int sayi;
		sayi=5;
		System.out.println(sayi);*/

        // System.in :Java sistemine girisi ifade ediyor.
        // System.out : Java sisteminden cikisi ifade ediyor.

    }
}
