package com.evergent.Corejava.Collection.Map;
import java.util.Hashtable;

public class HashMapDemo1 {

	public static void main(String[] args) {
		Hashtable mymap = new Hashtable();
		mymap.put(100,"Ramesh");
		mymap.put(2000, "Bhanu");
		mymap.put(300, "Abbas");
		mymap.put(100, "Welcome");
		//mymap.put(null, "abc");
		//mymap.put(700, null);
		//mymap.put(null, "xyz");
		//mymap.put(600, null);
		System.out.println(mymap);
	}

}
