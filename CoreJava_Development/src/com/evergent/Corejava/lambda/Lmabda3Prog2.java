package com.evergent.Corejava.lambda;

interface Person3a{
	abstract public void eat(String foodName);
}
public class Lmabda3Prog2 {

	public static void main(String[] args) {
		
		Person3a p3 = name -> {
			 {
				System.out.println("Drink.."+name);
			}
		};
		p3.eat("MIlk");
	}

}
