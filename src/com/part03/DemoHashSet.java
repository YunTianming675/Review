package com.part03;

import java.util.HashSet;

public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<Person> hashSet = new HashSet<>();
        Person person01 = new Person("Ate", 18);
        Person person02 = new Person("Ate", 18);
        Person person03 = new Person("Tku", 18);

        hashSet.add(person01);
        hashSet.add(person02);
        hashSet.add(person03);
        System.out.println(hashSet);
    }
}
