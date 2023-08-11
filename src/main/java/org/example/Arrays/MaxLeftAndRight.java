package org.example.Arrays;

import java.util.Arrays;

public class MaxLeftAndRight {
    public static void main(String[] args) {
        int[] arr = {1, 10, 5, 9, 3, 2};
        int[] leftMax = new int[arr.length];
        leftMax[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
        }
        System.out.println(Arrays.toString(leftMax));

        System.out.println(Arrays.toString(arr));
        int[] rightMax = new int[arr.length];
        rightMax[arr.length-1] = arr[arr.length-1];
        int j = 1;

        for(int i = arr.length-2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);

        }
        System.out.println(Arrays.toString(rightMax));
    }
}
