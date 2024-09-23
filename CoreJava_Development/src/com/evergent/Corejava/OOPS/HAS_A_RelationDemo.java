package com.evergent.Corejava.OOPS;

public class HAS_A_RelationDemo {
	
	public void show() {
		System.out.println("Show Method");
	}
	public static void main(String[] args) {
		HAS_A_RelationDemo has = new HAS_A_RelationDemo();
		has.show();
		// HAS_A_Relation
		Person person = new Person();
		person.display();
	}

}
