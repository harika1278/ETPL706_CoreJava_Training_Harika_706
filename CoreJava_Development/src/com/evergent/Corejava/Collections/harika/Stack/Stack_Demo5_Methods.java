package com.evergent.Corejava.Collections.harika.Stack;
import java.util.Stack;
public class Stack_Demo5_Methods {

	public static void main(String[] args) {
		// Creating a stack
		Stack<String> stack = new Stack<>();
		// Pushing elements onto the stack
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		stack.push("Date");
		// Displaying the stack
		System.out.println("Stack : "+stack);
		// Peeking at the top element
		String topElement = stack.peek();
		System.out.println("Top Element : "+topElement);
		//Popping an element from the stack
		String removedElement = stack.pop();
		System.out.println("Popped element : "+removedElement);
		//Display the stack after popping
		System.out.println("Stack after pop : "+stack);
		//Checking if the stack is Empty
		boolean isEmpty = stack.isEmpty();
		System.out.println("Is the stack empty ? "+isEmpty);
		// Searching for an element 
		int position = stack.search("Banana");
		System.out.println("Position of banana from top "+position);
		//Clearing the stack
		stack.clear();
		System.out.println("Stack after clearing");
	}

}
