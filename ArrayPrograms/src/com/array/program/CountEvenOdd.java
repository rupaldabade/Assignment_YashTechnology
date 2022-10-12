package com.array.program;

//5 An Array Contain different numbers you have to find how many are even, odd, perfect and prime 
public class CountEvenOdd {

    static void CountingEvenOdd(int arr[], int arr_size)
    {
        int even_count = 0;
        int odd_count = 0;
        int prime_count = 0, m=0;
 
        // loop to read all the values in
        // the array
        for (int i = 0; i < arr_size; i++) {
             
              // checking if a number is
            // completely divisible by 2
            if ((arr[i] & 1) == 1)
                odd_count++;
            else
                even_count++;
            
            m=arr[i]/2;//prime no function
            for(i=2;i<=m;i++){      
        	    if(arr[i]%i==0){ 
        	    	prime_count++;
        	    }      
        	   }
        }
 
        System.out.println("Number of even"
                           + " elements = " + even_count
                           + " Number of odd elements = "
                           + odd_count +" Number of prime elements = "+prime_count);
    }
    
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, 5, 6 };
        int n = arr.length;
           
          //Call fun
        CountingEvenOdd(arr, n);
    }
}

