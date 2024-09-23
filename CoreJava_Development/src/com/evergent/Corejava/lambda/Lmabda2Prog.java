package com.evergent.Corejava.lambda;

interface Person2{
	abstract public void eat();
}
public class Lmabda2Prog {

	public static void main(String[] args) {
		
		Person2 p2 = ()-> {
			 {
				System.out.println("Eat..");
			}
		};
		p2.eat();
	}

}
