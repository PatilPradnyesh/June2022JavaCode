package javasessions;

public class EmployeeType {
	// Constructor name is same as class name but function name can be anything
	// constructor can not return but fuction may or may not return
	// no void keyboard
	//constructor called when create object but object called by reference name
	//no static with constructor
	

	String name;
	int age;
	double salary;
	
	public void test() {
		
	}

	public EmployeeType() {

	}

	public EmployeeType(String name) {

	}

	public EmployeeType(String name, int age) {

	}

	public static void main(String[] args) {
	 
		EmployeeType et = new EmployeeType();//constructor called
		et.test();

	}

}
