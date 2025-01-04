package com.basic.level.course.exercises;

import java.util.Scanner;

/*
7.	Task 7: Fibonacci Sequence and Sum of Elements
○	Description: Take a number from the user and write a program that generates
    the Fibonacci sequence up to that number and calculates the sum of the elements in the sequence.
○	Input: An integer (e.g., 7).
○	Output: The Fibonacci sequence and the sum of the elements (e.g., "Fibonacci: [0, 1, 1, 2, 3, 5, 8, 13], Sum: 33").

 */
public class FibonacciSequenceAndSumOfElements {
    public static int fibonacciSequence(int n) {
        if (n <= 1){
            return n;
        }
        else if (n == 2){
            return 1;
        }
        else
            return fibonacciSequence(n - 1) + fibonacciSequence(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        System.out.print("Fibonacci: [");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSequence(i));
            if(i != n - 1) System.out.print(", ");

            sum += fibonacciSequence(i);
        }
        System.out.print("], Sum: " + sum);
    }
}
