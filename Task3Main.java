package com.mycompany.lab07;

public class Task3Main {

    public static void main(String[] args) {

        System.out.println("===== TASK 3: LSP =====");

        // Original problematic design
        Rectangle rectangle = new Square();

        try {

            rectangle.setDimensions(5, 10);

            System.out.println(
                    "Rectangle Area: " + rectangle.getArea()
            );

        } catch (IllegalArgumentException e) {

            System.out.println(
                    "LSP Problem: " + e.getMessage()
            );

        }

        // Corrected design
        Shape rectangleShape = new RectangleShape(5, 10);

        Shape squareShape = new SquareShape(5);

        System.out.println(
                "Fixed Rectangle Area: "
                + rectangleShape.getArea()
        );

        System.out.println(
                "Fixed Square Area: "
                + squareShape.getArea()
        );

    }
}