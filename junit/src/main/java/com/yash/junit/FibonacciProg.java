package com.yash.junit;

/**
 * Hello world!
 *
 */
public class FibonacciProg {
	
	public String fibonacciSeris(int num) {

		int n1 = 0;
		int n2 = 1;
		int n3 = 0;

		String str = n1 + " " + n2;

		for (int i = 0; i < num; i++) {
			n3 = n1 + n2;
			str += " " + n3;
			n1 = n2;
			n2 = n3;

		}

		return str;
	}

	public static void main(String[] args) {
		FibonacciProg fb = new FibonacciProg();
		fb.fibonacciSeris(10);
	}
}
