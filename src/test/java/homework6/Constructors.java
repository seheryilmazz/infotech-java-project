package homework6;

import java.util.Scanner;

public class Constructors {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir akilli telefon markasi giriniz");
        System.out.println("Akilli telefonun modelini giriniz");
        System.out.println("Akilli telefonun fiyatini giriniz");
        int fiyat = scan.nextInt();
        String marka = scan.nextLine();
        String model = scan.nextLine();





        AkilliTelefon akilliTelefon1=new AkilliTelefon();
        akilliTelefon1.marka = "iPhone";
        akilliTelefon1.model= "14 Pro Max";
        akilliTelefon1.isletimSistemi="iOS";
        akilliTelefon1.fiyatTl=50000;
        akilliTelefon1.kameraCozunurluguMp=48;
        akilliTelefon1.bataryaKapasitesiSaat=29;
        akilliTelefon1.ramKapasitesiGb=128;

    }
}
