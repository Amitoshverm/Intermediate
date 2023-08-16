package org.example.ArraysImtermediate1.Arrays2D;

public class Basics {

    /* FYI
    * We cannot add 2 matrices if they have different dimensions
    *
    *
    * */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] arr2 = {{9, 8, 7},
                {6, 5, 6},
                {3, 2, 1}};

        printDiagonals(arr);

//            int[][] ans = new int[3][3];
//
//            for (int i = 0; i < arr2.length; i++){
//                for (int j = 0; j < arr2.length; j++) {
//                    ans[i][j] = arr[i][j] + arr2[i][j];
//            }
//    }

//        printArray(ans);
//        printRowWiseSum(arr);
//        printColumnWiseSum(arr);
    }

    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void printRowWiseSum(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            System.out.println(sum);
        }
    }
    public static void printColumnWiseSum(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                sum += arr[j][i];
            }
            System.out.println(sum);
        }
    }
    static void printDiagonals(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);
        }
    }
}
