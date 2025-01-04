package com.basic.level.course.exercises;

import java.util.Scanner;

/*
3.	Task 3: Sum of Odd and Even Numbers
○	Description: Take several numbers from the user and write
    a program that calculates the sum of odd and even numbers among them.
○	Input: A list of integers (e.g., [4, 7, 2, 9]).
○	Output: The sum of odd and even numbers (e.g., "Sum of odd numbers: 16, Sum of even numbers: 6").

 */
public class SumOfOddAndEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumOdd = 0, sumEven = 0;
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if (num % 2 != 0) {
                sumOdd += num;
            }
            else if (num % 2 == 0) {
                sumEven += num;
            }
        }

        System.out.println("Sum of odd numbers: " + sumOdd + ", Sum of even numbers: " + sumEven);
    }
}
