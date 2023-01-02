package homework7;

import java.util.Scanner;

public class Class1Question4 {
    public static void main(String[] args) {
        /*
        Question 4:
        Iki farkli class olusturun. Birinci klasta kullanicidan; bir alisveris
        sitesinden 5 adet urunu ucretsiz satin alabilme hakki kazandigini soyleyin
        ve bu 5 urunu isteyin(main method icinden). Ikinci class’ da ise bu urunleri
        bir array adi altinda listeleyen, nonstatic, String array donuslu, 5
        argumanli bir method olusturunuz. Birinci class’ ta method call uzerinden
        alacaginiz array verisinin elemanlarini tektek yazdirin. Daha sonra bu
        arrayin icindeki elemanlari alfabetik siraya gore yazdirin. Arrayin 3.
        Index’indeki elemani istediginiz bir urunle degistirin. Degistirdiginiz
        urunun array icinde olup olmadigini sorgulayin, eger urun arrayin icinde
        ise “degisiklik yaptiginiz urun listeye eklenmistir.” Ibaresini consol’a yazdirin.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Web sitemizden 5 adet urunu ucretsiz satin alabilme hakki kazandiniz."+
                "Lutfen 5 adet urun seciniz");
        System.out.println("Lutfen 1. urunu seciniz");
        String urun1= scan.nextLine();
        System.out.println("Lutfen 2. urunu seciniz");
        String urun2= scan.nextLine();
        System.out.println("Lutfen 3. urunu seciniz");
        String urun3= scan.nextLine();
        System.out.println("Lutfen 4. urunu seciniz");
        String urun4= scan.nextLine();
        System.out.println("Lutfen 5. urunu seciniz");
        String urun5= scan.nextLine();



    }
}
