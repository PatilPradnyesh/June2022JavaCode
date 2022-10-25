package oop_inheritance;

public class Apollo extends Hospital {

	@Override
	public void doctor() {
		System.out.println("Apollo------ Skin care doctor");
	}
	
	@Override
	public void facilities() {
		System.out.println("Apollo------ambulance, operation, canteen , medical facilities");
	}
	
	public void premiumWard() {
		System.out.println("premiumWard");
	} 
	
}
