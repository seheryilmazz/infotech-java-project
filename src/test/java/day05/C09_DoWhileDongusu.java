package day05;

public class C09_DoWhileDongusu {
    public static void main(String[] args) {
        //Diger dongulerden farki sudur = Sart true olmasa da kod blogu bir kez calisir.
        int a = 1;

        do {
            System.out.println(a);
            a++;
        }
        while (a<=3);

        //9'dan 190'a kadar 7'nin kati olan tum tamsayilari ekrana yazdirin.

        int x=9;

        do{
            if (x%7==0){
                System.out.println(x);
            }
            x++;

        }
        while(x<=190);


    }
}
