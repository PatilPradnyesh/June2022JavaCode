package javasessions;

public class CarType {
	
	String name;
	String colour;
	int price;
	static int wheels=4; //static keyboard as every car has only 4 wheels //static stored in CMA (common memory location)-metaspace
	//static applicable for class varible
	
	public static void main(String[] args) {
	
		CarType c1 = new CarType();
		c1.name="BMW";
		c1.colour="Black";
		c1.price=40;
		System.out.println(c1.name +" "+c1.colour+ " "+c1.price+" "+CarType.wheels);
		
		CarType c2 = new CarType();
		c2.name="Audi";
		c2.colour="White";
		c2.price=35;
		System.out.println(c2.name +" "+c2.colour+ " "+c2.price+" "+CarType.wheels);
		
		System.out.println(wheels);
		
		System.out.println(c1.wheels);
		
		//we can access static variable by
		//1)class name ---CarType.wheels
		//2)directly -----System.out.println(wheels);
		//3)with object ------System.out.println(c1.wheels);
		

	}

}
