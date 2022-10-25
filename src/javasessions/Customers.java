package javasessions;

public class Customers {

	String name;
	int age;
	String city;
	String mobile;// mobile,credit card no. store with string
	
	//create customer with different combination
	//no default values
	//method buiseness login
	//constructor never define buiseness logic

	public Customers(String name) {

		this.name = name;//this is to initialize class variable
	}

	public Customers(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Customers(String name, int age, String city) {

		this.name = name;
		this.age = age;
		this.city = city;
	}

	public Customers(String name, int age, String city, String mobile) {

		this.name = name;
		this.age = age;
		this.city = city;
		this.mobile = mobile;
	}

	public static void main(String[] args) {
		
		Customers cus=new Customers("Shubham");
		System.out.println(cus.name);
		
		
  
		Customers cus1 =new Customers("mahesh");
		
	}

}
