package com.basic.level.course.exercises;

import java.util.Scanner;

/*
4.	Task 4: Factorial Calculation and Sum of Numbers
○	Description: Take a number from the user and write
    a program that calculates the factorial (n!) of the
    number and the sum of the number and all numbers less than it.
○	Input: An integer (e.g., 5).
○	Output: The factorial and the sum of the numbers (e.g., "Factorial: 120, Sum: 15").

 */
public class FactorialCalculationAndSumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        int sum = number * (number + 1) / 2;
        System.out.println("Factorial: " + factorial + ", Sum: " + sum);
    }
}
