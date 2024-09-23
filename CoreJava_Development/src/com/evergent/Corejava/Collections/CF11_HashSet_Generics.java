package com.evergent.Corejava.Collections;
import java.util.HashSet;
import java.util.Iterator;
public class CF11_HashSet_Generics {

	public static void main(String[] args) {
		HashSet<String> mylist = new HashSet<String>();
		mylist.add("100");
		mylist.add("80");
		mylist.add("90");
		mylist.add("100");
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
