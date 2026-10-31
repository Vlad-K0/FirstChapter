package com.vladko;

public class RevertString {
    public String revertString(String s) {
        if (s.isEmpty()){
            return "";
        }
        if (s.length() == 1){
            return s;
        }

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
