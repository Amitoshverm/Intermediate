package org.example.ArraysImtermediate1;

public class EquilibriumIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 3, 7};
        System.out.println(equilibriumIndx(arr));
    }
    static int equilibriumIndx(int[] arr) {
        int c = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i];
        }
        int leftSum = 0, rightSum = 0;
        for (int i = 0; i < arr.length; i++) {
            leftSum += arr[i];
            rightSum = totalSum - leftSum + arr[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}
