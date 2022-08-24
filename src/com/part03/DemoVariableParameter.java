package com.part03;

public class DemoVariableParameter {
    public static void main(String[] args) {
        System.out.println(add(10,20,30));
    }

    public static int add(int...arr) {
        int sum = 0;

        for (int i:arr)
            sum += i;

        return sum;
    }
}
