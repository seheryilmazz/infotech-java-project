package homework7;

public class StudentQuestion3 {

    int number;
    String name;
    static String college = "ITS";

    StudentQuestion3(int r, String n, String college){
        this.number = r;
        this.name = n;
        this.college = college;
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
        StudentQuestion3 s1 = new StudentQuestion3(111,"Karan","MIT");
        StudentQuestion3 s2 = new StudentQuestion3(222,"Aryan","Harvard");
                                       //Tahmin
        System.out.println(s1.number); // 111
        System.out.println(s2.number); // 222

        System.out.println(s1.name);   // Karan
        System.out.println(s2.name);   // Aryan

        System.out.println(s1.college);// Harvard
        System.out.println(s2.college);// Harvard
    }
}
