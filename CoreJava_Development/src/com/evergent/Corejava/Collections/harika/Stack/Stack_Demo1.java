package com.evergent.Corejava.Collections.harika.Stack;

// push() : adding values into stack
// pop() : remove values into stack

import java.util.Stack;

public class Stack_Demo1 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		System.out.println(mystack.pop());
		System.out.println(mystack.pop());
	}

}
