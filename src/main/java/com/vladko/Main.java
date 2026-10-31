package com.vladko;

public class Main {
    public static void main(String[] args) {
        String testString = "J@va the be$t!123";
        System.out.println("Input: " + testString);
        System.out.println("Output: " + revertString(testString));

    }

    public static String revertString(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            } else if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }

            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

