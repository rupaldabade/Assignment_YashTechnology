package com.string.program;

//4) WAP to print the number of alphabets repeated in the given string.

public class RepeatedAlphabets
{
    public static void main(final String[] args) {
        final String str = "Hello world";
        final char[] strArry = str.toCharArray();
        System.out.println("Duplicate characters in a given string: ");
        for (int i = 0; i < strArry.length; ++i) {
            int count = 1;
            for (int j = i + 1; j < strArry.length; ++j) {
                if (strArry[i] == strArry[j] && strArry[i] != ' ') {
                    ++count;
                    strArry[j] = '0';
                }
            }
            if (count > 1 && strArry[i] != '0') {
                System.out.println(strArry[i]);
            }
        }
    }
}
