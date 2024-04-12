package vn.test.interview;

import java.util.ArrayList;

public class Problem2 {

    public static void main(String[] args) {
        String str1 = "abcdef";
        String str2 = "bcdeft";
        String result = null;

        if (str1.length() >= str2.length()) {
            result = longestCommonSubstring(str1, str2);
        } else {
            result = longestCommonSubstring(str2, str1);
        }
        System.out.println("Longest common substring: " + result);
    }

    public static String longestCommonSubstring(String str1, String str2) {

        String longestCommonSubStr = "";
        int longestCommonSubStrLen = 0;

        for (int i = 0; i < str1.length(); i++) {

            String str = null;
            int longest = 0;
            for (int j = 0; j < str2.length(); j++) {

                if (i + j < str1.length() && str1.charAt(i + j) == str2.charAt(j)) {
                    longest++;
                    str = str1.substring(i, i + j + 1);
                } else {
                    break;
                }
            }


            if (longest > longestCommonSubStrLen) {
                longestCommonSubStrLen = longest;
                longestCommonSubStr = str;
            }
        }

        return longestCommonSubStr;
    }
}
