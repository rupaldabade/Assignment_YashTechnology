package com.yash.junit;

public class Program4 {
	 public int sumOfDigitFromExpression(String s) {
    	 int sum = 0;
    	 for(int i=0; i<s.length(); i+=2) {
    		 char temp = s.charAt(i);
			        int b = Integer.parseInt(String.valueOf(temp));
			        sum=sum+b;
    	 }
    	 return sum;
     }
}
