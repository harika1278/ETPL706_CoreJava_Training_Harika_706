package com.evergent.Corejava.Collections;
import java.util.ArrayList;
import java.util.Iterator;
public class CF10_ArrayList_Generics {

	public static void main(String[] args) {
		ArrayList<Integer> mylist = new ArrayList<Integer>();
		mylist.add(100);
		mylist.add(80);
		mylist.add(90);
		mylist.add(100);
		System.out.println(mylist);
		Iterator i = mylist.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
