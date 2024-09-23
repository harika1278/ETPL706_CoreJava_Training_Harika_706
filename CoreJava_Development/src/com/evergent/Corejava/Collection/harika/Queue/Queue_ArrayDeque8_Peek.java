package com.evergent.Corejava.Collection.harika.Queue;

// AarrayDeque Follow : FIFO
/* Addition : offer(),offerFirst(),OfferLast(),add,
 * addFirst(),addLast(),
 * Retrieval : peek(),peekFirst(),peekLast()
 * Removal : poll(),pollFirst(),pollLast(),remove(),
 * removeFirst(),removeLast()
 */
import java.util.ArrayDeque;
public class Queue_ArrayDeque8_Peek {

	public static void main(String[] args) {
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.add("Banana");
		ad.addFirst("PineApple");
		ad.add("Watermelon");
		ad.addLast("papaya");
		ad.offerFirst("Kiwi");
		ad.offerLast("Mango");
		System.out.println(ad);
		System.out.println(ad.poll());
		System.out.println(ad.peekLast());
		System.out.println(ad.peekFirst());
	}

}
