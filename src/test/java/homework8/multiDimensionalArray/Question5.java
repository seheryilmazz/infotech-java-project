package homework8.multiDimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {

        //Soru5)Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir cumle yaziniz");
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Cumledeki kelime sayisi :" + arr.length);

    }
}
