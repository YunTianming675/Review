package com.part01;

import java.util.Random;
import java.util.Scanner;

public class Code04 {
    public static void main(String[] args) {
        Random random = new Random();
        int n1 = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input your guest:");
        int guess = scanner.nextInt();
        while (guess != n1) {
            if (guess < n1)
                System.out.println("guess less then n1");
            else
                System.out.println("guess bigger then n1");
            System.out.println("Input your next guest:");
            guess = scanner.nextInt();
        }
        System.out.println("You get it!");
    }
}
