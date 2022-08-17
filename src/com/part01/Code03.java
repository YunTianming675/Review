package com.part01;

import java.util.Scanner;

public class Code03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three number:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int temp = (n1 > n2 ? n1:n2);
        int max = (temp > n3 ? temp:n3);
        System.out.println("max = " + max);

        // or
        max = Math.max(Math.max(n1, n2), n3);
        System.out.println("max = " + max);
    }
}
