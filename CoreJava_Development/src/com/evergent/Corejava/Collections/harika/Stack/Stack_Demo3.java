package com.evergent.Corejava.Collections.harika.Stack;

// push() : adding values into stack
// pop() : remove values into stack
// peek() : last element value is showing

import java.util.Stack;

public class Stack_Demo3 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack.search("White"));
		System.out.println(mystack);
	}

}
