package com.part01;

import java.util.ArrayList;
import java.util.Random;

public class Code06 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            list.add(new Student("student" + random.nextInt(100), random.nextInt(100)));
        }
        System.out.println("Six student:");
        for (Student student:list) {
            System.out.println(student.getName() + ": " + student.getAge());
        }
    }
}
