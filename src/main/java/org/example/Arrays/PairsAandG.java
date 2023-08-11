package org.example.Arrays;

public class PairsAandG {
    public static void main(String[] args) {
        String str = "abcgag";
        System.out.println(pairs(str));

    }
    static int pairs(String str) {
        int c = 0;
        int ans = 0;
        for (int i = str.length()-1; i >= 0; i--) {
            if (str.charAt(i) == 'g') {
                c++;
            }
            if (str.charAt(i) == 'a') {
                ans += c;
            }
        }
        return ans;
    }
}
