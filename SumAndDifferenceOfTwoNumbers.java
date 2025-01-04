package com.basic.level.course.exercises;
import java.util.Scanner;
/*

1.	Task 1: Sum and Difference of Two Numbers
○	Description: Take two numbers from the user and write a
    program that calculates both the sum and the difference of these numbers.
○	Input: Two integers (e.g., 5 and 3).
○	Output: The sum and the difference of the numbers (e.g., "Sum: 8, Difference: 2").

 */
public class SumAndDifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int difference = Math.abs(num1 - num2);
        System.out.println("Sum: " + sum + ", Difference: " + difference);
    }
}
