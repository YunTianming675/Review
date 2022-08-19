package com.part02;

import java.util.Arrays;

public class Code03 {
    public static void main(String[] args) {
        String str = "ANhuBbWloQp";
        char[] result = stringReverseSort(str);
        for (char c:result)
            System.out.println(c);
    }

    public static char[] stringReverseSort(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseChar = new char[charArray.length];

        Arrays.sort(charArray);
        for (int i = charArray.length-1; i >= 0; i--) {
            reverseChar[charArray.length-i-1] = charArray[i];
        }

        return reverseChar;
    }
}
