package homework7;

public class Class2Question4 {

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
    Class1Question4 secilenUrunler = new Class1Question4();
    String urunListesi = new String();
    //String secilenUrunler[] = {"cep telefonu","televizyon","utu","bulasik makinesi","airfry"};
    //urunlistesi.

    public String[] hediyeUrunler(String urun1, String urun2, String urun3, String urun4, String urun5) {
        String arr[] = {urun1, urun2, urun3, urun4, urun5};

        return arr;


    }
}