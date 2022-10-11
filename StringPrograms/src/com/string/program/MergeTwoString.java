package com.string.program;

/*1) Create a program in which two string is input by the user and after that user will enter index in 
first string where we want to insert the second string and insert the second string at that index 
and create a new string*/
import java.util.Scanner;

public class MergeTwoString
{
	public static void main(final String[] args) {
		final Scanner sc = new Scanner(System.in);
		System.out.print("Enter first string- ");
		final String first = sc.next();
		System.out.print("Enter second string- ");
		final String second = sc.next();
		System.out.println("Second string start from index 1 to " + first.length() + " provide your index -");
		final int index = sc.nextInt();
		String newStr = "";
		final char[] firstChar = first.toCharArray();
		for (int i = 0; i < firstChar.length; ++i) {
			if (i == index) {
				newStr = String.valueOf(newStr) + second;
			}
			newStr = String.valueOf(newStr) + firstChar[i];
		}
		System.out.print("New creaded string- " + newStr);
	}
}