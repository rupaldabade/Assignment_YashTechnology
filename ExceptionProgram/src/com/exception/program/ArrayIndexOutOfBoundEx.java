package com.exception.program;

import java.util.Scanner;

public class ArrayIndexOutOfBoundEx {

	public static void main(String arg[]) {
		
		String[] nameArr = {"ram","sham","mohan","sohan","sita","gita","jai","jayesh","mira","shiva"};
		Scanner sc = new Scanner(System.in);
		System.out.println("Please provide list index-");
		int index = sc.nextInt();
		
		try {
			String retName = nameArr[index];
			System.out.println("Selected index name is - "+retName);
		} catch (Exception e) {
			System.out.println("Array Index Out Of Bounds Execption");
			e.printStackTrace();
		}
		
	}
}
