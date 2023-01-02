package day08;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] cokBoyutlu2={{11,12,13} , {21,22,23} , {31,32,33}};

        int[][] cokBoyutlu3=new int[][]{{11,12,13} , {21,22,23} , {31,32,33}};

        System.out.println(cokBoyutlu2[0][0]);   //11
        System.out.println(cokBoyutlu2[1][1]);   //22
        int[][] dizi4 = {{11,22,33,44},{55,66,77,88}};

        for (int i = 0; i < cokBoyutlu2.length; i++) {  //Dizinin satir sayisi
            for (int j = 0; j < cokBoyutlu2[0].length; j++) {  //Dizinin sutun sayisi
                System.out.print(cokBoyutlu2[i][j]+"\t");
            }
            System.out.println("");
        }
        System.out.println(dizi4[1][4]);

        for (int i = 0; i < dizi4.length; i++) {
            for (int j = 0; j < dizi4[0].length; j++) {
                System.out.println(dizi4[i][j]);

            }

        }
    }


}
