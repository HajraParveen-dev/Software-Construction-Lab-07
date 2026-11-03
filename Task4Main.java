package com.mycompany.lab07;

import java.util.ArrayList;
import java.util.Collections;

public class Task4Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 4: STUDENT SORTING =====");

        ArrayList<Student> students = new ArrayList<>();

        // Adding three students
        students.add(new Student(103, 3.50));

        students.add(new Student(101, 3.80));

        students.add(new Student(102, 3.20));

        // Sorting by Roll Number
        Collections.sort(students);

        System.out.println("\nSorted by Roll Number:");

        for (Student student : students) {

            System.out.println(student);

        }

        // Sorting by CGPA
        Collections.sort(students, new CgpaComparator());

        System.out.println("\nSorted by CGPA (Highest First):");

        for (Student student : students) {

            System.out.println(student);

        }

    }
}