package javasessions;

public class Car {//define variables in class
	String name;
	String Colour;
	int price;
	boolean isAutomatic;

	public static void main(String[] args) {
		
		Car c1=new Car();  //Creating new object //RHS side is object anD c1 is reference name
		c1.name="Bmw";
		c1.Colour="Black";
		c1.price=200000;
		c1.isAutomatic=false;
		
		System.out.println(c1.name);
		
		Car c2= new Car();
		System.out.println(c2.name);//null
		System.out.println(c2.isAutomatic);//false

		//No reference object
		new Car();
		new Car().Colour="black";
		new Car().name="bmw";
		
		//This is creating unnecessary object so always take reference name
		
		//null reference object
		Car t1= new Car();
		t1= null;
		//t1.name="BMW";
		//System.out.println(t1.name);//null pointer exception
		//System.out.println(t1);
		
	}

}
