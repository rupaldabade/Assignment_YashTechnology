package com.string.program;

//3) WAP to remove all the vowels from the given string.
public class RemoveVowels {
	public static void main(String arg[]) {
		String str = "Hello";
		char[] charArr = str.toLowerCase().toCharArray();
		System.out.println("Original String..."+str);
		System.out.println("Remove Vowels...."+removeVowels(charArr));
	}

	private static String removeVowels(char[] charArr) {
		char[] vowels = {'a','e','i','o','u'};
		for(int i=0; i<charArr.length; i++) {
			for(int j=0; j<vowels.length; j++) {
				if(vowels[j]==charArr[i]) {
					charArr[i]= '\u0000';
				}
			}
		}
		String rtnStr = new String(charArr);
		return rtnStr;
	} 
}
