package com.evergent.Corejava.lambda;

interface Person1{
	abstract public void eat();
}
public class Lmabda1Prog {

	public static void main(String[] args) {
		
		Person1 p1 = new Person1() {
			public void eat() {
				System.out.println("Eat..");
			}
		};
		p1.eat();
	}

}
