package com.mycompany.lab07;

public class Task2Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 2: GENERICS =====");

        // String DataBox
        DataBox<String> nameBox =
                new DataBox<>("Hajra Parveen");

        // Integer DataBox
        DataBox<Integer> idBox =
                new DataBox<>(12345);

        System.out.println(
                "Student Name: " + nameBox.getValue()
        );

        System.out.println(
                "Student ID: " + idBox.getValue()
        );

    }
}