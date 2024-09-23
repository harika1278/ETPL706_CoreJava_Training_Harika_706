package com.evergent.Corejava.Collections;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
import java.util.*;
public class CF6_ListIterator {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("ramu");
		list.add("ravi");
		list.add("balu");
		list.add("bhanu");
		ListIterator li = list.listIterator();
		li.add("Welcome");
		li.add("hello");
		while(li.hasNext()) {
			String s = (String)li.next();
			System.out.println(s);
			if(s.equals("balu"))
				li.remove();
		}
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
	}

}