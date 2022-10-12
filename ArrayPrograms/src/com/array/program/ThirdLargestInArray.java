package com.array.program;

//1 WAP to find third maximum number from list of numbers
public class ThirdLargestInArray {

	public static int getThirdLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		{  
			for (int j = i + 1; j < total; j++)   
			{  
				if (a[i] > a[j])   
				{  
					temp = a[i];  
					a[i] = a[j];  
					a[j] = temp;  
				}  
			}  
		}  
		return a[total-3];  
	}  
	public static void main(String args[]){  
		int a[]={10,2,95,6,73,2};  
		int b[]={44,6,99,87,303,2,155};  
		System.out.println("Third Largest: "+getThirdLargest(a,a.length));  
		System.out.println("Third Largest: "+getThirdLargest(b,b.length));  
	}
}
