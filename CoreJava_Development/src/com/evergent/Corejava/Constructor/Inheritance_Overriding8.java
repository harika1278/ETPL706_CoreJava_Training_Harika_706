package com.evergent.Corejava.Constructor;
class Animal{
	//Fields(Attributes)
	private String name;
	private int age;
	//Constructor
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	//Method(Behavior)
	public void displayInfo() {
		System.out.println("Name : "+name);
		System.out.println("Age : "+age);
	}
}
//subclass (Inheritance)
class Dog extends Animal{
	private String breed;
	public Dog(String name, int age, String breed) {
		super(name,age);
		this.breed = breed;
	}
	// method overriding(polymorphism)
	public void displayInfo() {
		super.displayInfo();
		System.out.println("Breed : "+breed);
	}
}
public class Inheritance_Overriding8 {

	public static void main(String[] args) {
		Dog dog = new Dog("Buddy",5,"golden");
		dog.displayInfo();
	}
}
