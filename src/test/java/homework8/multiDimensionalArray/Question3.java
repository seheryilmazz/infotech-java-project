package homework8.multiDimensionalArray;

public class Question3 {
    public static void main(String[] args) {
        /*
        Soru 3) Asagidaki multi dimensional array’lerin ic array’lerinde ayni index’e sahip elemanlarin
        toplamini ekrana yazdiran bir program yaziniz.
        arr1 = { {1,2}, {3,4,5}, {6} } ve arr2 = { {7,8,9}, {10,11}, {12} }
         */

        int arr1[][] = {{1, 2}, {3, 4, 5}, {6}};
        int arr2[][] = {{7, 8, 9}, {10, 11}, {12}};

        arr1[0][0] = 1;
        arr2[0][0] = 7;

        arr1[0][1] = 2;
        arr2[0][1] = 8;

        arr1[1][0] = 3;
        arr2[1][0] = 10;

        arr1[1][1] = 4;
        arr2[1][1] = 11;

        arr1[2][0] = 6;
        arr2[2][0] = 12;


        int number = 0;
        for (int i = 0; (i < arr1.length) && (i < arr2.length); i++) {
            for (int j = 0; (j < arr1[i].length) && (j < arr2[i].length); j++) {
                System.out.println(arr1[i][j] + arr2[i][j]); //aynı indexdeki elemanların toplamını yazdırdım
                number += arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println(number); //sonuç

    }
}
