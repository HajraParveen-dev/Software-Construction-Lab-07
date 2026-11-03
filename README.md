# Lab 07 – Construction for Reuse: Interfaces, Generics, and Contracts

## Software Construction and Development

**Student Name:** Hajra Parveen  
**Registration No:** 24ABSWE0029  
**Department:** Software Engineering  
**Semester:** 5th Semester  
**University:** UET Abbottabad Campus  
**Instructor:** Engr. Rizwan Shah

## 1. Introduction

This project contains the practical implementation of Lab 07 for the Software Construction and Development course. It focuses on using Java programming concepts to develop reusable and flexible software components.

The practical is divided into four tasks. These tasks cover payment processing through interfaces, generic data storage, the Liskov Substitution Principle, and sorting student records using Comparable and Comparator.

The complete project was developed in Apache NetBeans IDE as a Maven Java project.

## 2. Objectives

- Practice interface-based programming.
- Understand composition and dependency injection.
- Create generic classes for different data types.
- Apply type safety in Java.
- Understand the Liskov Substitution Principle.
- Sort objects using Comparable and Comparator.
- Develop organized and reusable Java code.

## 3. Software and Technologies

- Java Programming Language
- Apache NetBeans IDE
- Maven Project
- Java Interfaces
- Java Generics
- ArrayList and Collections Framework

## 4. Task Implementation

### Task 1 – Payment Processing Through Interfaces

**Objective:** To implement multiple payment options using a common interface.

**Implementation:** A `PaymentMethod` interface was created with a `pay()` method. The CreditCardPayment and JazzCashPayment classes implement this interface. The EcommerceCart class receives a payment object through its constructor and uses it during checkout.

**Files:**
- PaymentMethod.java
- CreditCardPayment.java
- JazzCashPayment.java
- EcommerceCart.java
- Task1Main.java

**Result:** Both payment options were executed successfully, and the program displayed order confirmation messages.

### Task 2 – Generic DataBox

**Objective:** To understand how a generic class can be used to store values of different data types.

**Implementation:** A generic class named `DataBox<T>` was developed with a constructor, private variable, and getter method. Separate objects were created to store a student name and student ID.

**Files:**
- DataBox.java
- Task2Main.java

**Result:** Both stored values were retrieved and displayed successfully.

### Task 3 – Liskov Substitution Principle

**Objective:** To demonstrate an inheritance problem and improve the design using a common interface.

**Implementation:** Rectangle and Square classes were created to demonstrate the LSP problem. The program checks whether the dimensions assigned to a Square are equal. An exception occurs when unequal dimensions are assigned through a Rectangle reference.

The design was then improved by creating a Shape interface. RectangleShape and SquareShape implement this interface and calculate their areas separately.

**Files:**
- Rectangle.java
- Square.java
- Shape.java
- RectangleShape.java
- SquareShape.java
- Task3Main.java

**Result:** The original design problem was demonstrated, and the improved shape classes produced the correct area calculations.

### Task 4 – Comparable and Comparator

**Objective:** To arrange student objects according to different sorting conditions.

**Implementation:** The Student class implements Comparable to arrange records by roll number in ascending order. The CgpaComparator class implements Comparator to arrange students by CGPA in descending order.

Three student objects were stored in an ArrayList and sorted using both methods.

**Files:**
- Student.java
- CgpaComparator.java
- Task4Main.java

**Result:** Both sorting operations executed successfully and displayed student records in the required order.

## 5. Project Structure

```text
Lab07/
│
├── Source Packages/
│   └── com.mycompany.lab07/
│       ├── CgpaComparator.java
│       ├── CreditCardPayment.java
│       ├── DataBox.java
│       ├── EcommerceCart.java
│       ├── JazzCashPayment.java
│       ├── Main.java
│       ├── PaymentMethod.java
│       ├── Rectangle.java
│       ├── RectangleShape.java
│       ├── Shape.java
│       ├── Square.java
│       ├── SquareShape.java
│       ├── Student.java
│       ├── Task1Main.java
│       ├── Task2Main.java
│       ├── Task3Main.java
│       └── Task4Main.java
│
├── Test Packages/
├── Dependencies/
├── Java Dependencies/
└── Project Files/
```

## 6. How to Run

1. Open Apache NetBeans IDE.
2. Select Open Project.
3. Choose the Lab07 Maven project.
4. Expand Source Packages.
5. Open the `com.mycompany.lab07` package.
6. Build the project.
7. Run the required task main class.

### Individual Task Execution

| File | Description |
|---|---|
| Task1Main.java | Executes the payment system |
| Task2Main.java | Executes the generic DataBox |
| Task3Main.java | Executes the LSP demonstration |
| Task4Main.java | Executes student sorting |

The `Main.java` class can also execute all four tasks together.

## 7. Expected Results

- Credit Card and JazzCash payments work through the common interface.
- DataBox stores different data types.
- The LSP problem is demonstrated and improved using a Shape interface.
- Student records are sorted by roll number.
- Student records are also sorted by CGPA in descending order.

## 8. Conclusion

This practical provided experience with important Java software construction concepts. The four tasks demonstrated how interfaces, generics, inheritance principles, and sorting interfaces can be used to develop reusable programs. All tasks were implemented and tested in Apache NetBeans IDE.

## 9. Reflection

By completing this lab, I practiced different techniques for organizing Java programs. I learned how to connect multiple classes through interfaces, store different values using generics, and select suitable class relationships. I also gained experience in sorting objects through two different Java interfaces. This practical helped strengthen my understanding of object-oriented programming and reusable software design.
