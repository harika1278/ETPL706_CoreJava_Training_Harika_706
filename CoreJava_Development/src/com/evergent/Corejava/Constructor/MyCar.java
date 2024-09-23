package com.evergent.Corejava.Constructor;

class Car{
	String color;
	int maxSpeed;
	//Default Constructor
	Car(){
		color = "white";
		maxSpeed = 120;
	}
	//Parameterized Constructor
	Car(String color,int maxSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	void display() {
		System.out.println("Color : "+color);
		System.out.println("Max Speed : "+maxSpeed);
	}
}

public class MyCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car("red",150);
		car1.display();
		car2.display();
	}

}
