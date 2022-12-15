package day03;

public class C02_IfStatement {

    public static void main(String[] args) {

        int sayi = 10;

        if (sayi==10){ //----> Sart true ise suslu parantezdeki kod blogu calisir.
            System.out.println("sayi="+sayi);
        }
        if (sayi==11){ //----> Sart false ise suslu parantezdeki kod blogu calismaz.
            System.out.println("sayi="+sayi);
        }
        if (true){
            System.out.println("sayi="+sayi); // true doner. output 10'dur.
        }
        if (false){
            System.out.println("sayi="+sayi); //  Kod calismaz.konsol da birsey yazdirmaz.
        }

        // if (Sart) {kod blogu}  sart true ise kod blogu calisir, degilse kod blogu calismadigi icin
        // konsol da hicbirsey yazdirmaz.
    }
}
