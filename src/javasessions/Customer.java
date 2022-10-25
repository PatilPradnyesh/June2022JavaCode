package javasessions;

public class Customer {
	String name;
	int age;
	String city;

	public static void main(String[] args) {
		
		Customer c1 = new Customer ();
		c1.name="Akshay";
		c1.age=22;
		c1.city="Aurangabad";
		
		Customer c2 = new Customer ();
		c2.name="Shubham";
		c2.age=23;
		c2.city="Jalgaon";
		
		Customer c3 = new Customer ();
		c3.name="Pranav";
		c3.age=24;
		c3.city="Nashik";
		
		Customer c4 = new Customer ();
		c4.name="Ankush";
		c4.age=23;
		c4.city="Moscow";
		
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Akshay,Shubham,pranav, Ankush
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");
		
		c1=c2;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Shubham,Shubham,pranav, Ankush
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");
		
		c2=c3;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Shubham,pranav,pranav, Ankush
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");
		
		c3=c4;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Shubham,pranav,Ankush, Ankush
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");
		
		c4=c1;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Shubham,pranav,Ankush, shubham
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");
		
		c3=c1;
		System.out.println(c1.name+" "+c1.age+" "+c1.city);    //Shubham,pranav,shubham, shubham
		System.out.println(c2.name+" "+c2.age+" "+c2.city);
		System.out.println(c3.name+" "+c3.age+" "+c3.city);
		System.out.println(c4.name+" "+c4.age+" "+c4.city);
		
		System.out.println("------------------------------");

	}

}
