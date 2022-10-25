package oop_inheritance;

public class Bmw extends Car {
	
	//method overriding
	//we can do with same method in parent and child class
	//with1) same name
	//2)same number of parameter and same sequence
	//3)same return type
	
	@Override
	public void start() {
		System.out.println("Bmw-------start");
	}
	
	public void autoParking() {
		System.out.println("BMw---------Autoparking");
	}

}
