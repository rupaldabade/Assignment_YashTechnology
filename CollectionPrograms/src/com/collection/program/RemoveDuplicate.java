package com.collection.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
/* AP to store elements in List and remove all duplicates value from it. (Numbers 
should be inserted). When duplicates are removed print all elements in ascending 
order.
4) WAP to store elements in List and remove all duplicates names of items. After 
duplicates are removed print all elements in descending order. 
*/
public class RemoveDuplicate {

	public static void main(String[] args) {
        ArrayList<Integer>
        list = new ArrayList<>(
            Arrays
                .asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

    // Print the Arraylist
    System.out.println("ArrayList with duplicates: "
                       + list);

    // Remove duplicates
    ArrayList<Integer>
        newList = removeDuplicates(list);

    // Print the ArrayList with duplicates removed
    System.out.println("ArrayList with duplicates removed: "
                       + newList);
    
    Collections.sort(newList);//sort function
 // Print the ArrayList in ascending
    System.out.println("ArrayList in ascending: "
                       + newList);
    
    Collections.reverse(newList);//sort function
    // Print the ArrayList in descending
    System.out.println("ArrayList in descending: "
                       + newList);
    }
	

    // Function to remove duplicates from an ArrayList
    public static <Integer> ArrayList<Integer> removeDuplicates(ArrayList<Integer> list)
    {
  
        // Create a new ArrayList
        ArrayList<Integer> newList = new ArrayList<Integer>();
  
        // Traverse through the first list
        for (Integer element : list) {
  
            // If this element is not present in newList
            // then add it
            if (!newList.contains(element)) {
  
                newList.add(element);
            }
        }
  
        // return the new list
        return newList;
    }

}
