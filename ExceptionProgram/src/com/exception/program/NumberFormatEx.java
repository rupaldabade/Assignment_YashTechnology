package com.exception.program;

import java.util.Scanner;

public class NumberFormatEx {

	public static void main(String[] args) {
		
		try {
			  
            Scanner sc= new Scanner(System.in); 
            System.out.print("Enter a string- ");  
    		String str= sc.next();
            // returns the double value
            // represented by the string argument
            double val = Double.parseDouble(str);
  
            // prints the double value
            System.out.println("Value = " + val);
        }
        catch (Exception e) {
        	System.out.println("Number Format Exeption.");
            System.out.println("Exception: " + e);
        }

	}

}
