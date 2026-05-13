package org.example;

import java.util.*;

public class MapExercise {

    public static void main(String[] args) {
        Map<String,Person> m = new HashMap<>();

        Person[] people={
                new Person("Bhanu","bhanu@gmail.com"),
                new Person("manu","manu@gmail.com")

        };
        for(Person k:people){
            m.put(k.getEmail(),k);
        }

        System.out.println(m.get("bhanu@gmail.com"));

        }






}
