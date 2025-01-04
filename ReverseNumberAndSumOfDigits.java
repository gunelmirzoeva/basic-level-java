package com.basic.level.course.exercises;

import java.util.Scanner;

/*
10.	Task 10: Reverse of a Number and Sum of its Digits
○	Description: Take a number from the user and write a program that calculates the reverse of
    the number and the sum of its digits.
○	Input: An integer (e.g., 1234).
○	Output: The reverse of the number and the sum of its digits (e.g., "Reversed: 4321, Sum of digits: 10").

 */
public class ReverseNumberAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        StringBuilder reversed = new StringBuilder();
        int sum = 0;
        for (int i = number.length() - 1; i >= 0; i--) {
            reversed.append(number.charAt(i));
            sum += number.charAt(i) - 48;
        }
        System.out.println("Reversed: " + reversed + ", Sum of digits: " + sum);
    }


}
