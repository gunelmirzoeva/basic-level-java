package com.basic.level.course.exercises;

import java.util.Scanner;

/*
2.	Task 2: Length of a String and Character Count
○	Description: Take a string from the user and write a program that
    returns the length of the string and the count of each character.
○	Input: A string (e.g., "hello").
○	Output: The length of the string and the count of each character (e.g., "Length: 5, h: 1, e: 1, l: 2, o: 1").

 */
public class LengthOfStringAndCharacterCount {
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
        System.out.print("Enter the string: ");
        String s = sc.nextLine();
        System.out.print("The length of the string is: " + s.length() + ", ");
        int [] freq = countOfCharacters(s);
        for(int i=0; i<freq.length; i++) {
            if(freq[i] > 0) {
                System.out.print((char)i + ": " + freq[i] + ", ");
            }
        }
    }
}
