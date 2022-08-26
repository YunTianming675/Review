package com.part03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollections {
    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        list01.add(1);
        list01.add(3);
        list01.add(2);
        System.out.println(list01);

        Collections.sort(list01, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                // return integer - t1; // Ascending order
                return t1 - integer; // Descending order
            }
        });
        System.out.println(list01);
    }
}
