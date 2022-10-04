package com.string.program;

//program for sort string to ascending descending order 
//2) WAP to print the all alphabets of string in ascending and descending order.

public class Sorting {

	public static void main(String[] args) {

		String str = "Hello";
		char[] charArr = str.toLowerCase().toCharArray();
		System.out.println("Original String..."+str);
		System.out.println("ascendingOrder...."+ascendingOrder(charArr));
		System.out.println("descendingOrder...."+descendingOrder(charArr));

	}

	private static String ascendingOrder(char[] charArr) {//function for ascending order
		char temp;

		for(int i=0; i<charArr.length; i++) {
			for(int j=i+1; j<charArr.length; j++) {
				if(charArr[i]>charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		return toString(charArr);
	}

	//Convert charArray to String
	private static String toString(char[] charArr) {
		String string = new String(charArr);
		return string;
	}

	private static String descendingOrder(char[] charArr) {//function for descending order
		char temp;

		for(int i=0; i<charArr.length; i++) {
			for(int j=i+1; j<charArr.length; j++) {
				if(charArr[i]<charArr[j]) {
					temp = charArr[i];
					charArr[i] = charArr[j];
					charArr[j] = temp;
				}
			}
		}
		return toString(charArr);
	}
}
