package com.basic.level.course.exercises;

import java.util.Scanner;

/*
8.	Task 8: Finding Repeated Characters and Their Count
○	Description: Take a string from the user and write a program that finds the repeated characters in the string and their count.
○	Input: A string (e.g., "hello").
○	Output: The repeated characters and their count (e.g., "l: 2").

 */
public class FindingRepeatedCharactersAndTheirCount {
    public static int[] countOfCharacters(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[128];
        for(char c : chars) {
            freq[c]++;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] freq = countOfCharacters(s);
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] > 1) {
                System.out.println((char)i + ": " + freq[i]);
            }
        }

    }
}
