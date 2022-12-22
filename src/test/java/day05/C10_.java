package day05;

public class C10_ {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if (i==29){
                break;
            }
            System.out.println(i);
            if (i%2==1){
                System.out.println("Birinci if");
            }
            if (i%2==0){
                System.out.println("Ikinci if");
            }

        }
    }
}
