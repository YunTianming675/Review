package com.part01;

import java.util.ArrayList;
import java.util.Random;

public class Code05 {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(100));
        }
        System.out.println("Six Integer:");
        for (Integer i:list) {
            System.out.println(i);
        }
    }
}
