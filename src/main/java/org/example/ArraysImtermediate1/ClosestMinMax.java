package org.example.ArraysImtermediate1;

public class ClosestMinMax {
    public static void main(String[] args) {
        int[] arr = {2, 2, 6, 4, 5, 1, 5, 2, 6, 4, 1};
        System.out.println(minMax(arr));

    }

    static int minMax(int[] arr) {

        int ans = arr.length, max = 0, min = 0;
        // getting max and min
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(arr[0], arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(arr[0], arr[i]);
        }
        int maxIndex = 2*arr.length;
        int minIndex = 2*arr.length;
        for (int i = arr.length-1; i >= 0; i--) {
            if (arr[i] == max) {
                ans = Math.min(ans, minIndex - i + 1);
                maxIndex = i;
            }
            else if (arr[i] == min) {
                ans = Math.min(ans, maxIndex - i + 1);
                minIndex = i;
            }
        }
        return  ans;




        // brute force solutions ->

//        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, ans = 0;
//        for (int i = 0; i < arr.length; i++) {
//            max = Math.max(max, arr[i]);
//        }
//        for (int i = 0; i < arr.length; i++) {
//            min = Math.min(min, arr[i]);
//        }
//        System.out.println(max+" "+min);
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == max) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] == min) {
//                        ans = Math.min(j-i+1, Integer.MAX_VALUE);
//                        break;
//                    }
//                }
//            } else if (arr[i] == min) {
//                for (int j = i + 1; j < arr.length; j++) {
//                    if (arr[j] == max) {
//                        ans = Math.min(j-i+1, Integer.MAX_VALUE);
//                        break;
//                    }
//                }
//            }
//        }
//        return ans;
    }
}
