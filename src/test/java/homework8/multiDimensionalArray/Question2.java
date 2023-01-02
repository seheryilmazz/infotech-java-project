package homework8.multiDimensionalArray;

public class Question2 {
    public static void main(String[] args) {
        /*
        Soru 2) Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana
        yazdiran bir program yaziniz.
        { {1,2,3}, {4,5}, {6} }
         */
        int[][] arr = {{1, 2, 3}, {4, 5}, {6}};

        //int arrSonElemanlarinCarpimi=arr[0][2]*arr[1][1]*arr[2][0];  //90
        //System.out.println(arrSonElemanlarinCarpimi);

        int carpim = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(arr[i][arr[i].length - 1]);
                carpim *= arr[i][arr[i].length - 1];
                System.out.println(carpim);

            }

        }

    }
}
