package com.collection.program;

import java.util.ArrayList;
import java.util.Collections;
//1) WAP to sort Collection elements in ascending order.

public class AscendingOrder {

	public static void main(String[] args) {

		// ini an arrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(6);//add element in array
		list.add(9);
		list.add(1);
		list.add(0);
		list.add(35);
		list.add(50);
		list.add(0);
		System.out.println("Unsorted list-- "+list);
		Collections.sort(list);//sort function
		System.out.println("Sorted list-- "+list);
	}

}
