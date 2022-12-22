package homework5;

public class Question2 {
    public static void main(String[] args) {
        /*
        2) ”InfotechAcademy1234...!’^.+” String ifadesinde,
        a.kac harf
        b.kac rakam
        c.kac ozel karakter oldugunu ekrana yazdıran
        karakterSay() metodunu yazınız.
         */
        karakterSay();

    }
    public static void karakterSay(){

        String str = "InfotechAcademy1234...!’^.+";

        int harfSayaci=0;
        int rakamSayaci=0;
        int ozelKarakterSayaci=0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z'){
                harfSayaci++;
            } else if (str.charAt(i)>='0' && str.charAt(i)<='9'){
                rakamSayaci++;
            } else {
                ozelKarakterSayaci++;
            }
        }
        System.out.println(harfSayaci);
        System.out.println(rakamSayaci);
        System.out.println(ozelKarakterSayaci);
        System.out.println(str.length());

    }
}
