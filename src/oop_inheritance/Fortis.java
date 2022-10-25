package oop_inheritance;

public class Fortis extends Hospital{

	@Override
	public void doctor() {
		System.out.println("Fortis------ Heart doctor");
	}
	
	@Override
	public void facilities() {
		System.out.println("Fortis------operation,facilities");
	}
	
	public void mediClaim() {
		System.out.println("Fortis------mediClaim");
	}
}
