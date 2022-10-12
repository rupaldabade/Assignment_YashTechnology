package com.collection.program;

import java.util.ArrayList;
//2) WAP to store all Collection elements in Array and perform the Binary Search
public class BinarySearch {
    public static void main(String args[])
    {
        ArrayList<Integer> arr = new ArrayList<Integer>();
       
        arr.add(5);
        arr.add(0);
        arr.add(15);
        arr.add(120);
        arr.add(25);
        arr.add(130);
        arr.add(35);
       
        // Print elements of array list
        System.out.println("The elements of the arraylist are: "+arr);
        
        int arrSize = arr.size();
        int[] array = new int[arrSize];
        
        for(int i=0 ; i<arrSize ; i++) {
        	array[i] =arr.get(i);
        }
        
        // Function call
        sortBinaryArray(array, arrSize);
 
        for (int i = 0; i < arrSize; i++)
            System.out.print(array[i] + " ");
    }

	private static void sortBinaryArray(int[] a, int n) {
		// TODO Auto-generated method stub
		int j = -1;
        for (int i = 0; i < n; i++) {
 
            // if number is smaller than 1
            // then swap it with j-th number
            if (a[i] < 1) {
                j++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
	}
	
}
