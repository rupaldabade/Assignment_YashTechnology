package com.array.program;

import java.util.Arrays;
/*6) Suppose that you are having an array of size N. now your task is to sort the half array that is 
from 0 to N/2 in ascending order and N/2+1 to N in descending order*/
public class FirstAscendingDescending {
	static void printOrder(int[] arr, int n)
	{
		// sorting the array
		Arrays.sort(arr);

		// printing first half in ascending order
		for (int i = 0; i < n / 2; i++)
			System.out.print(arr[i]+" ");

		// printing second half in descending order
		for (int j = n - 1; j >= n / 2; j--)
			System.out.print(arr[j]+" ");

	}

	public static void main(String[] args)
	{
		int[] arr = { 5, 4, 6, 2, 1, 3, 8, 9, 7 };
		int n = arr.length;
		printOrder(arr, n);

	}
}
