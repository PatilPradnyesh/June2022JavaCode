package oop_encapsulation;

public class TestEmployeeEx {

	public static void main(String[] args) {
		
		EmployeeEx e =new EmployeeEx();
		e.setName("SHubham");
		e.setAge(21);
		e.setSalary(3.6);
		e.setGender('M');
		e.setActive(true);
		
		System.out.println(e.getEmployeeInfo());
		
		
		
		

	}

}
