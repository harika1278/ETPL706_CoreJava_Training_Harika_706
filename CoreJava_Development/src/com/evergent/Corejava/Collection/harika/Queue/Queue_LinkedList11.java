package com.evergent.Corejava.Collection.harika.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList11 {

	public static void main(String[] args) {
		Deque<String> ad = new LinkedList<>();
		ad.add("Banana");
		ad.addFirst("PineApple");
		ad.add("Watermelon");
		ad.addLast("papaya");
		ad.offerFirst("Kiwi");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.size());
		boolean t = ad.isEmpty();
		System.out.println(t);
		System.out.println(ad);
	}

}
