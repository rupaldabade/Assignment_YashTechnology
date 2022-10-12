package com.array.program;

/*12) WAP to sort array on the basis of unit place. For example we are having following numbers:-
10,2,3,41,12,13,19,81,9. Output will be 10,41,81,2,12,3,13,19,9.*/
public class UnitPlaceSorting {
	public static void main(String[] args) {        

		//Initialize array     
		int [] arr = new int [] {10,2,3,41,12,13,19,81,9};     
		int temp = 0;    

		//Displaying elements of original array    
		System.out.println("Elements of original array: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}    

		//Sort the array in ascending order    
		for (int i = 0; i < arr.length; i++) {     
			for (int j = i+1; j < arr.length; j++) {     
				if(arr[i]%10 > arr[j]%10) {  //for unit place mode 10  
					temp = arr[i];    
					arr[i] = arr[j];    
					arr[j] = temp;    
				}     
			}     
		}    

		System.out.println();    

		//Displaying elements of array after unit place sorting    
		System.out.println("Elements of array sorted in ascending order: ");    
		for (int i = 0; i < arr.length; i++) {     
			System.out.print(arr[i] + " ");    
		}    
	}    
}
