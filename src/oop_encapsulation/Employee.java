package oop_encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private boolean isPerm;
	
	Employee(String name,int age,boolean isPerm){
		this.name=name;
		this.age=age;
		this.isPerm=isPerm;
		
		
	}
	
	//getter and setter
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isPerm() {
		return isPerm;
	}

	public void setPerm(boolean isPerm) {
		this.isPerm = isPerm;
	}

	
}
