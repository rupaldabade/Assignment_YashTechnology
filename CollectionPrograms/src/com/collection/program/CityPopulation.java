package com.collection.program;

import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

/*6) WAP to store data in hashmap. Keys are the city name and values are the population. 
Now you have to sort the all elements (on the basis of city name ) in hashmap and 
print the detail.*/
public class CityPopulation {

	public static void main(String arg[]) {
		HashMap<String, String> hashmap = new HashMap<>();
		hashmap.put("Bhopal", "40C");
		hashmap.put("Indore", "41C");
		hashmap.put("Vidisha", "40C");
		hashmap.put("Khargone", "43C");
		hashmap.put("puna", "30C");
		
		System.out.println("Orignal hash map"+hashmap);
		
		System.out.println("Before Sorting");  
			// using for-each loop for iteration over Map.entrySet()
	        Set<Entry<String, String>> entries = hashmap.entrySet();
	       
	        for(Entry<String, String> entry : entries){
	        	System.out.println("City = " + entry.getKey() +
                        ", Population = " + entry.getValue());
	        }
		
		TreeMap<String, String> sorted = new TreeMap<>(hashmap);
        Set<Entry<String, String>> mappings = sorted.entrySet();
        
        System.out.println("HashMap after sorting by keys in ascending order ");
        for(Entry<String, String> mapping : mappings){
        	System.out.println("City = " + mapping.getKey() +
                    ", Population = " + mapping.getValue());
        }
	}
}
