package com.evergent.Corejava.Collections.harika.Stack;

//isEmpty : Check if the stack is empty
//clear : to remove all stack elements

import java.util.Stack;

public class Stack_Demo4 {

	public static void main(String[] args) {
		Stack mystack = new Stack();
		mystack.push("Red");
		mystack.push("Black");
		mystack.push("White");
		System.out.println(mystack);
		mystack.clear();
		boolean b = mystack.isEmpty();
		System.out.println(b);
		System.out.println(mystack);
	}

}
