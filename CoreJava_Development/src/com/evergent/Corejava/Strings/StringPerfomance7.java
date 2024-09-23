package com.evergent.Corejava.Strings;

import java.util.Arrays;

public class StringPerfomance7 {

	public static void main(String[] args) {
		String name = "JavaTechnologies";
		System.out.println(Arrays.toString(name.toCharArray())); 
		System.out.println(name.indexOf('T'));	//4
		System.out.println("   JAVA   ".strip()); //JAVA
	}

}
