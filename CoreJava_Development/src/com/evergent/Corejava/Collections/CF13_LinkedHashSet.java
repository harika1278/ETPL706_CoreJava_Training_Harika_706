package com.evergent.Corejava.Collections;
import java.util.LinkedHashSet;
public class CF13_LinkedHashSet {

	public static void main(String[] args) {
		// Creating a linkedHashSet
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		// Adding elements to the LinkedHashSet
		linkedHashSet.add("Apple");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Orange");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Grapes");
		
		// Displaying the LinkedHashSet
		System.out.println("LinkedHashSet : "+linkedHashSet);
		
		//Iterating through the LinkedHashSet
		System.out.println("Iterating over LinkedHashSet : ");
		for(String fruit : linkedHashSet) {
			System.out.println(fruit);
		}
		
		// Checking it the set contains an elements : Return true if this set contains the specified element
		System.out.println("Contains Mango : "+linkedHashSet.contains("Mango"));
		
		// Removing an element 
		linkedHashSet.remove("Banana");
		System.out.println("After removing 'Banana' : "+linkedHashSet);
		
		// Checking the size of the LinkedHashSet
		System.out.println("Size of LinkedHashSet : "+linkedHashSet.size());
		
		// Clearing the LinkedHashSet
		linkedHashSet.clear();
		System.out.println("After clearing : "+linkedHashSet);
	}

	

}
