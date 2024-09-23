package com.evergent.Corejava.Collections;
import java.util.ArrayList;
public class CfF12_ArrayList_forEachObject {

	public static void main(String[] args) {
		ArrayList<Object> mylist = new ArrayList<>();
		mylist.add(100);
		mylist.add("Venu");
		mylist.add("Ramesh");
		mylist.add(45.5);
		for(Object o : mylist) {
			System.out.println(o);
		}
	}

}
