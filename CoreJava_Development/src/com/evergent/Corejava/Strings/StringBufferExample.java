package com.evergent.Corejava.Strings;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println("Initial String : "+sb);
		//Append a String
		sb.append("World!");
		System.out.println("After append : "+sb);
		//Insert a string at a specific position
		sb.insert(6, "Beautiful");
		System.out.println("After Insert : "+sb);
		//Replace a Substring
		sb.replace(0, 5, "Hi");
		System.out.println("After replace : "+sb);
		//Delete a Substring
		sb.delete(0, 3);
		System.out.println("After delete : "+sb);
		//Reverse the String
		sb.reverse();
		System.out.println("After Reverse : "+sb);
		//Capacity And length
		System.out.println("Capacity : "+sb.capacity());
		System.out.println("Lenght : "+sb.length());
	}

}
