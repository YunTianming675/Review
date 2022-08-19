package com.part02;

import java.util.Scanner;

public class Code02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a string:");
        String str = sc.next();
        int[] count = getCount(str);
        System.out.println("Capital character:" + count[0]);
        System.out.println("Lowercase character:" + count[1]);
        System.out.println("Number character:" + count[2]);
        System.out.println("Other character:" + count[3]);
    }

    public static int[] getCount(String str) {
        int[] count = {0, 0, 0, 0};

        char[] charArray = str.toCharArray();
        for (char c:charArray) {
            if (c >= 'A' && c <= 'Z')
                count[0]++;
            else if (c >= 'a' && c <= 'z')
                count[1]++;
            else if (c >= '1' && c <= '9')
                count[2]++;
            else
                count[3]++;
        }

        return count;
    }
}
