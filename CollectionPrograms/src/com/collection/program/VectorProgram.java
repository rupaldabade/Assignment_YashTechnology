package com.collection.program;
import java.util.*;  
//) WAP to store data related to item in Vector and after that sort the data. 
public class VectorProgram {
 
	public static void main(String arr[]) {
        
		Vector<String> mammals = new Vector();

        // Using the add() method
        mammals.add("Dog");
        mammals.add("Horse");
        mammals.add("Cat");
        System.out.println("Vector: " + mammals);

        // vector sort
        Collections.sort(mammals);
        System.out.println("Sorted Vector: " + mammals);
    }
	
}
