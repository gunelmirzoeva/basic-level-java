package com.basic.level.course.exercises;
/*
9.	Task 9: Finding the Largest, Smallest, and Middle Number
○	Description: Take several numbers from the user and write a program that finds the largest,
    smallest, and middle number among them.
○	Input: A list of integers (e.g., [4, 9, 2]).
○	Output: The largest, smallest, and middle number (e.g., "Largest: 9, Smallest: 2, Middle: 4").

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestSmallestMiddleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        while (sc.hasNextInt()) {
            numbers.add(sc.nextInt());
        }

        if (numbers.size() < 3) {
            System.out.println("Please enter at least three numbers");
        } else {
            Collections.sort(numbers);
            int smallest = numbers.get(0);
            int largest = numbers.get(numbers.size() - 1);
            int middle = numbers.get(numbers.size() / 2);

            System.out.println("Largest: " + largest + ", Smallest: " + smallest + ", Middle: " + middle);
        }
    }
}

