package oop_abstract;

public abstract class Page {
	
	//i cannot create object of abstract classes
	//can have abs + non abs mehods
	//no final keyword with abs method as someone has to implement
	//abstract key mandatory to write for abs method
	//if we have parameterized constructor in parent then it is mandatory to create default constructor
	//not mandatory to have atleat 1 abs method
	
	//only abs method =yes 100 abstaction
	//no abs method allowed=0%
	//both method allowed=partial
	
	//interface is 100percent abstraction
	
	public Page() {
		System.out.println("Page constructor");
	}
	
	public Page(int i) {
		System.out.println("Page constructor"+i);
	}
	
	public abstract void title();
	
	public abstract void url();
	
	public void timeOut() {
		System.out.println("timeout");
	}
	
	public final void displayLogo() {
		System.out.println("logo");
	}

}
