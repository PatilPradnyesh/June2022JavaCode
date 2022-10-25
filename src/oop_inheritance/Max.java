package oop_inheritance;

public class Max extends Hospital{

	@Override
	public void doctor() {
		System.out.println("Max------ear, nose doctor");
	}
	
	@Override
	public void facilities() {
		System.out.println("Max------facilities");
	}
	
	public void experieceDoctor() {
		System.out.println("true");
	}
}
