package com.evergent.Corejava.Collection.harika.Queue;

import java.util.Deque;
import java.util.LinkedList;

public class Queue_LinkedList10 {

	public static void main(String[] args) {
		Deque<String> q1 = new LinkedList<>();
		q1.add("Ravi");
		q1.add("Bhanu");
		q1.add("Shankar");
		q1.add("Chandu");
		System.out.println(q1);
		System.out.println(q1.poll());
	}

}
