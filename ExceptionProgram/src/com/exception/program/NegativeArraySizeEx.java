package com.exception.program;

import java.util.Scanner;

public class NegativeArraySizeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Provide array size - ");
		String str = sc.next();
		
		try {
			int[] arr =new int[Integer.parseInt(str)];
			System.out.println("Array generated successfully - "+arr.length);
		} catch (NumberFormatException nfe) {
            System.out.println("NumberFormat Exception: invalid input string");
        } catch (NegativeArraySizeException nase) {
            nase.printStackTrace();
            System.out.println("NegativeArraySize Exception: negative input string");
        }
		
		
	}

}
