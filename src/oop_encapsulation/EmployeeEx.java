package oop_encapsulation;

import java.util.Arrays;

public class EmployeeEx {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private char gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	/*public void getEmployeeInfo() {
		System.out.println("Employee Name is"+ " " +name);
		System.out.println("Employee Age is"+ " " +age);
		System.out.println("Employee Salary is"+ " " +salary);
		System.out.println("Employee Active yes "+ " " +isActive);
		System.out.println("Employee Gender is"+ " " +gender);
	}*/
	
	public Object getEmployeeInfo() {
		Object obj[]= {name,age,salary,isActive,gender}; 
		return Arrays.toString(obj);
	}
	
	

}
