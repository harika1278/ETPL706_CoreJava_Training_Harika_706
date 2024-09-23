package com.evergent.Corejava.lambda;

interface Person3{
	abstract public void eat(String foodName);
}
public class Lmabda3Prog {

	public static void main(String[] args) {
		
		Person3 p3 = (name)-> {
			 {
				System.out.println("Drink.."+name);
			}
		};
		p3.eat("MIlk");
	}

}
