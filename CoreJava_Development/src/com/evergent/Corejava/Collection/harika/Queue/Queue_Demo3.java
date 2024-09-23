package com.evergent.Corejava.Collection.harika.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

// Addition : offer(),add()
// Retrieval : peek() : shows Header Value
// Remove : poll,
public class Queue_Demo3 {

	public static void main(String[] args) {
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(8);
		pq.offer(2);
		pq.add(5);
		pq.add(9);
		pq.clear();
		System.out.println(pq.poll());
		//System.out.println(pq.remove());
	}

}
