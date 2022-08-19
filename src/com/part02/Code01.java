package com.part02;

public class Code01 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        arrayToString(array);
    }

    public static void arrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length-1; i++) {
            str = str + "word" + array[i] + "#";
        }
        str = str + "word" + array[array.length-1] + "]";
        System.out.println(str);
    }
}
