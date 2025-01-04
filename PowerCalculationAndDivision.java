package com.basic.level.course.exercises;

import java.util.Scanner;

/*
6.	Task 6: Power Calculation and Division
○	Description: Take two numbers from the user: base and exponent.
    Write a program that calculates the power of the base raised to the exponent and divides the base by the exponent.
○	Input: Two integers, base and exponent (e.g., 2 and 3).
○	Output: The result of the power and the division (e.g., "Power: 8, Division: 0.67").

 */


public class PowerCalculationAndDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int power = (int) Math.pow(base, exponent);

        if (exponent == 0) {
            System.out.printf("Power: %d, Division: Cannot divide by zero%n", power);
        } else {
            double divisor = (double) base / exponent;
            System.out.printf("Power: %d, Division: %.2f", power, divisor);
        }
    }
}

