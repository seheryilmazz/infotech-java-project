package homework7;

public class StaticMemberQuestion3 {
    static int x;
    int y;

    StaticMemberQuestion3(){
        x+=2; //--->x=2, x=4
        y++;  //--->y=1, y=1
    }
    static int getSquare(){
        return x * x;
    }
    public static void main(String[] args) {
        /*
         Question-3:
        - Asagida verilmis olan sayifalardaki kodlari inceleyin, sonuclari tahmin edin,
        - daha sonra bu kodlari eclipse’ te yazarak dogru sonucu consol’a yazdirin.
        - Tahmininiz ile gercek sonucu karsilastirin.
        Yalnis tahmin yaptiysaniz sebebini kendi kendinize bulmaya calisin, bulamazsaniz grup
        toplantinizda arkadaslarinizla ve mentorlerinizle birlikte inceleyiniz.
         */
        StaticMemberQuestion3 sm1 = new StaticMemberQuestion3();

        StaticMemberQuestion3 sm2 = new StaticMemberQuestion3();

        int z = sm1.getSquare();//z=4, sm2.y=1

        System.out.println("-x" + z + "-y" + sm2.y);  //-x16-y1




    }
}

