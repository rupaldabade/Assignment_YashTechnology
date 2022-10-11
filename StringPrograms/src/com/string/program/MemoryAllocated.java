package com.string.program;

/* 6) WAP to demonstrate how memory is allocated to string objects in memory heap and string 
constant pool.
 */
public class MemoryAllocated {

	public static void main(String args[]) {
		// created in String Pool
		String str1 = "Hello";
		String str2 = "Ram";
		String str3 = "Hello";

		// created in Java heap memory 
		String str4 = new String("Hello");
		String str5 = new String("Ram");

		// false
		System.out.println(str1 == str4);

		// false
		System.out.println(str2 == str5);

		// true
		System.out.println(str1 == str3);
	}

}
