package com.basic.level.course.exercises;

import java.util.Scanner;

/*
5.	Task 5: Arithmetic Mean and Count of Numbers
○	Description: Take several numbers from the user and write
    a program that calculates the arithmetic mean and the count of the numbers.
○	Input: A list of integers (e.g., [4, 8, 6]).
○	Output: The arithmetic mean and the count of the numbers (e.g., "Average: 6.0, Count: 3").

 */
public class ArithmeticMeanAndCountOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            sum += a;
            count++;
        }
        double average = sum / count;
        System.out.println("Average: " + average + ", Count: " + count);
    }
}
