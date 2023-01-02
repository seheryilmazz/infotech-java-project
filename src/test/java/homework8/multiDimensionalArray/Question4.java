package homework8.multiDimensionalArray;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
        /*
        Soru4) Asagidaki multidimensional array’in ic array’lerindeki tum elemanlarin toplamini birer
        birer bulan ve herbir sonucu yeni bir array’in elemani yapan ve yeni array’I ekrana yazdiran bir
        program yaziniz.
        Ornek;{{1,2,3},{4,5},{6,7}}==>1+2+3=6 , 4+5=9 , 6+7=13==>output:{6,9,13}
         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6, 7}};
        int[] yeniarr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                yeniarr[i] += arr[i][j];
            }
        }
        System.out.println(Arrays.toString(yeniarr));

        for (int i = 0; i < yeniarr.length; i++) {
            System.out.println(yeniarr[i] + " ");
        }
    }
}
